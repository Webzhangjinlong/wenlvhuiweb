package com.suguang.dao;

import com.suguang.domin.YmSchool;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 11491 on 2019/5/27.
 */

public interface SchoolDao extends JpaRepository<YmSchool,Integer> {

    @Query(value = "select * from ym_school order by create_date desc  limit #{startNum},#{endNum} ", nativeQuery = true)

   //SELECT * FROM domain_db.traffic_info WHERE id = #{id}
//   select * from student limit #{start},#{end};


    List<YmSchool> findAllList();


}

