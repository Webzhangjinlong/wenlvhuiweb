package com.suguang.dao;

import com.suguang.domin.YmUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<YmUser,Integer> {
     YmUser getById(Integer id);


}
