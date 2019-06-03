package com.suguang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/space")
public class spaceController {

    @RequestMapping("/list")
    public String jumpSpaceList(){
        return "spaceList";
    }

    @RequestMapping("/add")
    public String jumpSpaceAdd(){
        return "spaceAdd";
    }

    @RequestMapping("/detailAdd")
    public String detailAdd(){
        return "spaceDetailAdd";
    }

    @RequestMapping("/policyAdd")
    public String policyAdd(){
        return "spacePolicyAdd";
    }
}
