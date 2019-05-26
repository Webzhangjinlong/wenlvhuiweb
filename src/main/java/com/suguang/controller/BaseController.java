package com.suguang.controller;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 11491 on 2019/5/26.
 */
public abstract class BaseController {

    protected abstract String getList(HttpServletRequest request, Model model);

    protected abstract String DeleteOne(HttpServletRequest request, Model model);

    protected abstract String InsertOne(HttpServletRequest request, Model model);

    protected abstract String UpdataOne(HttpServletRequest request, Model model);
}
