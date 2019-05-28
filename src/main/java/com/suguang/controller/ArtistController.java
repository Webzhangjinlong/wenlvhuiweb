package com.suguang.controller;

import com.suguang.dao.ArtistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 11491 on 2019/5/28.
 */
public class ArtistController extends BaseController{

    @Autowired
    private ArtistDao artistDao;
    //获取所有艺人
    @Override
    protected String getList(HttpServletRequest request, Model model) {



        return null;
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
