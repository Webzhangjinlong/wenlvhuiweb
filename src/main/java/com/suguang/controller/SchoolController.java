package com.suguang.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.suguang.dao.SchoolDao;
import com.suguang.domin.YmSchool;

import com.suguang.service.SchoolService;
import com.suguang.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * Created by 11491 on 2019/5/28.
 * 分页操作
 */

@Controller
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;
    @Autowired
    SchoolDao schoolDao;

    //查询所有活动
    @GetMapping("/list")

    public String getAllByPage(Model model,@RequestParam("page") int page, @RequestParam("size") int size){
//        List<YmSchool> schoolPage = schoolDao.findAll();
        Paging schoolPage = schoolService.findAllSchoolByMypage(page, size);
       model.addAttribute("schoolList",schoolPage);
//        //JSONObject jsonObject = (JSONObject) JSON.toJSON(schoolPage);
        return "schoolList";
    }

    //删除学校信息
    @RequestMapping("/delete")
    public String schoolDelete(HttpServletRequest request){

        String id = request.getParameter("id");
        schoolDao.deleteById(Integer.parseInt(id));
        return "redirect:/school/list";
    }

    //学校没有添加修改页面，暂时没有写




//    @GetMapping("/get/myPage")
//    public JSONObject getAllByMyPage(HttpServletRequest request, HttpServletResponse response, @RequestParam("page") int page, @RequestParam("size") int size){
//        Paging pageUtil = schoolService.findAllSchoolByMypage(page, size);
//        JSONObject jsonObject = (JSONObject) JSON.toJSON(pageUtil);
//        return jsonObject;
//    }

}
