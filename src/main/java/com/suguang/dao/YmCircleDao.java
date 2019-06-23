package com.suguang.dao;

import com.suguang.domin.YmArtist;
import com.suguang.domin.YmCircle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mr.zhang on 2019/6/22.
 */
public interface YmCircleDao extends JpaRepository<YmCircle,Integer> {
    YmCircle getById(Integer id);
}
