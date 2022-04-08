package com.example.ruralrevitalization.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("platform")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Platform {
    private String Webname;
    private String url;
    private String pic;
    private String introduction;
    private String type;
}
