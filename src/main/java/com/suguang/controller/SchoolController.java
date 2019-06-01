package com.suguang.controller;

import com.suguang.dao.SchoolDao;
import com.suguang.domin.YmSchool;

import com.suguang.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


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
    private int pageNum;
    private int sizeNum;

    @RequestMapping("/schoolImageList")
    public String imageList(){
        return "schoolImageList";
    }

    @RequestMapping("/schoolImageAdd")
    public String imageAdd(){
        return "schoolImageAdd";
    }

    //查询所有活动
    @GetMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;
      

        Page<YmSchool> sourceCode = schoolService.getSchool(pageNum, sizeNum);
        model.addAttribute("schoolList", sourceCode);


        return "schoolList";
    }

    //删除学校信息
    @RequestMapping("/delete")
    public String schoolDelete(HttpServletRequest request) {
        String id = request.getParameter("id");
        schoolDao.deleteById(Integer.parseInt(id));

     
        return "redirect:/school/list?page=" + pageNum + "&size=" + sizeNum;
//        return "redirect:/school/list";
    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/update")
    public String schoolpreUpdate(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");

        YmSchool ymSchool = schoolDao.getById(Integer.parseInt(id));
        model.addAttribute("addSchool", ymSchool);
        return "schoolAdd";

    }

    @RequestMapping("/add")
    public String add() {
        return "schoolAdd";
    }

    //将信息保存，返回到列表页
    @RequestMapping(value = "/saveupdate")
    public String schoolSaveUpdate(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String schoolType = request.getParameter("schoolType");
        String city = request.getParameter("city");
        String area = request.getParameter("area");
        String phone = request.getParameter("phone");
        String addrDetail = request.getParameter("addrDetail");
        YmSchool ymSchool = new YmSchool();

        if (id != null && id != "") {
            ymSchool.setId(Integer.parseInt(id));
        }

        ymSchool.setName(name);
        ymSchool.setSchoolType(Integer.parseInt(schoolType));
        ymSchool.setCity(city);
        ymSchool.setArea(area);
        ymSchool.setPhone(phone);
        ymSchool.setAddrDetail(addrDetail);
        Date date = new Date();
        ymSchool.setCreateDate(date);

        YmSchool save = schoolDao.save(ymSchool);

        model.addAttribute("schoolList", save);
       
        return "redirect:/school/list?page=" + pageNum + "&size=" + sizeNum;

//        return "redirect:/school/list";
    }

}
