package com.suguang.service;


import com.suguang.dao.YmArtistDao;
import com.suguang.domin.YmArtist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


/**
 * Created by 11491 on 2019/5/28.
 */

@Service
public class ArtistService {

    @Autowired
    YmArtistDao artistDao;
    public Page<YmArtist> getYmArtist(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber-1,pageSize);
        Page<YmArtist> sourceCodes= this.artistDao.findAll(request);
        return sourceCodes;
    }
}
