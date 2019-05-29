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

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/update")
    public String schoolpreUpdate(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        YmSchool ymSchool = schoolDao.getById(Integer.parseInt(id));
        model.addAttribute("addSchool",ymSchool);
        return "schoolAdd";

    }

    //将信息保存，返回到列表页
    @RequestMapping("/saveupdate")
    public String schoolSaveUpdate(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String schoolType = request.getParameter("schoolType");
        String city = request.getParameter("city");
        String area = request.getParameter("area");
        String phone = request.getParameter("phone");
        String addrDetail = request.getParameter("addrDetail");
        YmSchool ymSchool = new YmSchool();

        ymSchool.setId(Integer.parseInt(id));
        ymSchool.setName(name);
        ymSchool.setSchoolType(Integer.parseInt(schoolType));
        ymSchool.setCity(city);
        ymSchool.setArea(area);
        ymSchool.setPhone(phone);
        ymSchool.setAddrDetail(addrDetail);

        YmSchool save = schoolDao.save(ymSchool);
        model.addAttribute("sureaddSchool",save);
        return "redirect:/school/list";
    }


//    @GetMapping("/get/myPage")
//    public JSONObject getAllByMyPage(HttpServletRequest request, HttpServletResponse response, @RequestParam("page") int page, @RequestParam("size") int size){
//        Paging pageUtil = schoolService.findAllSchoolByMypage(page, size);
//        JSONObject jsonObject = (JSONObject) JSON.toJSON(pageUtil);
//        return jsonObject;
//    }
}
