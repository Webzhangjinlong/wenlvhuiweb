package com.suguang.controller;

import com.suguang.dao.CraftsmanDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 11491 on 2019/5/29.
 */

@Controller
@RequestMapping("/craftsman")
public class CarftsmanController {
    @Autowired
    private CraftsmanDao craftsmanDao;

    @RequestMapping("/list")
    public String getfindList(){
        return "";
    }
}
