package com.suguang.controller;

import com.suguang.Dto.SaveUpdateFormSubmit;
import com.suguang.dao.YmArtistDao;
import com.suguang.dao.YmArtistDao;
import com.suguang.domin.YmArtist;
import com.suguang.service.ArtistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;

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
    private Integer pageNum;
    private Integer sizeNum;

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
        String id = request.getParameter("id");

        YmArtist ymYmArtist = YmArtistDao.getById(Integer.parseInt(id));
        model.addAttribute("addYmArtist", ymYmArtist);
        return "artistAdd";

    }

    @RequestMapping("/add")
    public String add() {
        return "artistAdd";
    }

    //将信息保存，返回到列表页
    @RequestMapping(value = "/saveupdate")
    public String YmArtistSaveUpdate(HttpServletRequest request, Model model) {

        String id = request.getParameter("id");
        String name = request.getParameter("artistName");
        String type = request.getParameter("type");
        String phone = request.getParameter("phone");
        String status = request.getParameter("status");
        String num = request.getParameter("num");
        String artistDetails = request.getParameter("artistDetails");

        YmArtist ymYmArtist = new YmArtist();
        if (id != null && id != "") {
            ymYmArtist.setId(Integer.parseInt(id));
        }
        ymYmArtist.setArtistName(name);
        ymYmArtist.setArtistType(type);
        ymYmArtist.setArtistPhone(phone);
        ymYmArtist.setArtistStatus(Integer.parseInt(status));
        ymYmArtist.setArtistDetails(artistDetails);


        YmArtist save = YmArtistDao.save(ymYmArtist);

        model.addAttribute("YmArtistList", save);

        if (pageNum==null) {
            pageNum =1;
        }
        if (sizeNum ==null) {
            sizeNum =10;
        }

        return "redirect:/artist/artistList?page=" + pageNum + "&size=" + sizeNum;

    }


}
