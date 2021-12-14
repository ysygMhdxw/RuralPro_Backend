package com.example.ruralrevitalization.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONPOJOBuilder;
import com.example.ruralrevitalization.dao.MyMapper;
import com.example.ruralrevitalization.entity.MapData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MapServiceImp implements MapService{

    @Autowired
    private MyMapper myMapper;
    @Override
    public List<JSONObject> getMapdata(int year) {
        List<MapData> mapData =myMapper.selectMapdata(year);
        List<JSONObject> objects= new ArrayList<>();
        for(MapData mapData1:mapData){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name",mapData1.getProvince());
            jsonObject.put("value",mapData1.getNumber());
            objects.add(jsonObject);
        }
        return objects;
    }
}
