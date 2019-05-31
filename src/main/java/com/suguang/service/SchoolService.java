package com.suguang.service;


import com.suguang.dao.SchoolDao;
import com.suguang.domin.YmSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;



/**
 * Created by 11491 on 2019/5/28.
 */

@Service
public class SchoolService {

    @Autowired
    SchoolDao schoolDao;
    public Page<YmSchool> getSchool(int pageNumber,int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmSchool> sourceCodes= this.schoolDao.findAll(request);
        return sourceCodes;
    }
}
