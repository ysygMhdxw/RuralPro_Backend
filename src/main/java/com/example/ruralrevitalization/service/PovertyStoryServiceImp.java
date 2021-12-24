package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.dao.MyMapper;
import com.example.ruralrevitalization.entity.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 扶贫故事板块
 *
 * @author 孙恬
 * @date 2021/12/23
 */
@Service
public class PovertyStoryServiceImp implements PovertyStoryService {
    @Autowired
    private MyMapper myMapper;

    @Override
    public List<Story> findPovertyData() {
        List<Story> stories=myMapper.selectStorydata();
        for(Story story:stories){
            if(story.getContent().length()>50){
                story.setContent(story.getContent().substring(0,50));
            }
        }
        return stories;
    }
}
