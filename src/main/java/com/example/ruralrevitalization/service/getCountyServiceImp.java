package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.dao.MyMapper;
import com.example.ruralrevitalization.entity.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class getCountyServiceImp implements getCountyService {
    @Autowired
    private MyMapper myMapper;
    @Override
    public List<County> getCountyData() {
        return myMapper.select();
    }
}
