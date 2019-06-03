package com.suguang.dao;

import com.suguang.domin.YmProduct;
import com.suguang.domin.YmUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by 11491 on 2019/5/29.
 */
//匠人信息及就是商家信息
public interface ProductDao extends JpaRepository<YmProduct, Integer> {
    YmProduct getById(Integer id);

    List<YmProduct> getByShopsId(Integer shopsId);
//    @Query(value = "SELECT * FROM  ym_shops  LEFT JOIN ym_product ON ym_shops.id = ym_product.shops_id", nativeQuery = true)
//    List<YmShops> findAllList();
}

