package com.suguang.dao;

import com.suguang.domin.YmSpace;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mr.King on 2019/6/3.
 */
public interface YmSpaceDao  extends JpaRepository<YmSpace,Integer> {
    YmSpace getById(Integer id);

}
