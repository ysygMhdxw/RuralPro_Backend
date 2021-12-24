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


    /**
     * 获取所有贫困市级的人均生产GDP
     * @return {@code List<List<Object>>}
     */
    List<List<Object>> getCityGDPPerCapiaData();


    /**
     * 获取所有贫困市级的GDP总值
     *
     * @return {@code List<List<Object>>}
     */
    List<List<Object>>getCityGDPData();

}
