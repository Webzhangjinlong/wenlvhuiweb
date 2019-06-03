package com.suguang.dao;

import com.suguang.domin.YmFood;
import com.suguang.domin.YmProduct;
import com.suguang.domin.YmRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 11491 on 2019/5/26.
 */

public interface FoodDao extends JpaRepository<YmFood,Integer> {
     List<YmFood> getByRestaurantId(Integer restaurantId);
     YmFood getById(Integer id);
}