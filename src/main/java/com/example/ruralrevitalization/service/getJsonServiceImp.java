package com.example.ruralrevitalization.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.dao.TestMapper;
import com.example.ruralrevitalization.entity.County;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;
import java.util.Map;

@Service
public class getJsonServiceImp implements getJsonService{

    @Autowired
    private TestMapper testMapper;
    @Override
    public String getChinaGeoJson() throws IOException {
//        File file=new File("")
        ClassPathResource classPathResource = new ClassPathResource("static/assets/ChinaGeo.json");
        InputStream inputStream = classPathResource.getInputStream();
        File file = classPathResource.getFile();

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString= objectMapper.readValue(file, Map.class).toString();

        System.out.println(objectMapper.readValue(file, Map.class).toString());
        return jsonString;
    }

    @Override
    public List<County> getCountyData() {
        return testMapper.select();
    }
}
