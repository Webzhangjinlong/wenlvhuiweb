package com.suguang.controller;

import com.suguang.dao.UserDao;
import com.suguang.domin.YmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserDao userDao;

    @RequestMapping("/list")
    @Override
    protected String getList(HttpServletRequest request, Model model) {
        List<YmUser> userList = userDao.findAll();
        model.addAttribute("userList",userList);
        return "popleList";
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
