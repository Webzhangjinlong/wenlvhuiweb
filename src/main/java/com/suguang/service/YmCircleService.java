package com.suguang.service;


import com.suguang.dao.YmCircleDao;
import com.suguang.domin.YmCircle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


/**
 * Created by 11491 on 2019/5/28.
 */

@Service
public class YmCircleService {

    @Autowired
    YmCircleDao ymCircleDao;
    public Page<YmCircle> getYmCircle(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmCircle> sourceCodes= this.ymCircleDao.findAll(request);
        return sourceCodes;
    }
}
