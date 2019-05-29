package com.suguang.controller;

import com.suguang.dao.WenLvDao;
import com.suguang.domin.YmWenlv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 11491 on 2019/5/27.
 */
@Controller
@RequestMapping("/wenlv")
public class WenLvController extends BaseController{

    @Autowired
    private WenLvDao wenLvDao;

    //获取政策列表
    @RequestMapping("/list")
    @Override
    protected String getList(HttpServletRequest request, Model model) {
        List<YmWenlv> all = wenLvDao.findAll();
        model.addAttribute("wenlvlist",all);
        return "wenlvzhengce";
    }

    //删除一条政策
    @RequestMapping("/delete")
    @Override
    protected String DeleteOne(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        wenLvDao.deleteById(Integer.parseInt(id));

        return "redirect:/wenlv/list";
    }

    @Override
    protected String InsertOne(HttpServletRequest request, Model model) {
        return null;
    }

    @RequestMapping("/addwenlv")
    public String addWenlv(){
        return "zhengceAdd";
    }

    //修改一条政策,此处找到被修改的对象，然后回显页面
    @RequestMapping("/update")
    @Override
    protected String UpdataOne(HttpServletRequest request, Model model) {

        String id = request.getParameter("id");
        if(id != null && !id.equals("") && !id.equals("null")) {
            YmWenlv ymWenlv = wenLvDao.getById(Integer.parseInt(id.trim()));
            model.addAttribute("wenlv",ymWenlv);
            return "zhengceAdd";
        }
        return "";
    }

    //修改页面里面的数据，及就是将修改的数据保存数据库
    //添加政策
    @RequestMapping("/addSure")
    public String addSure (HttpServletRequest request,Model model){
        YmWenlv ymWenlv = new YmWenlv();
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String titleType = request.getParameter("titleType");
        String source = request.getParameter("source");
        String status = request.getParameter("status");
       // String createUser = request.getParameter("createUser");
        //String textType = request.getParameter("textType");
        ymWenlv.setTitle(title);
        ymWenlv.setTitleType(titleType);
        ymWenlv.setSource(source);
        ymWenlv.setStatus(status);
        //ymWenlv.setCreateUser(Integer.parseInt(createUser));
       //ymWenlv.getTextType(Integer.parseInt(textType));
        YmWenlv save = wenLvDao.save(ymWenlv);
        model.addAttribute("save",save);
        return "redirect:/wenlv/list";
    }
}
