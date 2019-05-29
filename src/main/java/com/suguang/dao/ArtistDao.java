package com.suguang.dao;
import com.suguang.domin.YmUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 11491 on 2019/5/26.
 */
public interface ArtistDao extends JpaRepository<YmUser,Integer> {
}
