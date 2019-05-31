package com.suguang.dao;

import com.suguang.domin.YmPolicy;
import com.suguang.domin.YmSchool;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 11491 on 2019/5/27.
 */

public interface SchoolDao extends JpaRepository<YmSchool,Integer> {

    YmSchool getById(Integer id);
}


