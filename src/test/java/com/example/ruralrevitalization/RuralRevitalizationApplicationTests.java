package com.example.ruralrevitalization;

import com.example.ruralrevitalization.entity.Story;
import com.example.ruralrevitalization.service.PovertyStoryServiceImp;
import com.example.ruralrevitalization.service.getCountyServiceImp;
import com.example.ruralrevitalization.service.getJsonServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
class RuralRevitalizationApplicationTests {

    @Autowired
    getJsonServiceImp getJsonService;
    @Autowired
    getCountyServiceImp getCountyService;
    @Autowired
    PovertyStoryServiceImp povertyStoryService;

//    @Test
//    void contextLoads() {
//    }
//    @Test
//    void getChinaGeoJson() throws IOException {
//        String  jsonString=getJsonService.getChinaGeoJson();
//    }
//
//    @Test
//    void testgetCityGDPData(){
//        List<List<Object>> countyYearDataList= getCountyService.getCityGDPPerCapiaData();
//        for(Object countyYearData:countyYearDataList){
//            System.out.println(countyYearData);
//        }
//        System.out.println(countyYearDataList);
//    }
//
//
//    @Test
//    void testfindPovertyData(){
//        List<Story> stories=povertyStoryService.findPovertyData();
////        System.out.println(stories);
//    }


}
