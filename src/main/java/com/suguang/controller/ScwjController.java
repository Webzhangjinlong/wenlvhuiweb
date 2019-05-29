package com.suguang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/scwj")
public class ScwjController {

    @RequestMapping("/demo")
    public String sc(){
        return "demo";
    }

    @RequestMapping("tpAdd")
    public String demo1(){
        return "demo";
    }
}
