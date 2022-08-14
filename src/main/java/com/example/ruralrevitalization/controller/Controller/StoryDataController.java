package com.example.ruralrevitalization.controller.Controller;

import com.example.ruralrevitalization.common.Result;
import com.example.ruralrevitalization.entity.Story;
import com.example.ruralrevitalization.service.PovertyStoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Story")
public class StoryDataController {

    @Autowired
    PovertyStoryServiceImp povertyStoryService;

    @GetMapping("/get/story/data")
    public Result<?> getStoryData() {
        List<Story> ans = povertyStoryService.findPovertyData();
        return Result.success(ans);
    }

}
