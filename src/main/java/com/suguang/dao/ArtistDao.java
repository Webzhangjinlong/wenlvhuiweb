package com.suguang.dao;
import com.suguang.domin.YmArtist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by 11491 on 2019/5/26.
 */
public interface ArtistDao extends JpaRepository<YmArtist,Integer> {
    @Query(value = "select * from ym_artist order by create_date desc  limit #{startNum},#{endNum} ", nativeQuery = true)
    List<YmArtist> findAllList();

    YmArtist getById(Integer id);
}
