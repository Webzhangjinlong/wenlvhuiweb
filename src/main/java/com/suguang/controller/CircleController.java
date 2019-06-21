package com.suguang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/circle")
public class CircleController {

    @RequestMapping("/list")
    public String list(){
        return "circle";
    }

    @RequestMapping("/details")
    public String details(){
        return "circleDetails";
    }

    @RequestMapping("/policy")
    public String policy(){
        return "circlePolicyDetails";
    }
}
