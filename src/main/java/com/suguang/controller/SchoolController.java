package com.suguang.controller;

import com.suguang.dao.ImgDao;
import com.suguang.dao.SchoolDao;
import com.suguang.domin.YmImage;
import com.suguang.domin.YmSchool;

import com.suguang.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
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
    private Integer pageNum;
    private Integer sizeNum;
    @Autowired
    private ImgDao imgDao;
    private String schoolid;

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

    //删除对应图片
    @RequestMapping("/deleteImg")
    public String imgDelete(HttpServletRequest request,Model model){
        //图片ID
        String id = request.getParameter("id");
        imgDao.deleteById(Integer.parseInt(id));

        return "redirect:/school/update?id="+schoolid;
        //此处删除之后又重定向到学校列表页，不合理，应该重定向到修改的回显页面
    }
    //删除对应视频
    @RequestMapping("/deleteVideo")
    public String videoDelete(HttpServletRequest request){
        String id = request.getParameter("id");
        imgDao.deleteById(Integer.parseInt(id));
        return "redirect:/school/update?id="+schoolid;
    }


    //删除学校信息
    @RequestMapping("/delete")
    public String schoolDelete(HttpServletRequest request) {
        String id = request.getParameter("id");
        schoolDao.deleteById(Integer.parseInt(id));

     
        return "redirect:/school/schoolAdd";
//        return "redirect:/school/list";
    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/update")
    public String schoolpreUpdate(HttpServletRequest request, Model model) {
        schoolid = request.getParameter("id");
        List<YmImage> byImgTypeAndPid = imgDao.getByImgTypeAndPid(4, Integer.parseInt(schoolid));
        ArrayList<YmImage> ymImages = new ArrayList<>();
        ArrayList<YmImage> ymvideo = new ArrayList<>();
        YmImage byImgTypeAndPidAndImageType = imgDao.getByImgTypeAndPidAndImageType(4, Integer.parseInt(schoolid), 3);
        for (YmImage ymImage : byImgTypeAndPid) {
            if (ymImage.getImageType()==2) {
                ymvideo.add(ymImage);
            }else{
                ymImages.add(ymImage);
            }

        }
        YmSchool ymSchool = schoolDao.getById(Integer.parseInt(schoolid));
        model.addAttribute("addSchool", ymSchool);
        model.addAttribute("byImgTypeAndPidAndImageType", byImgTypeAndPidAndImageType);
        model.addAttribute("ymImages", ymImages);
        model.addAttribute("ymvideo", ymvideo);
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

        if (pageNum==null) {
            pageNum =1;
        }
        if (sizeNum ==null) {
            sizeNum =10;
        }
       
        return "redirect:/school/list?page=" + pageNum + "&size=" + sizeNum;

    }

    //添加图片模态框
    @RequestMapping("/addImg")
    public String addImg(HttpServletRequest request,Model model){
        //学校ID
        String id = request.getParameter("id");
        String imgName = request.getParameter("details");
        String detalis = request.getParameter("AddImageDetalis");

        YmImage ymImage = new YmImage();
        ymImage.setImageType(1);
        ymImage.setImgType(4);
        ymImage.setPid(Integer.parseInt(id));
        ymImage.setImgName(imgName);
        ymImage.setDetalis(detalis);

        YmImage save = imgDao.save(ymImage);
        model.addAttribute("photo",save);

        return "redirect:/school/update?id="+schoolid;
    }

    //添加视频模态框
    @RequestMapping("/addVideo")
    public String addVideo(HttpServletRequest request,Model model){
        //学校ID
        String id = request.getParameter("id");
        String imgName = request.getParameter("details");
        String detalis = request.getParameter("AddImageDetalis");

        YmImage ymImage = new YmImage();
        ymImage.setImageType(2);
        ymImage.setImgType(4);
        ymImage.setPid(Integer.parseInt(id));
        ymImage.setImgName(imgName);
        ymImage.setDetalis(detalis);

        YmImage save = imgDao.save(ymImage);
        model.addAttribute("photo",save);

        return "redirect:/school/update?id="+schoolid;
    }


}
