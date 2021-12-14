package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.dao.MyMapper;
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
    private MyMapper testMapper;
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
