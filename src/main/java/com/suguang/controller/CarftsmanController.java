package com.suguang.controller;

import com.suguang.dao.CraftsmanDao;
import com.suguang.dao.ProductDao;
import com.suguang.dao.UserDao;
import com.suguang.domin.*;
import com.suguang.service.CarftsmanService;
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
import java.math.BigDecimal;
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
    @Autowired
    UserDao userDao;
    @Autowired
    ProductDao productDao;
    private Integer pageNum;
    private Integer sizeNum;
    private String Shopid;

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
        Shopid = request.getParameter("id");
        YmShops ymShops = craftsmanDao.getById(Integer.parseInt(Shopid));
        model.addAttribute("show", ymShops);
        List<YmProduct> all = productDao.getByShopsId(Integer.parseInt(Shopid));
        model.addAttribute("productList", all);
        return "craftsmanAdd";
    }

    //直接从主页面跳转至添加页面
    @RequestMapping("/addpage")
    public String addpage(Model model) {
//        List<YmUser> all = userDao.findAll();
//        model.addAttribute("user",all);
        return "craftsmanAdd";
    }

    //在添加页面输入数据，然后保存到数据库，最后返回到数据列表中
    @RequestMapping("/addList")
    public String addList(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        String shopsName = request.getParameter("shopsName");
        String shopsSlogan = request.getParameter("shopsSlogan");
        String city = request.getParameter("city");
        String area = request.getParameter("area");
        String addrDetail = request.getParameter("addrDetail");
        String longitude = request.getParameter("longitude");
        String latitude = request.getParameter("latitude");
        String shopsDetail = request.getParameter("shopsDetail");
        String experience = request.getParameter("experience");
        String imgUrl = request.getParameter("imgUrl");
        String province = request.getParameter("province");
        YmShops ymShops = new YmShops();

        //此处一定要加判断ID是否为空，否怎会报错，即使不为空也报错
        if (id != null && !id.equals("") && !id.equals("null")) {
            ymShops.setId(Integer.parseInt(id));
        }

        ymShops.setShopsName(shopsName);
        ymShops.setShopsSlogan(shopsSlogan);
        ymShops.setCity(city);
        ymShops.setArea(area);
        ymShops.setAddrDetail(addrDetail);
        ymShops.setLongitude(longitude);
        ymShops.setLatitude(latitude);
        ymShops.setShopsDetail(shopsDetail);
        ymShops.setExperience(experience);
        ymShops.setProvince(province);

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

    //修改商品,此处为商品的回显
    @RequestMapping("/updatePro")
    public String deletePro(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        YmProduct ymProduct = productDao.getById(Integer.parseInt(id));
        model.addAttribute("product",ymProduct);
        return "craftsmanShopAdd";
    }

    //添加和修改更新商品，且保存数据库
    @RequestMapping("/productadd")
    public String productadd(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        String productName = request.getParameter("productName");
        String price = request.getParameter("price");
        String priceDq = request.getParameter("priceDq");
        String browse = request.getParameter("browse");
        String status = request.getParameter("status");
        String productPoint = request.getParameter("productPoint");
        String productImage = request.getParameter("productImage");
        String productDatile = request.getParameter("productDatile");

        YmProduct ymProduct = new YmProduct();
        //商品介绍未写
//        request.getParameter("");
//        request.getParameter("");
//        request.getParameter("");
//        request.getParameter("");
        if (id != null && id != "") {
            ymProduct.setId(Integer.parseInt(id));
        }
        ymProduct.setProductName(productName);
        BigDecimal bigDecimal = new BigDecimal(Double.parseDouble(price));
        ymProduct.setPrice(bigDecimal);
        ymProduct.setShopsId(Integer.parseInt(Shopid));
        BigDecimal bigDecimal1 = new BigDecimal(Double.parseDouble(priceDq));
        ymProduct.setPriceDq(bigDecimal1);
        ymProduct.setBrowse(Integer.parseInt(browse));
        ymProduct.setStatus(Integer.parseInt(status));
        ymProduct.setProductPoint(productPoint);
        ymProduct.setProductImage(productImage);
        ymProduct.setProductDatile(productDatile);
        //Date date = new Date();
        ymProduct.setCreateDate(new Date());
        productDao.save(ymProduct);
        return "redirect:/craftsman/show?id="+Shopid;
    }

    //删除商品信息
    @RequestMapping("/deletePro")
    public String deletePro(HttpServletRequest request){
        String id = request.getParameter("id");
        productDao.deleteById(Integer.parseInt(id));
        return "redirect:/craftsman/show?id="+Shopid;
    }

    //添加商品信息，首先返回页面
    @RequestMapping("/addPro")
    public String addPro(){
        return "craftsmanShopAdd";
    }


    //返回服务器资源
    @RequestMapping(value = "export_xls", method = RequestMethod.GET)
    public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
        String file = request.getParameter("file");
        return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH+file));
    }


}
