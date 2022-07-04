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

import com.webank.ai.fate.serving.core.bean.Context;
import com.webank.ai.fate.serving.core.bean.Dict;
import com.webank.ai.fate.serving.core.bean.ReturnResult;
import com.webank.ai.fate.serving.core.constant.StatusCode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySingleTestFileAdapter extends AbstractSingleFeatureDataAdaptor {
    private static final Logger logger = LoggerFactory.getLogger(MySingleTestFileAdapter.class);

    @Override
    public void init() {

    }

    @Override
    public ReturnResult getData(Context context, Map<String, Object> featureIds) {
        ReturnResult returnResult = new ReturnResult();
        Map<String, Object> data = new HashMap<>();
        try {
            logger.info("testHost data path = {}", Paths.get(System.getProperty(Dict.PROPERTY_USER_DIR), "host_data.csv"));
            logger.info(featureIds.toString());
            List<String> lines = Files.readAllLines(Paths.get(System.getProperty(Dict.PROPERTY_USER_DIR), "host_data.csv"));

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
                logger.info("未找到数据!");
                throw new Exception();
            }
            else{
                logger.info(data.toString());
                returnResult.setData(data);
                returnResult.setRetcode(StatusCode.SUCCESS);
            }

        } catch (Exception ex) {
            logger.error(ex.getMessage());
            returnResult.setRetcode(StatusCode.HOST_FEATURE_ERROR);
        }
        return returnResult;
    }
}
