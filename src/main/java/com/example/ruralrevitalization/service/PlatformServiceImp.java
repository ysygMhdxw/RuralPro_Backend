package com.example.ruralrevitalization.service;

import com.alibaba.fastjson.JSONObject;
import com.example.ruralrevitalization.dao.MyMapper;
import com.example.ruralrevitalization.entity.Platform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlatformServiceImp implements PlatformService {
    @Autowired
    private MyMapper mapper;

    @Override
    public List<JSONObject> getPlatformByType(String type) {
        List<Platform> platforms=mapper.selectPlatformData(type);
        List<JSONObject>objects=new ArrayList<>();
        for(Platform platform:platforms){
            String intro=platform.getIntroduction().substring(0,100);
            platform.setIntroduction("  "+intro+"...");
           String str=JSONObject.toJSONString(platform);
           JSONObject obj=JSONObject.parseObject(str);
           objects.add(obj);
        }
        return objects;
    }
}
