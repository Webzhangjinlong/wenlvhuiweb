package com.suguang.dao;


import com.suguang.domin.YmSpaceDetail;
import com.suguang.domin.YmSpacePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Mr.King on 2019/6/3.
 */
public interface YmSpacePolicyDao extends JpaRepository<YmSpacePolicy,Integer> {
    YmSpacePolicy getById(Integer id);
    List<YmSpacePolicy> getBySpaceId(Integer spaceId);
}
