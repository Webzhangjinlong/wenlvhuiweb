package com.suguang.dao;


import com.suguang.domin.YmBook;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface BookDao extends JpaRepository<YmBook, Integer> {
    YmBook getById(Integer id);


}
