package com.suguang.controller;

import com.suguang.dao.TagDao;
import com.suguang.domin.YmPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 11491 on 2019/5/26.
 */
@Controller
@RequestMapping("/tag")
public class TagController extends BaseController {

    @Autowired
    private TagDao tagDao;

    //展示所有活动
    @RequestMapping("/list")
    @Override
    protected String getList(HttpServletRequest request, Model model) {
        List<YmPolicy> all = tagDao.findAll();
        model.addAttribute("tagList",all);
        return "tagAdministration";
    }

    @RequestMapping("/delete")
    @Override
    protected String DeleteOne(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        tagDao.deleteById(Integer.parseInt(id));

        return "redirect:/tag/list";
    }

    //路径跳转到添加页面，添加活动信息
    @RequestMapping("/add")
    @Override
    protected String InsertOne(HttpServletRequest request, Model model) {

        return null;
    }

    //返回修改页面，并且查询到需要修改的数据
    @RequestMapping("/update")
    @Override
    protected String UpdataOne(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        YmPolicy ymPolicy = tagDao.getById(Integer.parseInt(id));
        model.addAttribute("tagupdate",ymPolicy);
        return "tagAdd";
    }

    //在修改页面直接对其进行修改，且保存修改数据
    @RequestMapping("/tagAddById")
    public String tagPreUpdate(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String textType = request.getParameter("textType");
        String source = request.getParameter("source");
        String status = request.getParameter("status");
        String peopleNum = request.getParameter("peopleNum");
        YmPolicy ymPolicy = new YmPolicy();
        ymPolicy.setId(Integer.parseInt(id));
        ymPolicy.setTitle(title);
        ymPolicy.setTextType(Integer.parseInt(textType));
        ymPolicy.setSource(source);
        ymPolicy.setStatus(status);
        ymPolicy.setPeopleNum(Integer.parseInt(peopleNum));
        YmPolicy policy = tagDao.save(ymPolicy);

        model.addAttribute("policy",policy);
        return "redirect:/tag/list";
    }





}
