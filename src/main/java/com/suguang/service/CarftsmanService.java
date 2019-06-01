package com.suguang.service;


import com.suguang.dao.CraftsmanDao;
import com.suguang.domin.YmShops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


/**
 * Created by 11491 on 2019/5/28.
 */

@Service
public class CarftsmanService {

    @Autowired
    CraftsmanDao craftsmanDao;
    public Page<YmShops> getcraft(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmShops> sourceCodes= this.craftsmanDao.findAll(request);
        return sourceCodes;
    }
}
