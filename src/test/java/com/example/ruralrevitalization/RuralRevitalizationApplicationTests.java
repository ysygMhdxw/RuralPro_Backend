package com.example.ruralrevitalization;

import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.service.getJsonServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class RuralRevitalizationApplicationTests {

    @Autowired
    getJsonServiceImp getJsonService;

    @Test
    void contextLoads() {
    }
    @Test
    void getChinaGeoJson() throws IOException {
        String  jsonString=getJsonService.getChinaGeoJson();
    }




}
