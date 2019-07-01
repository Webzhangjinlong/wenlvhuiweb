package com.suguang.dao;


import com.suguang.domin.YmDataDictionary;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface DictiopnaryDao extends JpaRepository<YmDataDictionary, Integer> {
    YmDataDictionary getById(Integer id);
}
