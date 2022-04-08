package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.dao.MyMapper;
import com.example.ruralrevitalization.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService{
    @Autowired
    private MyMapper myMapper;

    @Override
    public List<Question> findQuestionData() {
        List<Question> questions=myMapper.selectQuestiondata();
        return questions;
    }
}
