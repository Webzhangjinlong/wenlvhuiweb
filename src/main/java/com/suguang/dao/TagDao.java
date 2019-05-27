package com.suguang.dao;

import com.suguang.domin.YmPolicy;
import com.suguang.domin.YmUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 11491 on 2019/5/26.
 */

public interface TagDao extends JpaRepository<YmPolicy,Integer> {
    public YmPolicy getById(Integer id);
}