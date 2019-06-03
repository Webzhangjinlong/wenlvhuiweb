package com.suguang.dao;


import com.suguang.domin.YmBookTag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface BookTagDao extends JpaRepository<YmBookTag, Integer> {
    YmBookTag getById(Integer id);
}
