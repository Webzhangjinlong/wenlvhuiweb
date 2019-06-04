package com.suguang.controller;

import com.suguang.dao.UserDao;
import com.suguang.domin.YmBook;
import com.suguang.domin.YmUser;
import com.suguang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    private Integer pageNum;
    private Integer sizeNum;

    //查询用户且分页
    @RequestMapping("/list")
    protected String getList(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page,
                             @RequestParam(value = "size", required = false) Integer size) {

        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;
        Page<YmUser> sourceCode = userService.getUser(pageNum, sizeNum);
        model.addAttribute("userList", sourceCode);
        return "popleList";
    }

    //删除用户
    @RequestMapping("/delete")
    public String deleteUser(HttpServletRequest request){
        String id = request.getParameter("id");
        userDao.deleteById(Integer.parseInt(id));
        return "redirect:/user/list?page=" + pageNum + "&size=" + sizeNum;
    }

    //修改用户，并且通过id回显
    @RequestMapping("/preupdate")
    public String preupdate(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        YmUser ymUser = userDao.getById(Integer.parseInt(id));
        model.addAttribute("ymUser",ymUser);
        return "userAdd";
    }

    //在添加页面修改或添加用户信息
    @RequestMapping("/addupdate")
    public String addupdate(HttpServletRequest request,Model model) throws ParseException {
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String status = request.getParameter("status");
        String userType = request.getParameter("userType");
        String isMobileCheck = request.getParameter("isMobileCheck");
        String nickName = request.getParameter("nickName");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String userLevel = request.getParameter("userLevel");
        String date = request.getParameter("birthday");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 日期格式锕 y = 年， M = 月， d= t天， H = 时， m = 分， s= 秒
        Date birthday = sdf.parse(date);
        //用户头像没写
        //request.getParameter("");

        YmUser ymUser = new YmUser();
        if (id != null && id != "") {
            ymUser.setId(Integer.parseInt(id));
        }

        ymUser.setUsername(username);
        ymUser.setPassword(password);
        ymUser.setPhone(phone);
        ymUser.setStatus(status);
        ymUser.setUserType(Integer.parseInt(userType));
        ymUser.setIsMobileCheck(isMobileCheck);
        ymUser.setNickName(nickName);
        ymUser.setName(name);
        ymUser.setSex(sex);
        ymUser.setUserLevel(userLevel);
        ymUser.setBirthday(birthday);
        ymUser.setCreated(new Date());
        YmUser save = userDao.save(ymUser);
        model.addAttribute("userSave",save);

        return "redirect:/user/list?page=" + pageNum + "&size=" + sizeNum;
    }

    @RequestMapping("/add")
    public String add(){
        return "userAdd";
    }


}
