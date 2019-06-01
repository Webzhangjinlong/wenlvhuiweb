package com.suguang.controller;

import com.alibaba.fastjson.JSONObject;
import com.suguang.dao.ImgDao;
import com.suguang.dao.SchoolDao;
import com.suguang.domin.YmImage;
import com.suguang.domin.YmSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 11491 on 2019/6/1.
 */

@Controller
@RequestMapping("/img")
public class ImgController {
    @Autowired
    private ImgDao imgDao;
    @Autowired
    private SchoolDao schoolDao;

    //获取图片
    @RequestMapping("/list")
    @ResponseBody
    public String ImgList(HttpServletRequest request, Model model){
        JSONObject jsonObject = new JSONObject();
        Map<String, Object> map = new HashMap<>();

        //获取学校的ID
        String id = request.getParameter("id");
        List<YmImage> byImgTypeAndPid = imgDao.getByImgTypeAndPid(4, Integer.parseInt(id));
        List<YmImage> byImgTypeAnd = imgDao.getByImgTypeAndPid(8, Integer.parseInt(id));
        ArrayList<YmImage> ymImages = new ArrayList<>();
        ArrayList<YmImage> ymvideo = new ArrayList<>();
        YmImage byImgTypeAndPidAndImageType = imgDao.getByImgTypeAndPidAndImageType(4, 8, 3);
        for (YmImage ymImage : byImgTypeAndPid) {
            if (ymImage.getVideoUrl()!=null) {
                ymvideo.add(ymImage);
            }else{
                ymImages.add(ymImage);
            }

        }
        map.put("imageBack",byImgTypeAndPidAndImageType);
        map.put("image",ymImages);
        map.put("video",ymvideo);
        jsonObject.put("data",map);
        return jsonObject.toJSONString();
    }

}
