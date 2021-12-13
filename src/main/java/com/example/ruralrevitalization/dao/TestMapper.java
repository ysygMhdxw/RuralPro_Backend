package com.example.ruralrevitalization.dao;

import com.example.ruralrevitalization.entity.County;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    @Select("select * from county")
    List<County> select();
}
