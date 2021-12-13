package com.example.ruralrevitalization.controller.Controller;

import com.example.ruralrevitalization.common.Result;
import com.example.ruralrevitalization.entity.County;
import com.example.ruralrevitalization.service.getJsonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/County")
public class CountyDataController {
    @Autowired
    private getJsonServiceImp getJsonService;

    @GetMapping("/description")
    public Result<?> getCountyData(){
        List<County> counties =getJsonService.getCountyData();
        return Result.success(counties);

    }
}
