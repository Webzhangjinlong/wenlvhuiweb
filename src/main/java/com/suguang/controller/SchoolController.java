package com.suguang.controller;

import com.suguang.dao.SchoolDao;
import com.suguang.domin.YmPolicy;
import com.suguang.domin.YmSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 11491 on 2019/5/27.
 */


@Controller
@RequestMapping("/school")
public class SchoolController extends BaseController {

    @Autowired
    private SchoolDao schoolDao;

    @RequestMapping("/list")
    @Override
    protected String getList(HttpServletRequest request, Model model) {
        List<YmSchool> all = schoolDao.findAll();
        model.addAttribute("schoolList", all);
        return "schoolList";
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
