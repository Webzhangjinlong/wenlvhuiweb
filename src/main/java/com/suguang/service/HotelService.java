package com.suguang.service;

import com.suguang.dao.HotelDao;
import com.suguang.domin.YmRestaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by 11491 on 2019/5/28.
 */

@Service
public class HotelService {

    /**
     * 查询所有活动
     * @return
     */

    @Autowired
    HotelDao hotelDao;
    public Page<YmRestaurant> getHotel(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmRestaurant> sourceCodes= this.hotelDao.findAll(request);
        return sourceCodes;
    }

}
