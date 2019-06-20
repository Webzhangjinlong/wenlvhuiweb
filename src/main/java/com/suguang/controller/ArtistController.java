package com.suguang.controller;

import com.suguang.Dto.SaveUpdateFormSubmit;
import com.suguang.dao.ImgDao;
import com.suguang.dao.UserDao;
import com.suguang.dao.YmArtistDao;
import com.suguang.dao.YmArtistDao;
import com.suguang.domin.YmArtist;
import com.suguang.domin.YmImage;
import com.suguang.domin.YmUser;
import com.suguang.service.ArtistService;

import com.suguang.util.YmStaticVariablesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by 11491 on 2019/6/1.
 */
@Controller
@RequestMapping("/artist")
public class ArtistController {
    @Autowired
    ArtistService YmArtistService;
    @Autowired
    YmArtistDao YmArtistDao;
    @Autowired
    UserDao userDao;
    @Autowired
    ImgDao imgDao;

    private Integer pageNum;
    private Integer sizeNum;
    private String artistid;

    @RequestMapping("/image")
    public String imageByid(){
        return "artistImage";
    }

    @RequestMapping("/video")
    public String videoById(){
        return "artistVideo";
    }

    //查询所有活动
    @GetMapping("/artistList")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;

        Page<YmArtist> sourceCode = YmArtistService.getYmArtist(pageNum, sizeNum);
        model.addAttribute("YmArtistList", sourceCode);


        return "artisList";
    }

    //删除学校信息
    @RequestMapping("/delete")
    public String YmArtistDelete(HttpServletRequest request) {
        String id = request.getParameter("id");
        YmArtistDao.deleteById(Integer.parseInt(id));
        return "redirect:/artist/artistList?page=" + pageNum + "&size=" + sizeNum;
//        return "redirect:/YmArtist/list";
    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/update")
    public String YmArtistpreUpdate(HttpServletRequest request, Model model) {
        artistid = request.getParameter("id");

        List<YmImage> byImgTypeAndPid = imgDao.getByImgTypeAndPid(3, Integer.parseInt(artistid));

        ArrayList<YmImage> ymImages = new ArrayList<>();
        ArrayList<YmImage> ymvideo = new ArrayList<>();

        //图片不能正常回显,视频不能正常回显
        for (YmImage ymImage : byImgTypeAndPid) {
            if (ymImage.getImageType() == 2) {
                ymvideo.add(ymImage);
            } else if(ymImage.getImageType()==1){
                ymImages.add(ymImage);
            }

        }

        YmArtist ymYmArtist = YmArtistDao.getById(Integer.parseInt(artistid));

        model.addAttribute("ymImages",ymImages);
        model.addAttribute("ymvideo", ymvideo);

        YmUser byTypeId = userDao.getByTypeId(Integer.parseInt(artistid));
        model.addAttribute("byTypeId",byTypeId);
        model.addAttribute("addYmArtist", ymYmArtist);
        return "artistAdd";

    }

    @RequestMapping("/add")
    public String add() {
        return "artistAdd";
    }

    //将信息保存，返回到列表页
    @RequestMapping(value = "/saveupdate")
    public String YmArtistSaveUpdate(HttpServletRequest request, Model model) throws ParseException {

        String id = request.getParameter("id");
        String name = request.getParameter("artistName");
        String type = request.getParameter("type");
        String phone = request.getParameter("phone");
        String status = request.getParameter("status");
        String artistDetails = request.getParameter("artistDetails");
        String artistExperience = request.getParameter("artistExperience");
        String backgroundUrl = request.getParameter("backgroundUrl");
        String artistLogourl = request.getParameter("artistLogourl");
        String productPrice = request.getParameter("productPrice");
        String productId = UUID.randomUUID().toString();
        String password = request.getParameter("password");


        YmArtist ymYmArtist = new YmArtist();
        if (id != null && id != "") {
            ymYmArtist.setId(Integer.parseInt(id));
        }

        ymYmArtist.setProductId(productId);//生成唯一标识
        ymYmArtist.setProductPrice(Double.parseDouble(productPrice));//厂品价格
        ymYmArtist.setArtistName(name);
        ymYmArtist.setArtistType(type);
        ymYmArtist.setArtistPhone(phone);
        ymYmArtist.setArtistStatus(Integer.parseInt(status));
        ymYmArtist.setArtistDetails(artistDetails);
        ymYmArtist.setArtistExperience(artistExperience);
        ymYmArtist.setBackgroundUrl(backgroundUrl);
        ymYmArtist.setArtistLogourl(artistLogourl);
        YmArtist save = YmArtistDao.save(ymYmArtist);


        if (id.equals("")) {
            YmUser ymUser = new YmUser();
            ymUser.setHeadPic(artistLogourl);
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
            byTypeId.setHeadPic(artistLogourl);
            byTypeId.setPassword(password);
            byTypeId.setPhone(phone);
            byTypeId.setUsername(name);
            byTypeId.setNickName(name);
            byTypeId.setName(name);
            byTypeId.setTypeId(save.getId());
            byTypeId.setUserType(2);
            userDao.save(byTypeId);
        }
        if (pageNum==null) {
            pageNum =1;
        }
        if (sizeNum ==null) {
            sizeNum =10;
        }

        return "redirect:/artist/artistList?page=" + pageNum + "&size=" + sizeNum;

    }

    //删除对应图片
    @RequestMapping("/deleteImg")
    public String imgDelete(HttpServletRequest request, Model model) {
        //图片ID
        String id = request.getParameter("id");
        imgDao.deleteById(Integer.parseInt(id));

        return "redirect:/artist/update?id=" + artistid;

    }

    //删除对应视频
    @RequestMapping("/deleteVideo")
    public String videoDelete(HttpServletRequest request) {
        String id = request.getParameter("id");
        imgDao.deleteById(Integer.parseInt(id));
        return "redirect:/artist/update?id=" + artistid;
    }

    //添加图片模态框
    @RequestMapping("/addImg")
    public String addImg(HttpServletRequest request, Model model) {
        //艺人ID
        String imgName = request.getParameter("imageName");
        String imageDetalis = request.getParameter("imageDetalis");
        String imgUrl = request.getParameter("imgUrl");

        YmImage ymImage = new YmImage();
        ymImage.setImageType(1);
        ymImage.setImgType(3);
        ymImage.setPid(Integer.parseInt(artistid));
        ymImage.setImgName(imgName);
        ymImage.setDetalis(imageDetalis);
        ymImage.setImgUrl(imgUrl);
        imgDao.save(ymImage);

        return "redirect:/artist/update?id=" + artistid;
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
        ymImage.setImgType(3);
        ymImage.setPid(Integer.parseInt(artistid));
        ymImage.setDetalis(videoDetails);
        ymImage.setVideoUrl(videoUrl);
        ymImage.setImgUrl(videoImgUrl);
        //ymImage.setImgName(videoImageName);

        imgDao.save(ymImage);

        return "redirect:/artist/update?id=" + artistid;
    }

    //返回服务器资源
    @RequestMapping(value = "export_xls", method = RequestMethod.GET)
    public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
        String file = request.getParameter("file");
        return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH+file));
    }

}
