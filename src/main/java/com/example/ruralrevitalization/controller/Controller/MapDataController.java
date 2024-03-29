package com.example.ruralrevitalization.controller.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.common.Result;
import com.example.ruralrevitalization.service.MapServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/map")
public class MapDataController {

    @Autowired
    private MapServiceImp mapService;

    @GetMapping("/{year}")
    public Result<?> getMapDataByYear(
            @PathVariable int year
    ){
        List<JSONObject> mapData = mapService.getMapdata(year);
        return Result.success(mapData);
    }

}
