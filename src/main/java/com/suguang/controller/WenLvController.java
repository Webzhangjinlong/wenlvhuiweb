package com.suguang.controller;

import com.suguang.dao.WenLvDao;
import com.suguang.domin.YmSchool;
import com.suguang.domin.YmWenlv;
import com.suguang.service.WenLvService;
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
import java.text.ParseException;

import java.util.Date;


/**
 * Created by 11491 on 2019/5/27.
 */
@Controller
@RequestMapping("/wenlv")
public class WenLvController {

    @Autowired
    private WenLvDao wenLvDao;
    @Autowired
    private WenLvService wenLvService;

    //获取政策列表
    @GetMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        int pageNum = page == null ? 1 : page;
        int sizeNum = size == null ? 10 : size;
        request.getSession().setAttribute("page", pageNum);
        request.getSession().setAttribute("size", sizeNum);
        Page<YmWenlv> sourceCode = wenLvService.getWenLv(pageNum, sizeNum);
        model.addAttribute("wenlvlist", sourceCode);
        return "wenlvzhengce";
    }

    //删除一条政策
    @RequestMapping("/delete")

    protected String DeleteOne(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        wenLvDao.deleteById(Integer.parseInt(id));

        return "redirect:/wenlv/list";
    }


    protected String InsertOne(HttpServletRequest request, Model model) {
        return null;
    }

    @RequestMapping("/addwenlv")
    public String addWenlv() {
        return "zhengceAdd";
    }

    //修改一条政策,此处找到被修改的对象，然后回显页面
    @RequestMapping("/update")

    protected String UpdataOne(HttpServletRequest request, Model model) {

        String id = request.getParameter("id");
        if (id != null && !id.equals("") && !id.equals("null")) {
            YmWenlv ymWenlv = wenLvDao.getById(Integer.parseInt(id.trim()));
            model.addAttribute("wenlv", ymWenlv);
            return "zhengceAdd";
        }
        return "";
    }

    //修改页面里面的数据，及就是将修改的数据保存数据库
    //添加政策
    @RequestMapping("/addSure")
    public String addSure(HttpServletRequest request, Model model) throws ParseException {
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String titleType = request.getParameter("titleType");
        String source = request.getParameter("source");
        String textType = request.getParameter("textType");
        String status = request.getParameter("status");

        Date date = new Date();

        String cotent = request.getParameter("cotent");
        String image = request.getParameter("image");
        YmWenlv ymWenlv = new YmWenlv();
        if (id != null && id != "") {
            ymWenlv.setId(Integer.parseInt(id));
        }
        ymWenlv.setTitle(title);
        ymWenlv.setTitleType(titleType);
        ymWenlv.setSource(source);
        ymWenlv.setTextType(textType);
        ymWenlv.setStatus(status);
        ymWenlv.setCotent(cotent);
        ymWenlv.setImage(image);
        YmWenlv wenlv = wenLvDao.save(ymWenlv);
        model.addAttribute("wenlv", wenlv);
        return "redirect:/wenlv/list";
    }

    //返回服务器资源
    @RequestMapping(value = "export_xls", method = RequestMethod.GET)
    public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
        String file = request.getParameter("file");
        return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH + file));
    }
}
