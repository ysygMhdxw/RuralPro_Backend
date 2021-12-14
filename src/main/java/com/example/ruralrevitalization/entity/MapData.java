package com.example.ruralrevitalization.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("mapdata")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapData {

    private String province;
    private int number;
    private int year;
}
