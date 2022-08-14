package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.dao.MyMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Map;

@Service
public class getJsonServiceImp implements getJsonService{

    @Autowired
    private MyMapper _testMapper;
    @Override
    public String getChinaGeoJson() throws IOException {
//        File file=new File("")
        ClassPathResource classPathResource = new ClassPathResource("static/assets/ChinaGeo.json");
        File file = classPathResource.getFile();

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString= objectMapper.readValue(file, Map.class).toString();

        System.out.println(objectMapper.readValue(file, Map.class).toString());
        return jsonString;
    }


}
