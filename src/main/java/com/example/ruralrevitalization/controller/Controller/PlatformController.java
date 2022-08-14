package com.example.ruralrevitalization.controller.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.common.Result;
import com.example.ruralrevitalization.service.PlatformServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/platform")
public class PlatformController {
    @Autowired
    private PlatformServiceImp platformService;

    @GetMapping("/{type}")
    public Result<?> getPlatformByType(@PathVariable String type){
        List<JSONObject> platform= platformService.getPlatformByType(type);
        return Result.success(platform);
    }


}

