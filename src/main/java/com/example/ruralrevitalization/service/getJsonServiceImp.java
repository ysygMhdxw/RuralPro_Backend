package com.example.ruralrevitalization.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Map;

@Service
public class getJsonServiceImp implements getJsonService{
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
}
