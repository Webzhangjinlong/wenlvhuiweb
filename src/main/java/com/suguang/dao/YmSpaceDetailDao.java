package com.suguang.dao;

import com.suguang.domin.YmArtist;
import com.suguang.domin.YmSpace;
import com.suguang.domin.YmSpaceDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Mr.King on 2019/6/3.
 */
public interface YmSpaceDetailDao extends JpaRepository<YmSpaceDetail, Integer> {
    YmSpaceDetail getById(Integer id);

    List<YmSpaceDetail> getBySpaceId(Integer spaceId);
}
