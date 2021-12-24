package com.example.ruralrevitalization.dao;

import com.example.ruralrevitalization.entity.County;
import com.example.ruralrevitalization.entity.MapData;
import com.example.ruralrevitalization.entity.Story;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MyMapper {
    @Select("select * from county")
    List<County> select();

    @Select("select * from mapdata where year = ${year}")
    List<MapData> selectMapdata(@Param(value = "year")int year);

    @Select("select * from storydata")
    List<Story> selectStorydata();


}
