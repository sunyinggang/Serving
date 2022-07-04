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
import com.webank.ai.fate.serving.core.adaptor.AdaptorDescriptor;
import com.webank.ai.fate.serving.core.bean.*;
import com.webank.ai.fate.serving.core.constant.StatusCode;
import com.webank.ai.fate.serving.core.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatchHttpAdapter extends AbstractBatchFeatureDataAdaptor {
    private static final Logger logger = LoggerFactory.getLogger(MyBatchHttpAdapter.class);
    private static final Map<String, Map<String, Object>> featureMaps = new HashMap<>();
    private final static String HTTP_ADAPTER_URL = MetaInfo.PROPERTY_HTTP_ADAPTER_URL;

    @Override
    public void init() {
        environment.getProperty("port");
    }

    @Override
    public BatchHostFeatureAdaptorResult getFeatures(Context context, List<BatchHostFederatedParams.SingleInferenceData> featureIdList) {
        BatchHostFeatureAdaptorResult batchHostFeatureAdaptorResult = new BatchHostFeatureAdaptorResult();
        HttpAdapterResponse responseResult ;
        try {
            Map<String, Object> serviceID = new HashMap<String,Object>();
            featureIdList.forEach(singleInferenceData -> {
                if (singleInferenceData.getSendToRemoteFeatureData().containsKey("service_id")) {
                    serviceID.put("service_id", singleInferenceData.getSendToRemoteFeatureData().get("service_id"));
                }
            });
            logger.info("------------------------serviceID-------------------");
            logger.info(String.valueOf(serviceID));
            logger.info("------------------------serviceID-------------------");
            responseResult = HttpAdapterClientPool.doPost(HTTP_ADAPTER_URL, serviceID);
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
                        batchHostFeatureAdaptorResult.setRetcode(StatusCode.FEATURE_DATA_ADAPTOR_ERROR);
                    } else {
                        try {
                            Map<String, Object> data_str = responseResult.getData();
                            String str = (String) data_str.get("file_string");
                            List<String> lines = Arrays.asList(str.split("\n"));
                            logger.info(String.valueOf(lines.size()));
                            String[] labels = StringUtils.split(lines.get(0), ",");
                            for (int i = 1; i < lines.size(); i++) {
                                String[] values = StringUtils.split(lines.get(i), ",");
                                Map<String, Object> data = new HashMap<>();
                                for (int j = 1; j < values.length; j++){
                                    data.put(labels[j], Double.valueOf(values[j]));
                                }
                                featureMaps.put(values[0], data);
                            }
                        } catch (Exception ex){
                            logger.error(ex.getMessage());
                        }
                        try {
                            featureIdList.forEach(singleInferenceData -> {
                                Map<Integer, BatchHostFeatureAdaptorResult.SingleBatchHostFeatureAdaptorResult> indexMap = batchHostFeatureAdaptorResult.getIndexResultMap();
                                BatchHostFeatureAdaptorResult.SingleBatchHostFeatureAdaptorResult singleBatchHostFeatureAdaptorResult = new BatchHostFeatureAdaptorResult.SingleBatchHostFeatureAdaptorResult();
                                if (singleInferenceData.getSendToRemoteFeatureData().containsKey("id")) {
                                    Map<String, Object> featureData = featureMaps.get(String.valueOf(singleInferenceData.getSendToRemoteFeatureData().get("id")));
                                    if (featureData != null) {
                                        Map clone = (Map) ((HashMap) featureData).clone();
                                        singleBatchHostFeatureAdaptorResult.setFeatures(clone);
                                        singleBatchHostFeatureAdaptorResult.setRetcode(StatusCode.SUCCESS);
                                    } else {
                                        logger.error("cant not find features for {}.", singleInferenceData.getSendToRemoteFeatureData().get(Dict.DEVICE_ID));
                                        singleBatchHostFeatureAdaptorResult.setRetcode(StatusCode.HOST_FEATURE_NOT_EXIST);
                                    }
                                    indexMap.put(singleInferenceData.getIndex(), singleBatchHostFeatureAdaptorResult);
                                }
                                logger.info(indexMap.toString());
                            });
                        } catch (Exception ex) {
                            logger.error(ex.getMessage());
                            batchHostFeatureAdaptorResult.setRetcode(StatusCode.HOST_FEATURE_ERROR);
                        }
                    }
                    break;
                case HttpAdapterResponseCodeEnum.ERROR_CODE:
                    batchHostFeatureAdaptorResult.setRetcode(StatusCode.FEATURE_DATA_ADAPTOR_ERROR);
                    break;

                default:
                    batchHostFeatureAdaptorResult.setRetcode(StatusCode.FEATURE_DATA_ADAPTOR_ERROR);
            }
            if (logger.isDebugEnabled()) {
                logger.debug("HttpAdapter result, {}", JsonUtil.object2Json(batchHostFeatureAdaptorResult));
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            batchHostFeatureAdaptorResult.setRetcode(StatusCode.SYSTEM_ERROR);
        }
        return batchHostFeatureAdaptorResult;
    }

    @Override
    public List<AdaptorDescriptor.ParamDescriptor> desc() {
        return null;
    }
}
