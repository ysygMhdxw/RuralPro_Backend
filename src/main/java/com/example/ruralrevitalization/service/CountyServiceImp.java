package com.example.ruralrevitalization.service;

import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.dao.MyMapper;
import com.example.ruralrevitalization.entity.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountyServiceImp implements CountyService {
    @Autowired
    private MyMapper myMapper;

    @Override
    public JSONObject getCountyIntroduction(String name) {
        List<County> countyIntroduction = myMapper.selectCountyIntroData(name);
        System.out.println(countyIntroduction);
        JSONObject jsonObject = new JSONObject();
        if (countyIntroduction.size() > 0) {
            jsonObject.put("name", countyIntroduction.get(0).getName());
            jsonObject.put("introduction", countyIntroduction.get(0).getIntroduction());
        }
        return jsonObject;

    }
}
