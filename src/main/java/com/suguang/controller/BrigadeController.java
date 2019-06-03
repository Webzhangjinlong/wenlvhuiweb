package com.suguang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/brigade")
public class BrigadeController {

    @RequestMapping("/list")
    public String brigadeList(){
        return "brigadeList";
    }

    @RequestMapping("/add")
    public String brigadeAdd(){
        return "brigadeAdd";
    }
}
