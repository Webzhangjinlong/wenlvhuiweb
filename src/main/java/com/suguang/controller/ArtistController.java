package com.suguang.controller;

import com.suguang.dao.ArtistDao;
import com.suguang.domin.YmArtist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 11491 on 2019/5/28.
 */
@Controller
@RequestMapping("/artist")
public class ArtistController extends BaseController{

    @Autowired
    private ArtistDao artistDao;


    //获取所有艺人
    @Override
    @RequestMapping("/artistList")
    protected String getList(HttpServletRequest request, Model model) {
        List<YmArtist> all = artistDao.findAll();
        model.addAttribute("artistList",all);
        return "artisList";
    }

    @RequestMapping("/artistAdd")
    public String artistAdd(){
        return "artistAdd";
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
