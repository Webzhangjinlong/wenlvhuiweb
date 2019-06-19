package com.suguang.controller;

import com.suguang.dao.FoodDao;
import com.suguang.dao.HotelDao;
import com.suguang.domin.YmFood;
import com.suguang.domin.YmRestaurant;
import com.suguang.domin.YmWenlv;
import com.suguang.service.HotelService;
import com.suguang.util.YmStaticVariablesUtil;
import org.apache.ibatis.ognl.DynamicSubscript;
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
    @Autowired
    private FoodDao foodDao;

    private Integer pageNum;
    private Integer sizeNum;
    private String hotelid;


    //查询所有
    @GetMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;

        Page<YmRestaurant> sourceCode = hotelService.getHotel(pageNum, sizeNum);
        model.addAttribute("hotelList", sourceCode);
        return "hotelList";
    }

    //修改
    //获取修改页，并且将需要修改的信息回显在修改页上
    @RequestMapping("/update")
    public String showUpdate(HttpServletRequest request,Model model){
        hotelid = request.getParameter("id");
        if(hotelid != null && !hotelid.equals("") && !hotelid.equals("null")){
            YmRestaurant result = hotelDao.getById(Integer.parseInt(hotelid));
            model.addAttribute("hotel",result);
            List<YmFood> foods = foodDao.getByRestaurantId(Integer.parseInt(hotelid));
            model.addAttribute("foodList",foods);
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
        String restaurantImg = request.getParameter("restaurantImg");
        String restaurantBackimage = request.getParameter("restaurantBackimage");
        String restaurantTag = request.getParameter("restaurantTag");
        String restaurantDetail = request.getParameter("restaurantDetail");

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
        ymRestaurant.setRestaurantImg(restaurantImg);
        ymRestaurant.setRestaurantBackimage(restaurantBackimage);
        ymRestaurant.setRestaurantTag(Integer.parseInt(restaurantTag));
        ymRestaurant.setRestaurantDetail(restaurantDetail);
        YmRestaurant save = hotelDao.save(ymRestaurant);
        model.addAttribute("hotel", save);

        if (pageNum==null) {
            pageNum =1;
        }
        if (sizeNum ==null) {
            sizeNum =10;
        }
     
        return "redirect:/hotel/list?page=" + pageNum + "&size=" + sizeNum;
    }

    //餐厅删除
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request){
        String id = request.getParameter("id");
        if(id != null && !id.equals("") && !id.equals("null")) {
            hotelDao.deleteById(Integer.parseInt(id));

            return "redirect:/hotel/list?page=" + pageNum + "&size=" + sizeNum;
        }
        return "/";
    }

    //通过饭店id获取菜品，并且渲染页面
    @RequestMapping("/updateFood")
    public String updateFood(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        YmFood ymFood = foodDao.getById(Integer.parseInt(id));
        model.addAttribute("ymFood",ymFood);
        return "hotelFoodAdd";
    }

    //修改添加菜品
    @RequestMapping("/addUpdate")
    public String addUpdate(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        String foodName = request.getParameter("foodName");
        String foodType = request.getParameter("foodType");
        String foodPrice = request.getParameter("foodPrice");
        String imgUrl = request.getParameter("imgUrl");
        String videoUrl = request.getParameter("videoUrl");
        String foodDetail = request.getParameter("foodDetail");
        String upNum = request.getParameter("upNum");
        String imgOrVideo = request.getParameter("imgOrVideo");

        YmFood ymFood = new YmFood();

        if (id != null && !id.equals("") && !id.equals("null")) {
            ymFood.setId(Integer.parseInt(id));
        }
        ymFood.setFoodName(foodName);
        ymFood.setRestaurantId(Integer.parseInt(hotelid));
        ymFood.setFoodType(Integer.parseInt(foodType));
        BigDecimal bigDecimal1 = new BigDecimal(Double.parseDouble(foodPrice));
        ymFood.setFoodPrice(bigDecimal1);
        ymFood.setUpNum(Integer.parseInt(upNum));
        ymFood.setImgUrl(imgUrl);
        ymFood.setVideoUrl(videoUrl);
        ymFood.setFoodDetail(foodDetail);
        ymFood.setImgOrVideo(Integer.parseInt(imgOrVideo));
        //富文本和上传视频图片未写
        foodDao.save(ymFood);

        return "redirect:/hotel/update?id="+hotelid;

    }

    //跳转添加页面
    @RequestMapping("/addFood")
    public String addFood(HttpServletRequest request){
        return "hotelFoodAdd";
    }

    //删除菜单菜品
    @RequestMapping("/deleteFood")
    public String deleteFood(HttpServletRequest request){
        String id = request.getParameter("id");
        foodDao.deleteById(Integer.parseInt(id));
        return "redirect:/hotel/update?id="+hotelid;
    }

    //返回服务器资源
    @RequestMapping(value = "export_xls", method = RequestMethod.GET)
    public ResponseEntity<FileSystemResource> exportXls(HttpServletRequest request) {
        String file = request.getParameter("file");
        return UploadController.export(new File(YmStaticVariablesUtil.UPLOAD_PATH+file));
    }

}
