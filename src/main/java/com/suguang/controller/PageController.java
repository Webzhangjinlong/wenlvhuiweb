package com.suguang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.suguang.domin.YmSchool;

import com.suguang.service.SchoolService;
import com.suguang.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by 11491 on 2019/5/28.
 * 分页操作
 */

@Controller
@RequestMapping("/school")
public class PageController {

    @Autowired
    SchoolService schoolService;

    @GetMapping("/get/jpaPage")
    public String getAllByPage(Model model,@RequestParam("page") int page, @RequestParam("size") int size){
        Paging schoolPage = schoolService.findAllSchoolByMypage(page, size);
        model.addAttribute("schoolList",schoolPage);
        //JSONObject jsonObject = (JSONObject) JSON.toJSON(schoolPage);
        return "schoolList";
    }


//    @GetMapping("/get/myPage")
//    public JSONObject getAllByMyPage(HttpServletRequest request, HttpServletResponse response, @RequestParam("page") int page, @RequestParam("size") int size){
//        Paging pageUtil = schoolService.findAllSchoolByMypage(page, size);
//        JSONObject jsonObject = (JSONObject) JSON.toJSON(pageUtil);
//        return jsonObject;
//    }

}
