package com.example.ruralrevitalization.controller.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.common.Result;
import com.example.ruralrevitalization.service.getJsonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/ChinaGeo.json")
public class JsonController {
    @Autowired
    private getJsonServiceImp getJsonService;

    @GetMapping
    public Result<?> getChinaGeoJson() throws IOException {
        String jsonObject=getJsonService.getChinaGeoJson();
        return Result.success(jsonObject);
    }
}
