package com.suguang.controller;

import com.suguang.dao.HotelDao;
import com.suguang.domin.YmFood;
import com.suguang.domin.YmRestaurant;
import com.suguang.domin.YmWenlv;
import com.suguang.service.HotelService;
import org.apache.ibatis.ognl.DynamicSubscript;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.apache.ibatis.ognl.DynamicSubscript.all;

/**
 * Created by 11491 on 2019/5/29.
 */

@Controller
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelDao hotelDao;
    @Autowired
    private HotelService hotelService;
    private int pageNum;
    private int sizeNum;


    //查询所有
    @GetMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;

        

        Page<YmRestaurant> sourceCode = hotelService.getHotel(pageNum, sizeNum);
        model.addAttribute("hotelList", sourceCode);
        return "hotelList";
    }

//    //查询所有
//    @RequestMapping("/list")
//    public String findList(Model model){
//        List<YmRestaurant> all = hotelDao.findAll();
//        model.addAttribute("hotelList", all);
//        return "hotelList";
//    }

    //修改
    //获取修改页，并且将需要修改的信息回显在修改页上
    @RequestMapping("/update")
    public String showUpdate(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        if(id != null && !id.equals("") && !id.equals("null")){
            YmRestaurant result = hotelDao.getById(Integer.parseInt(id));
            model.addAttribute("hotel",result);
            return "hotelAdd";
        }
        return "";
    }

    //获取添加页面
    @RequestMapping("/add")
    public  String add(){
        return "hotelAdd";
    }

    //在文本框输入数据，然后保存在数据库
    @RequestMapping("/preUpdate")
    public String preUpdate(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        String restaurantName = request.getParameter("restaurantName");
        String restaurantType = request.getParameter("restaurantType");
        //request.getParameter("");
        String averageConsumption = request.getParameter("averageConsumption");
        String starClass = request.getParameter("starClass");
        String city = request.getParameter("city");
        String area = request.getParameter("area");
        String addrDetail = request.getParameter("addrDetail");
        String longitude = request.getParameter("longitude");
        String latitude = request.getParameter("latitude");

        YmRestaurant ymRestaurant = new YmRestaurant();

        //此处一定要加判断ID是否为空，否怎会报错，即使不为空也报错
        if(id != null && !id.equals("") && !id.equals("null")) {
            ymRestaurant.setId(Integer.parseInt(id));
        }
        ymRestaurant.setRestaurantName(restaurantName);
        ymRestaurant.setRestaurantType(restaurantType);
        ymRestaurant.setAverageConsumption(Integer.parseInt(averageConsumption));
        ymRestaurant.setStarClass(Integer.parseInt(starClass));
        ymRestaurant.setCity(city);
        ymRestaurant.setArea(area);
        ymRestaurant.setAddrDetail(addrDetail);
        ymRestaurant.setLongitude(longitude);
        ymRestaurant.setLatitude(latitude);
        YmRestaurant save = hotelDao.save(ymRestaurant);
        model.addAttribute("hotel", save);

     
        return "redirect:/hotel/list?page=" + pageNum + "&size=" + sizeNum;
       // return "redirect:/hotel/list";
    }

    //餐厅删除
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
        String id = request.getParameter("id");
        if(id != null && !id.equals("") && !id.equals("null")) {
            hotelDao.deleteById(Integer.parseInt(id));

       
            return "redirect:/hotel/list?page=" + pageNum + "&size=" + sizeNum;
           // return "redirect:/hotel/list";
        }
        return "/";
    }


}
