package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {

    List<Question> findQuestionData();

}