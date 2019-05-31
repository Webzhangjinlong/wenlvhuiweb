package com.suguang.dao;

import com.suguang.domin.YmSchool;
import com.suguang.domin.YmWenlv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by 11491 on 2019/5/27.
 */
public interface WenLvDao extends JpaRepository<YmWenlv,Integer> {
     YmWenlv getById(Integer id);

     @Query(value = "SELECT ym_wenlv.*, ym_user.name AS username\n" +
             "     FROM ym_user\n" +
             "     LEFT JOIN ym_wenlv ON ym_wenlv.create_user = ym_user.id\n" +
             "     WHERE ym_user.id = 5; ", nativeQuery = true)
     List<YmWenlv> findAllList();


}
