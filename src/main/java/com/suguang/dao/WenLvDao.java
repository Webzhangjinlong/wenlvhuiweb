package com.suguang.dao;

import com.suguang.domin.YmWenlv;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 11491 on 2019/5/27.
 */
public interface WenLvDao extends JpaRepository<YmWenlv,Integer> {
     YmWenlv getById(Integer id);
}
