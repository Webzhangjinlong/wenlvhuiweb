package com.suguang.controller;

import com.suguang.dao.YmSpaceDao;
import com.suguang.dao.YmSpaceDetailDao;
import com.suguang.dao.YmSpacePolicyDao;
import com.suguang.domin.YmSpace;
import com.suguang.domin.YmSpace;
import com.suguang.domin.YmSpaceDetail;
import com.suguang.domin.YmSpacePolicy;
import com.suguang.service.YmSpaceService;
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
import java.util.List;

/**
 * Created by Mr.King on 2019/6/3.
 */
@Controller
@RequestMapping("/space")
public class YmSpaceController {
    @Autowired
    YmSpaceDao ymSpaceDao;
    @Autowired
    YmSpaceDetailDao ymSpaceDetailDao;
    @Autowired
    YmSpacePolicyDao ymSpacePolicyDao;
    @Autowired
    YmSpaceService ymSpaceService;
    private Integer pageNum;
    private Integer sizeNum;
    private String spaceId;

    //查询所有活动
    @GetMapping("/list")
    public String SpaceList(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;
        Page<YmSpace> sourceCode = ymSpaceService.getSpace(pageNum, sizeNum);
        model.addAttribute("YmSpaceList", sourceCode);

        return "spaceList";
    }

    //删除空间信息
    @RequestMapping("/spacedelete")
    public String Spacedelete(HttpServletRequest request) {
        String id = request.getParameter("id");
        ymSpaceDao.deleteById(Integer.parseInt(id));

        return "redirect:/space/list?page=" + pageNum + "&size=" + sizeNum;

    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/spaceDetails")
    public String SpaceDetails(HttpServletRequest request, Model model) {
        spaceId = request.getParameter("id");
        List<YmSpaceDetail> spaceDetailList = ymSpaceDetailDao.getBySpaceId(Integer.parseInt(spaceId));
        List<YmSpacePolicy> SpacePolicyList = ymSpacePolicyDao.getBySpaceId(Integer.parseInt(spaceId));
        YmSpace ymYmSpace = ymSpaceDao.getById(Integer.parseInt(spaceId));
        model.addAttribute("spaceDetailList", spaceDetailList);
        model.addAttribute("addYmSpace", ymYmSpace);
        model.addAttribute("SpacePolicyList", SpacePolicyList);
        return "spaceAdd";

    }

    @RequestMapping("/add")
    public String SpaceAdd() {
        return "spaceAdd";
    }

    //将信息保存，返回到列表页
    @RequestMapping(value = "/SpaceDetailsUpdate")
    public String SpaceDetailsUpdate(HttpServletRequest request, Model model) throws ParseException {

        String id = request.getParameter("id");
        String spaceName = request.getParameter("spaceName");
        String spaceTitle = request.getParameter("spaceTitle");
        String spaceMeasure = request.getParameter("spaceMeasure");
        String openDate = request.getParameter("openDate");
        String addr = request.getParameter("addr");
        String tel = request.getParameter("tel");
        String longitude = request.getParameter("longitude");
        String latitude = request.getParameter("latitude");
        String dateil = request.getParameter("dateil");
        //空间头像，北京图没写

        YmSpace ymYmSpace = new YmSpace();
        if (id != null && id != "") {
            ymYmSpace.setId(Integer.parseInt(id));
        }
        ymYmSpace.setSpaceName(spaceName);
        //ymYmSpace.setBrowse(Integer.parseInt(browse));
        ymYmSpace.setSpaceTitle(spaceTitle);
        ymYmSpace.setDateil(dateil);
        ymYmSpace.setAddr(addr);
        ymYmSpace.setLongitude(longitude);
        ymYmSpace.setLatitude(latitude);
        //ymYmSpace.setBackupField1(HeadImage);
        ymYmSpace.setSpaceMeasure(Integer.parseInt(spaceMeasure));
        ymYmSpace.setOpenDate(openDate);
        ymYmSpace.setTel(tel);

        YmSpace save = ymSpaceDao.save(ymYmSpace);


        if (pageNum == null) {
            pageNum = 1;
        }
        if (sizeNum == null) {
            sizeNum = 10;
        }

        return "redirect:/space/list?page=" + pageNum + "&size=" + sizeNum;

    }

    //操作场馆    跳转添加页面
    @RequestMapping("/spaceDetailAdd")
    public String SpaceDetailAdd() {
        return "spaceDetailAdd";
    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染,回显场馆的
    @RequestMapping("/spaceDetailDetails")
    public String SpaceDetailDetails(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        YmSpaceDetail YmSpaceDetail = ymSpaceDetailDao.getById(Integer.parseInt(id));
        model.addAttribute("YmSpaceDetail", YmSpaceDetail);
        return "spaceDetailAdd";

    }

    @RequestMapping("/spaceDetailDelete")
    public String SpaceDetailDelete(HttpServletRequest request) {
        String SpaceDetailId = request.getParameter("id");
        ymSpaceDetailDao.deleteById(Integer.parseInt(SpaceDetailId));
        return "redirect:/space/spaceDetails?id=" + spaceId;

    }

    //场馆增加或者修改保存数据
    @RequestMapping(value = "/spaceDetailsDetailsUpdate")
    public String SpaceDetailsDetailsUpdate(HttpServletRequest request, Model model) throws ParseException {

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String population = request.getParameter("population");
        String spaceMeasure = request.getParameter("spaceMeasure");
        String tel = request.getParameter("tel");
        String facilities = request.getParameter("facilities");
        String detail = request.getParameter("detail");
        String image = request.getParameter("image");
        YmSpaceDetail ymSpaceDetail = new YmSpaceDetail();
        if (id != null && id != "") {
            ymSpaceDetail.setId(Integer.parseInt(id));
        }
        ymSpaceDetail.toString();
        ymSpaceDetail.setSpaceId(Integer.parseInt(spaceId));
        ymSpaceDetail.setName(name);
        ymSpaceDetail.setImage(image);
        ymSpaceDetail.setSpaceMeasure(Integer.parseInt(spaceMeasure));
        ymSpaceDetail.setTel(tel);
        ymSpaceDetail.setFacilities(facilities);
        ymSpaceDetail.setDetail(detail);
        ymSpaceDetail.setPopulation(Integer.parseInt(population));


        ymSpaceDetailDao.save(ymSpaceDetail);
        return "redirect:/space/spaceDetails?id=" + spaceId;

    }






    //操作活动

    @RequestMapping("/spacePolicyAdd")
    public String SpacePolicyAdd() {
        return "spacePolicyAdd";
    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/spacePolicyDetails")
    public String SpacePolicyDetails(HttpServletRequest request, Model model) {
        String SpacePolicyId = request.getParameter("id");
        YmSpacePolicy ymSpacePolicy = ymSpacePolicyDao.getById(Integer.parseInt(SpacePolicyId));
        model.addAttribute("ymSpacePolicy", ymSpacePolicy);
        return "spacePolicyAdd";

    }

    @RequestMapping("/spacePolicyDelete")
    public String SpacePolicyDelete(HttpServletRequest request) {
        String SpacePolicyId = request.getParameter("id");
        ymSpacePolicyDao.deleteById(Integer.parseInt(SpacePolicyId));
        return "redirect:/space/spaceDetails?id=" + spaceId;

    }

    @RequestMapping(value = "/spacePolicyUpdate")
    public String SpacePolicyUpdate(HttpServletRequest request, Model model) throws ParseException {
        String policyid = request.getParameter("Policyid");
        String policybrowse = request.getParameter("Policybrowse");
        String policyvideoBackimg = request.getParameter("PolicyvideoBackimg");
        String policyproductDatile = request.getParameter("PolicyproductDatile");
        String policyImg = request.getParameter("PolicyImg");
        request.getParameter("productImage");
        YmSpacePolicy ymSpacePolicy = new YmSpacePolicy();
        if (policyid != null && policyid != "") {
            ymSpacePolicy.setId(Integer.parseInt(policyid));
        }
        ymSpacePolicy.setSpaceId(Integer.parseInt(spaceId));
        ymSpacePolicy.setBrowse(Integer.parseInt(policybrowse));
        ymSpacePolicy.setSpacePolicyDetail(policyproductDatile);
        ymSpacePolicy.setVideoUrl(policyImg);
        ymSpacePolicy.setVideoBackimg(policyvideoBackimg);

        ymSpacePolicyDao.save(ymSpacePolicy);
        return "redirect:/space/spaceDetails?id=" + spaceId;

    }

    //返回服务器资源
    @RequestMapping(value = "export_xls", method = RequestMethod.GET)
    public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
        String file = request.getParameter("file");
        return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH + file));
    }

    //数据都能正常执行，但是报错处在 spaceId;

}
