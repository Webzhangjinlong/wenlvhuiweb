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


        return "redirect:/space/spaceList?page=" + pageNum + "&size=" + sizeNum;

    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/spaceDetails")
    public String SpaceDetails(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        List<YmSpaceDetail> spaceDetailList = ymSpaceDetailDao.getBySpaceId(Integer.parseInt(id));
        List<YmSpacePolicy> SpacePolicyList = ymSpacePolicyDao.getBySpaceId(Integer.parseInt(id));
        YmSpace ymYmSpace = ymSpaceDao.getById(Integer.parseInt(id));
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

        spaceId = request.getParameter("id");
        String spaceName = request.getParameter("spaceName");
        String browse = request.getParameter("browse");
        String spaceTitle = request.getParameter("spaceTitle");
        String dateil = request.getParameter("dateil");
        String addr = request.getParameter("addr");
        String longitude = request.getParameter("longitude");
        String latitude = request.getParameter("latitude");
        String HeadImage = request.getParameter("backupField1");
        String spaceMeasure = request.getParameter("spaceMeasure");
        String openDate = request.getParameter("openDate");
        String tel = request.getParameter("tel");

        YmSpace ymYmSpace = new YmSpace();
        if (spaceId != null && spaceId != "") {
            ymYmSpace.setId(Integer.parseInt(spaceId));
        }
        ymYmSpace.setSpaceName(spaceName);
        ymYmSpace.setBrowse(Integer.parseInt(browse));
        ymYmSpace.setSpaceTitle(spaceTitle);
        ymYmSpace.setDateil(dateil);
        ymYmSpace.setAddr(addr);
        ymYmSpace.setLongitude(longitude);
        ymYmSpace.setLatitude(latitude);
        ymYmSpace.setBackupField1(HeadImage);
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

        return "redirect:/space/spaceList?page=" + pageNum + "&size=" + sizeNum;

    }

    //操作场馆
    @RequestMapping("/spaceDetailAdd")
    public String SpaceDetailAdd() {
        return "";
    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/spaceDetailDetails")
    public String SpaceDetailDetails(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        YmSpaceDetail YmSpaceDetail = ymSpaceDetailDao.getById(Integer.parseInt(id));
        model.addAttribute("YmSpaceDetail", YmSpaceDetail);
        return "redirect:/space/spaceList?id=" + spaceId;

    }

    @RequestMapping("/spaceDetailDelete")
    public String SpaceDetailDelete(HttpServletRequest request) {
        String SpaceDetailId = request.getParameter("id");
        ymSpaceDetailDao.deleteById(Integer.parseInt(SpaceDetailId));
        return "redirect:/space/spaceList?id=" + spaceId;

    }

    @RequestMapping(value = "/spaceDetailsDetailsUpdate")
    public String SpaceDetailsDetailsUpdate(HttpServletRequest request, Model model) throws ParseException {

        String spaceDetailsId = request.getParameter("SpaceDetailsId");
        String SpaceDetailsName = request.getParameter("SpaceDetailsName");
        String SpaceDetailsImage = request.getParameter("SpaceDetailsImage");
        String SpaceDetailsPopulation = request.getParameter("SpaceDetailsPopulation");
        String SpaceDetailsSpaceMeasure = request.getParameter("SpaceDetailsSpaceMeasure");
        String SpaceDetailsTel = request.getParameter("SpaceDetailsTel");
        String SpaceDetailsFacilities = request.getParameter("SpaceDetailsFacilities");
        String SpaceDetailsDetail = request.getParameter("SpaceDetailsDetail");
        YmSpaceDetail ymSpaceDetail = new YmSpaceDetail();
        if (spaceDetailsId != null && spaceDetailsId != "") {
            ymSpaceDetail.setId(Integer.parseInt(spaceDetailsId));
        }
        ymSpaceDetail.setSpaceId(Integer.parseInt(spaceId));
        ymSpaceDetail.setName(SpaceDetailsName);
        ymSpaceDetail.setImage(SpaceDetailsImage);
        ymSpaceDetail.setSpaceMeasure(Integer.parseInt(SpaceDetailsPopulation));
        ymSpaceDetail.setSpaceMeasure(Integer.parseInt(SpaceDetailsSpaceMeasure));
        ymSpaceDetail.setTel(SpaceDetailsTel);
        ymSpaceDetail.setFacilities(SpaceDetailsFacilities);
        ymSpaceDetail.setDetail(SpaceDetailsDetail);
        ymSpaceDetailDao.save(ymSpaceDetail);
        return "redirect:/space/spaceList?id=" + spaceId;

    }
    //操作活动

    @RequestMapping("/spacePolicyAdd")
    public String SpacePolicyAdd() {
        return "";
    }

    //通过id获取修改页面，并将要修改的数据在修改页面渲染
    @RequestMapping("/spacePolicyDetails")
    public String SpacePolicyDetails(HttpServletRequest request, Model model) {
        String SpacePolicyId = request.getParameter("id");
        YmSpacePolicy ymSpacePolicy = ymSpacePolicyDao.getById(Integer.parseInt(SpacePolicyId));
        model.addAttribute("ymSpacePolicy", ymSpacePolicy);
        return "redirect:/space/spaceList?id=" + spaceId;

    }

    @RequestMapping("/spacePolicyDelete")
    public String SpacePolicyDelete(HttpServletRequest request) {
        String SpacePolicyId = request.getParameter("id");
        ymSpacePolicyDao.deleteById(Integer.parseInt(SpacePolicyId));
        return "redirect:/space/spaceList?id=" + spaceId;

    }

    @RequestMapping(value = "/spacePolicyUpdate")
    public String SpacePolicyUpdate(HttpServletRequest request, Model model) throws ParseException {
        String SpacePolicyId = request.getParameter("SpacePolicyId");
        String SpacePolicyBrowse = request.getParameter("SpacePolicyBrowse");
        String SpacePolicyDetail = request.getParameter("SpacePolicyDetail");
        String SpacePolicyVideoUrl = request.getParameter("SpacePolicyVideoUrl");
        String SpacePolicyVideoBackimg = request.getParameter("SpacePolicyVideoBackimg");
        YmSpacePolicy ymSpacePolicy = new YmSpacePolicy();
        if (SpacePolicyId != null && SpacePolicyId != "") {
            ymSpacePolicy.setId(Integer.parseInt(SpacePolicyId));
        }
        ymSpacePolicy.setSpaceId(Integer.parseInt(spaceId));
        ymSpacePolicy.setBrowse(Integer.parseInt(SpacePolicyBrowse));
        ymSpacePolicy.setSpacePolicyDetail(SpacePolicyDetail);
        ymSpacePolicy.setVideoUrl(SpacePolicyVideoUrl);
        ymSpacePolicy.setVideoBackimg(SpacePolicyVideoBackimg);

        ymSpacePolicyDao.save(ymSpacePolicy);
        return "redirect:/space/spaceList?id=" + spaceId;

    }

    //返回服务器资源
    @RequestMapping(value = "export_xls", method = RequestMethod.GET)
    public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
        String file = request.getParameter("file");
        return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH + file));
    }

}
