package com.suguang.dao;

import com.suguang.domin.YmArtist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Created by 11491 on 2019/5/28.
 */
@Repository
public interface ArtistPageDao extends JpaRepository<YmArtist, Integer>{

}