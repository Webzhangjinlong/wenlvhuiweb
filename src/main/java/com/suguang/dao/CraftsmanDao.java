package com.suguang.dao;

import com.suguang.domin.YmSchool;
import com.suguang.domin.YmShops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by 11491 on 2019/5/29.
 */
public interface CraftsmanDao extends JpaRepository<YmShops, Integer> {


//    @Query(value = "SELECT * FROM  ym_shops  LEFT JOIN ym_product ON ym_shops.id = ym_product.shops_id", nativeQuery = true)
//    List<YmShops> findAllList();
}

