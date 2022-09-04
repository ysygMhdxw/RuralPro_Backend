package com.example.ruralrevitalization.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ruralrevitalization.dao.CountyYearDataMapper;
import com.example.ruralrevitalization.dao.MyMapper;
import com.example.ruralrevitalization.entity.County;
import com.example.ruralrevitalization.entity.CountyYearData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class getCountyServiceImp implements getCountyService {
    @Autowired
    private MyMapper myMapper;
    @Autowired
    private CountyYearDataMapper countyYearDataMapper;

    @Override
    public List<County> getCountyData() {

        return myMapper.select();
    }

    @Override
    public List<List<Object>> getCityGDPPerCapiaData() {
        List<List<Object>> ans =new ArrayList<>();
        QueryWrapper<CountyYearData> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("TownScale","City").select("Name","year","grossPerCapia").orderByAsc("year");

        List<CountyYearData> cityDatalist=countyYearDataMapper.selectList(queryWrapper);
        List<Object> namelist=new ArrayList<>();
        namelist.add("City");
        namelist.add("PerGross");
        namelist.add("Year");
        ans.add(namelist);
        for(CountyYearData countyYearData:cityDatalist){
            List<Object> thisCityData=new ArrayList<>();
            thisCityData.add(countyYearData.getName());
            thisCityData.add(countyYearData.getGrossPerCapia());
            thisCityData.add(countyYearData.getYear());
            ans.add(thisCityData);
        }
        return ans;
    }

    @Override
    public List<List<Object>> getCityGDPData() {
        List<List<Object>> ans = new ArrayList<>();
        QueryWrapper<CountyYearData> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("TownScale", "City").select("Name", "year", "gross").orderByAsc("year");

        List<CountyYearData> cityDatalist = countyYearDataMapper.selectList(queryWrapper);
        List<Object> namelist = new ArrayList<>();
        namelist.add("City");
        namelist.add("Gross");
        namelist.add("Year");
        ans.add(namelist);
        for (CountyYearData countyYearData : cityDatalist) {
            List<Object> thisCityData = new ArrayList<>();
            thisCityData.add(countyYearData.getName());
            thisCityData.add(countyYearData.getGross());
            thisCityData.add(countyYearData.getYear());
            ans.add(thisCityData);
        }
        return ans;
    }
}
