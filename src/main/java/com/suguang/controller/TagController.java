package com.suguang.controller;

import com.suguang.dao.ImageDao;
import com.suguang.dao.TagDao;
import com.suguang.domin.YmImage;
import com.suguang.domin.YmPolicy;
import com.suguang.domin.YmSchool;
import com.suguang.service.TagService;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 11491 on 2019/5/26.
 */
@Controller
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagDao tagDao;
    @Autowired
    TagService tagService;

    private Integer sizeNum;
    private Integer pageNum;


    //查询所有活动
    @GetMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;

        Page<YmPolicy> sourceCode = tagService.getTag(pageNum, sizeNum);
        model.addAttribute("tagList", sourceCode);

        return "tagAdministration";
    }

    @RequestMapping("/delete")

    protected String DeleteOne(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        tagDao.deleteById(Integer.parseInt(id));

       
        return "redirect:/tag/list?page=" + pageNum + "&size=" + sizeNum;

    }



    //返回修改页面，并且查询到需要修改的数据
    @RequestMapping("/update")

    protected String UpdataOne(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        YmPolicy ymPolicy = tagDao.getById(Integer.parseInt(id));
        model.addAttribute("tagupdate",ymPolicy);
        return "tagAdd";
    }

    //在修改页面直接对其进行修改，且保存修改数据
    @RequestMapping("/tagAddById")
    public String tagPreUpdate(HttpServletRequest request,Model model) throws ParseException {

        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String textType = request.getParameter("textType");
        String source = request.getParameter("source");
        String status = request.getParameter("status");
        String peopleNum = request.getParameter("peopleNum"); //你哪里要格式化呢
        String giveDefault = request.getParameter("giveDefault");
        String date = request.getParameter("signDate");//
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 日期格式锕 y = 年， M = 月， d= t天， H = 时， m = 分， s= 秒
        Date parse = sdf.parse(date);
        String date1 = request.getParameter("policyDate");//
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); // 日期格式锕 y = 年， M = 月， d= t天， H = 时， m = 分， s= 秒
        Date parse1 = sdf1.parse(date1);
        String policyAddr = request.getParameter("policyAddr");
        String prize = request.getParameter("prize");
        String policyRule = request.getParameter("policyRule");
        String awardRules = request.getParameter("awardRules");
        String policyPurpose = request.getParameter("policyPurpose");
        String cotent = request.getParameter("cotent");
        String image = request.getParameter("image"); //这是undefind锕那这咋弄呢
        String videourl = request.getParameter("videourl");
        String videoBackurl = request.getParameter("videoBackurl");
        String browse = request.getParameter("browse");
        YmPolicy ymPolicy = new YmPolicy();
        if(id != null && id != ""){
            ymPolicy.setId(Integer.parseInt(id));
        }
        ymPolicy.setTitle(title);
        ymPolicy.setTextType(Integer.parseInt(textType));
        ymPolicy.setSource(source);
        ymPolicy.setStatus(status);
        ymPolicy.setPeopleNum(Integer.parseInt(peopleNum));
        ymPolicy.setGiveDefault(giveDefault);
        ymPolicy.setSignDate(parse);
        ymPolicy.setPolicyDate(parse1);
        ymPolicy.setPolicyAddr(policyAddr);
        ymPolicy.setPrize(prize);
        ymPolicy.setPolicyRule(policyRule);
        ymPolicy.setAwardRules(awardRules);
        ymPolicy.setPolicyPurpose(policyPurpose);
        ymPolicy.setCotent(cotent);
        ymPolicy.setImage(image);
        ymPolicy.setVideourl(videourl);
        ymPolicy.setCreateDate(new Date());
        ymPolicy.setVideoBackurl(videoBackurl);
        ymPolicy.setCreateDate(new Date());
        ymPolicy.setBrowse(Integer.parseInt(browse));
        YmPolicy policy = tagDao.save(ymPolicy);
        model.addAttribute("policy",policy);

        if (pageNum==null) {
            pageNum =1;
        }
        if (sizeNum ==null) {
            sizeNum =10;
        }

      
        return "redirect:/tag/list?page=" + pageNum + "&size=" + sizeNum;

    }

    //添加活动
    @RequestMapping("/tagAdd")
    public String tagAdd(){
        return "tagAdd";
    }

	//返回服务器资源
	@RequestMapping(value = "export_xls", method = RequestMethod.GET)
	public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
		String file = request.getParameter("file");
		return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH+file));
	}

}
