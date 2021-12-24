package com.example.ruralrevitalization.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("storydata")
@AllArgsConstructor
@NoArgsConstructor
public class Story {
    private String name;
    private String url;
    private String content;
    private String picUrl;

}
