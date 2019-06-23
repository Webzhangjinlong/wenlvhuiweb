package com.suguang.controller;


import com.suguang.dao.ImgDao;
import com.suguang.dao.UserDao;
import com.suguang.dao.YmCircleDao;
import com.suguang.dao.YmCirclePolicyDao;
import com.suguang.domin.YmArtist;
import com.suguang.domin.YmCircle;
import com.suguang.domin.YmCirclePolicy;
import com.suguang.domin.YmImage;
import com.suguang.service.YmCircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/circle")
public class CircleController {
    @Autowired
    private YmCircleDao ymCircleDao;
    @Autowired
    private YmCirclePolicyDao ymCirclePolicyDao;
    @Autowired
    private YmCircleService ymCircleService;
    @Autowired
    private UserDao userDao;
    @Autowired
    private ImgDao imgDao;


    private Integer pageNum;
    private Integer sizeNum;
    private String id;

    @RequestMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;

        Page<YmCircle> sourceCode = ymCircleService.getYmCircle(pageNum, sizeNum);
        model.addAttribute("YmCircleList", sourceCode);

        return "circle";
    }

    //圈子修改页面数据回显
    @RequestMapping("/details")
    public String details(HttpServletRequest request,Model model){
         id = request.getParameter("id");
        YmCircle byId = ymCircleDao.getById(Integer.parseInt(id));
        model.addAttribute("byId",byId);
        YmCirclePolicy byIdPolicy = ymCirclePolicyDao.getById(Integer.parseInt(id));
        model.addAttribute("byIdPolicy",byIdPolicy);
        return "circleDetails";
    }

    //删除整个圈子
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
        String id = request.getParameter("id");
        ymCircleDao.deleteById(Integer.parseInt(id));
        return "redirect:/circle/list?page=" + pageNum + "&size=" + sizeNum;    }

    //返回主页面列表
    @RequestMapping("/return")
    public String returnIndex(){
        return "redirect:/circle/list";
    }
    //返回修改也
    @RequestMapping("/back")
    public String back(){
        return "redirect:/circle/details?id=" + id;
    }

    //圈子动态的回显
    @RequestMapping("/policy")
    public String policy(Model model){
        YmCirclePolicy byIdPolicy = ymCirclePolicyDao.getById(Integer.parseInt(id));
        model.addAttribute("byIdPolicy",byIdPolicy);

        //圈子图片列表的回显
        List<YmImage> byImgTypeAndPid = imgDao.getByImgTypeAndPid(10, Integer.parseInt(id));
        model.addAttribute("byImgType",byImgTypeAndPid);
        return "circlePolicyDetails";
    }
    //删除圈子动态
    @RequestMapping("/deletePolicy")
    public String deletePolicy(HttpServletRequest request,Model model){
        String sid = request.getParameter("id");
        ymCirclePolicyDao.deleteById(Integer.parseInt(sid));
        return "redirect:/circle/details?id=" + id;
    }
    //删除圈子动态中的图片
    @RequestMapping("/deleteImg")
    public String deleteImg(HttpServletRequest request){
        String ImgId = request.getParameter("id");
        imgDao.deleteById(Integer.parseInt(ImgId));
        return "redirect:/circle/policy";
    }


}
