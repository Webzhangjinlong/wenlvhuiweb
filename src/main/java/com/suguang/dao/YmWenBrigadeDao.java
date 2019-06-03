package com.suguang.dao;

import com.suguang.domin.YmWenBrigade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mr.King on 2019/6/4.
 */
public interface YmWenBrigadeDao  extends JpaRepository<YmWenBrigade,Integer> {
    YmWenBrigade getById(Integer id);
}
