package com.suguang.service;

import com.suguang.dao.TagDao;
import com.suguang.dao.WenLvDao;
import com.suguang.domin.YmPolicy;
import com.suguang.domin.YmWenlv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by 11491 on 2019/5/28.
 */

@Service
public class TagService {

    /**
     * 查询所有活动
     * @return
     */

    @Autowired
    TagDao tagDao;
    public Page<YmPolicy> getTag(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmPolicy> sourceCodes= this.tagDao.findAll(request);
        return sourceCodes;
    }

}
