package com.suguang.controller;




import com.suguang.dao.ImgDao;
import com.suguang.dao.SchoolDao;
import com.suguang.dao.UserDao;
import com.suguang.domin.YmImage;
import com.suguang.domin.YmSchool;
import com.suguang.domin.YmUser;
import com.suguang.service.SchoolService;
import com.suguang.util.YmStaticVariablesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


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
    @Autowired
    private UserDao userDao;

    private Integer schoolid;
    private YmImage byImgTypeAndPidAndImageType;


    @RequestMapping("/schoolImageList")
    public String imageList()
    {
        return "schoolImageList";
    }

    @RequestMapping("/schoolImageAdd")
    public String imageAdd()
    {
        if (schoolid==null) {
            return "schoolAdd";
        }
        return "schoolImage";
    }

    @RequestMapping("/schoolVideo")
    public String videoAdd(){
        return "schoolVideo";
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
    public String imgDelete(HttpServletRequest request, Model model) {
        //图片ID
        String id = request.getParameter("id");
        imgDao.deleteById(Integer.parseInt(id));

        return "redirect:/school/update?id=" + schoolid;
        //此处删除之后又重定向到学校列表页，不合理，应该重定向到修改的回显页面
    }

    //删除对应视频
    @RequestMapping("/deleteVideo")
    public String videoDelete(HttpServletRequest request) {
        String id = request.getParameter("id");
        imgDao.deleteById(Integer.parseInt(id));
        return "redirect:/school/update?id=" + schoolid;
    }


    //删除学校信息
    @RequestMapping("/delete")
    public String schoolDelete(HttpServletRequest request) {
        String id = request.getParameter("id");
        schoolDao.deleteById(Integer.parseInt(id));

        return "redirect:/school/list?page=" + pageNum + "&size=" + sizeNum;
    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/update")
    public String schoolpreUpdate(HttpServletRequest request, Model model) {
        schoolid = Integer.parseInt(request.getParameter("id"));
        List<YmImage> byImgTypeAndPid = imgDao.getByImgTypeAndPid(4, schoolid);
        ArrayList<YmImage> ymImages = new ArrayList<>();
        ArrayList<YmImage> ymvideo = new ArrayList<>();
        byImgTypeAndPidAndImageType = imgDao.getByImgTypeAndPidAndImageType(4, schoolid, 3);
        YmUser byTypeId = userDao.getByTypeId(schoolid);

        for (YmImage ymImage : byImgTypeAndPid) {
            if (ymImage.getImageType() == 2) {
                ymvideo.add(ymImage);
            } else if(ymImage.getImageType()==1){
                ymImages.add(ymImage);
            }

        }
        YmSchool ymSchool = schoolDao.getById(schoolid);

        model.addAttribute("UserList",byTypeId);
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
        String details = request.getParameter("details");
        String logourl = request.getParameter("logourl");
        String backImg = request.getParameter("backImg");
        String password = request.getParameter("password");
        String productPrice = request.getParameter("productPrice");
        String productId = UUID.randomUUID().toString();


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
        ymSchool.setLogourl(logourl);
        ymSchool.setDetails(details);
        ymSchool.setProductPrice(Double.parseDouble(productPrice));
        ymSchool.setProductId(productId);

        YmSchool save = schoolDao.save(ymSchool);

        if (id.equals("")) {
            YmUser ymUser = new YmUser();
            ymUser.setHeadPic(logourl);
            ymUser.setPassword(password);
            ymUser.setPhone(phone);
            ymUser.setUsername(name);
            ymUser.setNickName(name);
            ymUser.setName(name);
            ymUser.setTypeId(save.getId());
            ymUser.setUserType(2);
            userDao.save(ymUser);
        }else{
            YmUser byTypeId = userDao.getByTypeId(Integer.parseInt(id));
            byTypeId.setHeadPic(logourl);
            byTypeId.setPassword(password);
            byTypeId.setPhone(phone);
            byTypeId.setUsername(name);
            byTypeId.setNickName(name);
            byTypeId.setName(name);
            byTypeId.setTypeId(save.getId());
            byTypeId.setUserType(2);
            userDao.save(byTypeId);
        }

        YmImage ymImage = new YmImage();

        if (byImgTypeAndPidAndImageType != null ) {
            ymImage.setId(byImgTypeAndPidAndImageType.getId());
        }
        ymImage.setImgUrl(backImg);
        ymImage.setPid(save.getId());
        ymImage.setImgName("");
        ymImage.setImgType(4);
        ymImage.setImageType(3);
        //ymImage.setPid(Integer.parseInt(schoolid));
        imgDao.save(ymImage);
        model.addAttribute("schoolList", save);

        if (pageNum == null) {
            pageNum = 1;
        }
        if (sizeNum == null) {
            sizeNum = 10;
        }

        return "redirect:/school/list?page=" + pageNum + "&size=" + sizeNum;

    }

    //添加图片模态框
    @RequestMapping("/addImg")
    public String addImg(HttpServletRequest request, Model model) {
        //学校ID

        String imgName = request.getParameter("imageName");
        String imageDetalis = request.getParameter("imageDetalis");
        String imgUrl = request.getParameter("imgUrl");

        YmImage ymImage = new YmImage();
        ymImage.setImageType(1);
        ymImage.setImgType(4);
        ymImage.setPid(schoolid);
        ymImage.setImgName(imgName);
        ymImage.setDetalis(imageDetalis);
        ymImage.setImgUrl(imgUrl);
        imgDao.save(ymImage);

        return "redirect:/school/update?id=" + schoolid;
    }

    //添加视频模态框
    @RequestMapping("/addVideo")
    public String addVideo(HttpServletRequest request, Model model) {
        //学校ID

        String videoDetails = request.getParameter("videoDetails");
        //String videoImageName = request.getParameter("videoImageName");
        String videoUrl = request.getParameter("videoUrl");
        String videoImgUrl = request.getParameter("videoImgUrl");

        YmImage ymImage = new YmImage();
        ymImage.setImageType(2);
        ymImage.setImgType(4);
        ymImage.setPid(schoolid);
        ymImage.setDetalis(videoDetails);
        ymImage.setVideoUrl(videoUrl);
        ymImage.setImgUrl(videoImgUrl);
        //ymImage.setImgName(videoImageName);

        imgDao.save(ymImage);

        return "redirect:/school/update?id=" + schoolid;
    }

    //返回服务器资源
    @RequestMapping(value = "export_xls", method = RequestMethod.GET)
    public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
        String file = request.getParameter("file");
        return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH + file));
    }
}
