package com.example.ruralrevitalization.service;

import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.entity.County;

import java.util.List;

public interface CountyService {

    /**
     * 获取县的简介
     *
     * @param name 县名
     * @return {@code List<County>}
     */
    JSONObject getCountyIntroduction(String name);
}
