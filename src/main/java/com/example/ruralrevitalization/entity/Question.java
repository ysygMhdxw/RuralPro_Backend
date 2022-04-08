package com.example.ruralrevitalization.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("question_source")
@Data
public class Question {
    private String id;
    private String isChoice;
    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    private String description;
}
