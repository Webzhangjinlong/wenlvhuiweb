package com.suguang.dao;

import com.suguang.domin.YmPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 11491 on 2019/5/26.
 */

public interface TagDao extends JpaRepository<YmPolicy,Integer> {
     YmPolicy getById(Integer id);
}