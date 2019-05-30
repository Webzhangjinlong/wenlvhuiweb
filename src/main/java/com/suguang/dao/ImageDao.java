package com.suguang.dao;

import com.suguang.domin.YmImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<YmImage,Integer> {
    YmImage getById(Integer id);
}
