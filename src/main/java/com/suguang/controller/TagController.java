package com.suguang.controller;

import com.suguang.dao.TagDao;
import com.suguang.domin.YmPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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
//        List<YmPolicy> all = tagDao.findAll();
//        model.addAttribute("tagList",all);
        return "tagAdministration";
    }

    @Override
    protected String DeleteOne(HttpServletRequest request, Model model) {
        return null;
    }

    @Override
    protected String InsertOne(HttpServletRequest request, Model model) {
        return null;
    }

    @Override
    protected String UpdataOne(HttpServletRequest request, Model model) {
        return null;
    }
}
