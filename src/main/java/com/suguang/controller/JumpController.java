package com.suguang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 11491 on 2019/5/26.
 */

@Controller
@RequestMapping("/index")
public class JumpController {

    @RequestMapping("/top")
    public String top(){
        return "top";
    }

    @RequestMapping("/left")
    public String left(){
        return "left";
    }
}
