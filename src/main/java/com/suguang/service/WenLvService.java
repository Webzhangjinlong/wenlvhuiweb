package com.suguang.service;

import com.suguang.dao.SchoolDao;
import com.suguang.dao.WenLvDao;
import com.suguang.domin.YmSchool;
import com.suguang.domin.YmWenlv;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by 11491 on 2019/5/28.
 */

@Service
public class WenLvService {

    /**
     * 查询所有活动
     * @return
     */

    @Autowired
    WenLvDao wenLvDao;
    public Page<YmWenlv> getWenLv(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmWenlv> sourceCodes= this.wenLvDao.findAll(request);
        return sourceCodes;
    }

}
