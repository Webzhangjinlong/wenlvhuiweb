package com.suguang.dao;

import com.suguang.domin.YmFood;
import com.suguang.domin.YmPolicy;
import com.suguang.domin.YmRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 11491 on 2019/5/26.
 */

public interface HotelDao extends JpaRepository<YmRestaurant,Integer> {
     YmRestaurant getById(Integer id);
}