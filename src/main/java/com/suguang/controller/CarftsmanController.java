package com.suguang.controller;

import com.suguang.dao.CraftsmanDao;
import com.suguang.domin.YmSchool;
import com.suguang.domin.YmShops;
import com.suguang.service.CarftsmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by 11491 on 2019/5/29.
 */

@Controller
@RequestMapping("/craftsman")
public class CarftsmanController {
    @Autowired
    private CraftsmanDao craftsmanDao;
    @Autowired
    private CarftsmanService carftsmanService;
    private Integer pageNum;
    private Integer sizeNum;

    @RequestMapping("/shopUpdate")
    public String shopUpdate(){
        return "craftsmanShopAdd";
    }

    //匠人
    @GetMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;

        Page<YmShops> sourceCode = carftsmanService.getcraft(pageNum, sizeNum);
        model.addAttribute("list", sourceCode);

        return "craftsmanList";
    }


    @RequestMapping("/show")
    public String craftsmanUpdate(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        YmShops ymShops = craftsmanDao.getById(Integer.parseInt(id));
        model.addAttribute("show", ymShops);
        return "craftsmanAdd";
    }

    //直接从主页面跳转至添加页面
    @RequestMapping("/addpage")
    public String addpage() {
        return "craftsmanAdd";
    }

    //在添加页面输入数据，然后保存到数据库，最后返回到数据列表中
    @RequestMapping("/addList")
    public String addList(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        String shopsName = request.getParameter("shopsName");
        String createUser = request.getParameter("createUser");
        String shopsSlogan = request.getParameter("shopsSlogan");
        String city = request.getParameter("city");
        String area = request.getParameter("area");
        String addrDetail = request.getParameter("addrDetail");
        String longitude = request.getParameter("longitude");
        String latitude = request.getParameter("latitude");
        String shopsDetail = request.getParameter("shopsDetail");
        String imgUrl = request.getParameter("imgUrl");

        YmShops ymShops = new YmShops();

        //此处一定要加判断ID是否为空，否怎会报错，即使不为空也报错
        if (id != null && !id.equals("") && !id.equals("null")) {
            ymShops.setId(Integer.parseInt(id));
        }

        ymShops.setShopsName(shopsName);
        ymShops.setCreateUser(Integer.parseInt(createUser));
        ymShops.setShopsSlogan(shopsSlogan);
        ymShops.setCity(city);
        ymShops.setArea(area);
        ymShops.setAddrDetail(addrDetail);
        ymShops.setLongitude(longitude);
        ymShops.setLatitude(latitude);
        ymShops.setShopsDetail(shopsDetail);

        Date date = new Date();
        ymShops.setCreateDate(date);

        ymShops.setImgUrl(imgUrl);

        YmShops save = craftsmanDao.save(ymShops);
        model.addAttribute("save", save);

        if (pageNum==null) {
            pageNum =1;
        }
        if (sizeNum ==null) {
            sizeNum =10;
        }

        return "redirect:/craftsman/list?page=" + pageNum + "&size=" + sizeNum;

    }

    //删除
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request) {
        String id = request.getParameter("id");
        craftsmanDao.deleteById(Integer.parseInt(id));

        return "redirect:/craftsman/list?page=" + pageNum + "&size=" + sizeNum;
        // return "redirect:/craftsman/list";
    }
}
