package com.suguang.dao;

import com.suguang.domin.YmFood;
import com.suguang.domin.YmProduct;
import com.suguang.domin.YmShops;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by 11491 on 2019/5/29.
 */
//匠人信息及就是商家信息
public interface ProductDao extends JpaRepository<YmProduct, Integer> {
    YmProduct getById(Integer id);

//    @Query(value = "SELECT * FROM  ym_shops  LEFT JOIN ym_product ON ym_shops.id = ym_product.shops_id", nativeQuery = true)
//    List<YmShops> findAllList();
}

