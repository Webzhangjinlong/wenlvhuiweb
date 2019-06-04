package com.suguang.service;


import com.suguang.dao.SchoolDao;
import com.suguang.dao.UserDao;
import com.suguang.domin.YmSchool;
import com.suguang.domin.YmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


/**
 * Created by 11491 on 2019/5/28.
 */

@Service
public class UserService {

    @Autowired
    UserDao userDao;
    public Page<YmUser> getUser(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmUser> sourceCodes= this.userDao.findAll(request);
        return sourceCodes;
    }
}
