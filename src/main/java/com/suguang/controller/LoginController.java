package com.suguang.controller;

import com.suguang.dao.LoginDao;
import com.suguang.domin.YmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by 11491 on 2019/5/26.
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private LoginDao loginDao;

    @RequestMapping(value = "/login")
    public String Userlogin(HttpServletRequest request) { //你这咋方法名大写的呢
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        YmUser ymUser = loginDao.findByUsernameAndPassword(username, password);
        HttpSession session = request.getSession();
        session.setAttribute("UserSession", ymUser);

        if (ymUser != null) {
            if (ymUser.getUserType() == 3) {
                return "商家对应的主页面";
            }
            if (ymUser.getUserType() == 4) {
                //返回餐厅对应的主页
                return "hotelAddById";
            }
            if (ymUser.getUserType() == 9) {
                //返回管理员的主页
                request.getSession().setAttribute("user", ymUser);
                return "index";
            }
        } else {
            return "login";
        }
        return "login";

    }

    //退出登录
    @RequestMapping("/remove")
    public String remove(HttpServletRequest request,HttpSession session) {
        String id = request.getParameter("id");
        session.removeAttribute("UserSession");
        //session.setAttribute("sessionemp", null);
        System.out.println("退出登录");
        return "login";
    }
}