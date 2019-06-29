package com.suguang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/advertising")
public class AdvertisingController {

    @RequestMapping("/manager")
    public String advertisingManager(){
        return "advertising";
    }

    @RequestMapping("/indexImage")
    public String indexImage(){
        return "advertisingIndexImage";
    }

    @RequestMapping("/schoolImage")
    public String schoolImage(){
        return "advertisingSchoolImage";
    }
}
