package com.example.ruralrevitalization.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ruralrevitalization.entity.CountyYearData;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CountyYearDataMapper extends BaseMapper<CountyYearData> {

}
