package com.suguang.dao;

import com.suguang.domin.YmArtist;
import com.suguang.domin.YmSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by 11491 on 2019/6/1.
 */
public interface YmArtistDao extends JpaRepository<YmArtist,Integer> {
    YmArtist getById(Integer id);
}
