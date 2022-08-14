package com.example.ruralrevitalization.controller.Controller;

import com.example.ruralrevitalization.common.Result;
import com.example.ruralrevitalization.entity.Question;
import com.example.ruralrevitalization.service.QuestionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Question")
public class QuestionDataController {

    @Autowired
    QuestionServiceImp questionService;

    @GetMapping("/get/question/data")
    public Result<?> getQuestionData(){
        List<Question> ans= questionService.findQuestionData();
        return Result.success(ans);
    }

}
