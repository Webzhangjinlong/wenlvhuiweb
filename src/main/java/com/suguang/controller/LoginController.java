package com.suguang.controller;

import com.suguang.dao.LoginDao;
import com.suguang.domin.YmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 11491 on 2019/5/26.
 */
@Controller
@RequestMapping("/user")
public class LoginController  {
    @Autowired
    private LoginDao loginDao;

    @RequestMapping(value = "/login")
    public String Userlogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        YmUser ymUser = loginDao.findByUsernameAndPassword(username, password);


        if(ymUser !=null){
            if(ymUser.getUserType()==3){
                return "商家对应的主页面";
            }if(ymUser.getUserType() == 4){
                //返回餐厅对应的主页
                return "hotelAddById";
            }if(ymUser.getUserType() == 9){
                //返回管理员的主页
                request.getSession().setAttribute("user",ymUser);
                return "index";
            }
        }else{
            return "login";
        }
        return "login";
 
    }
}
