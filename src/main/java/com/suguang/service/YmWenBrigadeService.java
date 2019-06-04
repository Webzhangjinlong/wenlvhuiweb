package com.suguang.service;

import com.suguang.dao.YmWenBrigadeDao;
import com.suguang.domin.YmWenbrigade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by Mr.King on 2019/6/4.
 */
@Service
public class YmWenBrigadeService {
    @Autowired
    YmWenBrigadeDao ymWenBrigadeDao;
    public Page<YmWenbrigade> getWenBrigade(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmWenbrigade> sourceCodes= this.ymWenBrigadeDao.findAll(request);
        return sourceCodes;
    }
}
