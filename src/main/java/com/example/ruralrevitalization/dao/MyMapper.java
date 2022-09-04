package com.example.ruralrevitalization.dao;

import com.example.ruralrevitalization.entity.County;
import com.example.ruralrevitalization.entity.MapData;

import com.example.ruralrevitalization.entity.Question;

import com.example.ruralrevitalization.entity.Platform;
import com.example.ruralrevitalization.entity.Story;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
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


    @Select("select * from question_source")
    List<Question> selectQuestiondata();

    @Select("select * from platform where type = \"${type}\"")
    List<Platform> selectPlatformData(@Param(value="type")String type);

    @Select("SELECT * FROM county WHERE Name=\"${name}\"")
    List<County> selectCountyIntroData(@Param(value="name")String name);



}
