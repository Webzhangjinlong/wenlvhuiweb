package com.suguang.controller;

import com.suguang.dao.YmWenBrigadeDao;

import com.suguang.domin.YmWenbrigade;

import com.suguang.service.YmWenBrigadeService;
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
 * Created by Mr.King on 2019/6/4.
 */
@Controller
@RequestMapping("/WenBrigade")
public class YmWenBrigadeController {
    @Autowired
    YmWenBrigadeDao ymWenBrigadeDao;
    @Autowired
    YmWenBrigadeService ymWenBrigadeService;
    private Integer pageNum;
    private Integer sizeNum;
    private String WenBrigadeId;

    //查询所有活动
    @GetMapping("/YmWenBrigadeList")
    public String YmWenBrigadeList(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;
        Page<YmWenbrigade> sourceCode = ymWenBrigadeService.getWenBrigade(pageNum, sizeNum);
        model.addAttribute("YmWenBrigadeList", sourceCode);
        return "brigadeList";
    }
    //删除空间信息
    @RequestMapping("/WenBrigadeDelete")
    public String WenBrigadeDelete(HttpServletRequest request) {
        String id = request.getParameter("id");
        ymWenBrigadeDao.deleteById(Integer.parseInt(id));

        return "redirect:/WenBrigade/YmWenBrigadeList?page=" + pageNum + "&size=" + sizeNum;

    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/WenBrigadeDetails")
    public String SpaceDetails(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        YmWenbrigade ymWenBrigade = ymWenBrigadeDao.getById(Integer.parseInt(id));

        model.addAttribute("ymWenBrigade", ymWenBrigade);
        return "brigadeAdd";
    }

    @RequestMapping("/WenBrigadeAdd")
    public String SpaceAdd() {
        return "brigadeAdd";
    }

    //将信息保存，返回到列表页
    @RequestMapping(value = "/WenBrigadeUpdate")
    public String SpaceDetailsUpdate(HttpServletRequest request, Model model) throws ParseException {

        WenBrigadeId = request.getParameter("id");
        String type = request.getParameter("type");
        String children = request.getParameter("children");
        String setMeal = request.getParameter("setMeal");
        String adult = request.getParameter("adult");
        String adultDescribe = request.getParameter("adultDescribe");
        String childrenDescribe = request.getParameter("childrenDescribe");
        String mealDescribe = request.getParameter("mealDescribe");
        String tripArrange = request.getParameter("tripArrange");
        String feeNotice = request.getParameter("feeNotice");
        String securityTip = request.getParameter("securityTip");
        String name = request.getParameter("name");
       // String address = request.getParameter("address");
        String recommend = request.getParameter("recommend");
        String browse = request.getParameter("browse");
        String img = request.getParameter("img");

        YmWenbrigade ymWenBrigade = new YmWenbrigade();
        if (WenBrigadeId != null && WenBrigadeId != "") {
            ymWenBrigade.setId(Integer.parseInt(WenBrigadeId));
        }
        ymWenBrigade.setType(Integer.parseInt(type));
        ymWenBrigade.setAdult(Double.parseDouble(adult));
        ymWenBrigade.setChildren(Double.parseDouble(children));
        ymWenBrigade.setSetMeal(Double.parseDouble(setMeal));
        ymWenBrigade.setAdultDescribe(adultDescribe);
        ymWenBrigade.setChildrenDescribe(childrenDescribe);
        ymWenBrigade.setMealDescribe(mealDescribe);
        ymWenBrigade.setTripArrange(tripArrange);
        ymWenBrigade.setFeeNotice(feeNotice);
        ymWenBrigade.setSecurityTip(securityTip);
        ymWenBrigade.setName(name);
        ymWenBrigade.setCreateTime(new Date());
        //ymWenBrigade.setAddress(address);
        ymWenBrigade.setRecommend(Integer.parseInt(recommend));
        ymWenBrigade.setBrowse(Integer.parseInt(browse));
        ymWenBrigade.setImg(img);

        YmWenbrigade save = ymWenBrigadeDao.save(ymWenBrigade);


        if (pageNum == null) {
            pageNum = 1;
        }
        if (sizeNum == null) {
            sizeNum = 10;
        }

        return "redirect:/WenBrigade/YmWenBrigadeList?page=" + pageNum + "&size=" + sizeNum;
    }
    //返回服务器资源
    @RequestMapping(value = "export_xls", method = RequestMethod.GET)
    public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
        String file = request.getParameter("file");
        return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH + file));
    }

}
