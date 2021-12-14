package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.entity.County;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface getCountyService {

    /**
     * 获取所有贫困县的信息
     * @return {@code List<County>}
     */
    List<County> getCountyData();

}
