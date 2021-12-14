package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.entity.County;

import java.io.IOException;
import java.util.List;

/**
 * 获得json
 *
 * @author 孙恬
 * @date 2021/11/27
 */
public interface getJsonService {
    /**
     * 让中国地理json
     *
     * @return {@code JSONObject}
     */
    String getChinaGeoJson() throws IOException;



}
