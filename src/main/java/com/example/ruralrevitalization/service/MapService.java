package com.example.ruralrevitalization.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MapService {
    /**
     * 获取所有贫困县的信息
     * 
     * @return {@code List<County>}
     */
    List<JSONObject> getMapdata(int year);
}
