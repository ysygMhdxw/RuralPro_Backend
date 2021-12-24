package com.example.ruralrevitalization.service;

import com.example.ruralrevitalization.entity.Story;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PovertyStoryService {

    List<Story> findPovertyData();

}
