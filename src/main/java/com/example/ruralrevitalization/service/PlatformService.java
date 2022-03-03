package com.example.ruralrevitalization.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * 减贫平台直达
 *
 * @author 孙恬
 * @date 2022/03/03
 */
public interface PlatformService {

    /**
     * 根据类型获取减贫平台的信息
     *
     * @return {@link List}<{@link JSONObject}>
     */
    List<JSONObject> getPlatformByType(String type);
}
