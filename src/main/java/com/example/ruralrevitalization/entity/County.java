package com.example.ruralrevitalization.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("county")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class County {
   private String Name;
   private String Introduction;
}
