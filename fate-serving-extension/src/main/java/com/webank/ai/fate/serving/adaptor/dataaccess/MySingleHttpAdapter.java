/*
 * Copyright 2019 The FATE Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.ai.fate.serving.adaptor.dataaccess;

import com.webank.ai.fate.serving.common.utils.HttpAdapterClientPool;
import com.webank.ai.fate.serving.core.bean.*;
import com.webank.ai.fate.serving.core.constant.StatusCode;
import com.webank.ai.fate.serving.core.utils.JsonUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySingleHttpAdapter extends AbstractSingleFeatureDataAdaptor {
    private static final Logger logger = LoggerFactory.getLogger(MySingleHttpAdapter.class);

    private final static String HTTP_ADAPTER_URL = MetaInfo.PROPERTY_HTTP_ADAPTER_URL;

    @Override
    public void init() {
        environment.getProperty("port");
    }

    @Override
    public ReturnResult getData(Context context, Map<String, Object> featureIds) {
        ReturnResult returnResult = new ReturnResult();
        HttpAdapterResponse responseResult ;
        try {
            //get data by http
            responseResult = HttpAdapterClientPool.doPost(HTTP_ADAPTER_URL, featureIds);
            logger.info("------------------------getCode-------------------");
            logger.info(String.valueOf(responseResult.getCode()));
            logger.info("------------------------getCode-------------------");
            logger.info("------------------------getData-------------------");
            logger.info(String.valueOf(responseResult.getData()));
            logger.info("------------------------getData-------------------");
            int responseCode = responseResult.getCode();
            switch (responseCode) {
                case HttpAdapterResponseCodeEnum.SUCCESS_CODE:
                    if (responseResult.getData() == null || responseResult.getData().size() == 0) {
                        returnResult.setRetcode(StatusCode.FEATURE_DATA_ADAPTOR_ERROR);
                        returnResult.setRetmsg("responseData is null ");
                    } else {
                        Map<String, Object> data = new HashMap<>();
                        Map<String, Object> data_str = responseResult.getData();
                        String str = (String) data_str.get("file_string");
                        List<String> lines = Arrays.asList(str.split("\n"));
                        String[] label = StringUtils.split(lines.get(0), ",");
                        int id = (Integer)featureIds.get("id");
                        logger.info(String.valueOf(id));
                        int flag = 0;
                        for (int i = 1; i < lines.size(); i++) {
                            String[] item = StringUtils.split(lines.get(i), ",");
                            if (Integer.parseInt(item[0]) == id) {
                                for (int j = 1; j < item.length; j++) {
                                    data.put(label[j], Double.parseDouble(item[j]));
                                }
                                flag = 1;
                                break;
                            }
                        }
                        if(flag == 0){
                            returnResult.setRetcode(StatusCode.HOST_FEATURE_NOT_EXIST);
                            returnResult.setRetmsg("host feature not exist");
                        }
                        else{
                            returnResult.setRetcode(StatusCode.SUCCESS);
                            returnResult.setData(data);
                        }
                    }
                    break;
                case HttpAdapterResponseCodeEnum.ERROR_CODE:
                    returnResult.setRetcode(StatusCode.FEATURE_DATA_ADAPTOR_ERROR);
                    returnResult.setRetmsg(" data not found ");
                    break;

                default:
                    returnResult.setRetcode(StatusCode.FEATURE_DATA_ADAPTOR_ERROR);
                    returnResult.setRetmsg("responseCode unknown ");
            }
            if (logger.isDebugEnabled()) {
                logger.debug("HttpAdapter result, {}", JsonUtil.object2Json(returnResult));
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            returnResult.setRetcode(StatusCode.SYSTEM_ERROR);
        }
        return returnResult;
    }

    public static void main(String[] args) {

    }
}
