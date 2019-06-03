package com.suguang.service;


import com.suguang.dao.YmSpaceDao;
import com.suguang.domin.YmSpace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * Created by Mr.King on 2019/6/3.
 */
public class YmSpaceService {
    @Autowired
    YmSpaceDao SpaceDao;
    public Page<YmSpace> getSpace(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmSpace> sourceCodes= this.SpaceDao.findAll(request);
        return sourceCodes;
    }
}
