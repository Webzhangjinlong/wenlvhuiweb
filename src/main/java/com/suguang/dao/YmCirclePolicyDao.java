package com.suguang.dao;

import com.suguang.domin.YmCirclePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Mr.zhang on 2019/6/22.
 */
public interface YmCirclePolicyDao extends JpaRepository<YmCirclePolicy,Integer>{
    YmCirclePolicy getById(Integer id);
}
