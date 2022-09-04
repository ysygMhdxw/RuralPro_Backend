package com.example.ruralrevitalization.controller.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.common.Result;
import com.example.ruralrevitalization.entity.County;
import com.example.ruralrevitalization.service.CountyServiceImp;
import com.example.ruralrevitalization.service.getCountyServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/County")
public class CountyDataController {
    @Autowired
    private getCountyServiceImp getCountyService;

//    @Autowired
//    private CountyServiceImp countyService;

    @GetMapping("/description")
    public Result<?> getCountyData() {
        List<County> counties = getCountyService.getCountyData();
        return Result.success(counties);

    }

    @GetMapping("/get/city/gdp/per/capia/data")
    public Result<?> getCityGDPPerCapiadata() {
        List<List<Object>> ans = getCountyService.getCityGDPPerCapiaData();
        return Result.success(ans);
    }

    @GetMapping("/get/city/gdp/data")
    public Result<?> getCityGDPdata() {
        List<List<Object>> ans = getCountyService.getCityGDPData();
        return Result.success(ans);
    }

//    @GetMapping("/get/county/description/\"{name}\"")
//    public Result<?> getCountyIntroduction(String name) {
//        JSONObject ans = countyService.getCountyIntroduction(name);
//        return Result.success(ans);
//    }

}
