package com.suguang.service;

import com.suguang.dao.SchoolDao;
import com.suguang.domin.YmSchool;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    SchoolDao schoolDao;
    @PersistenceContext
    EntityManager em;

    /**
     * 查询所有活动
     * @return
     */
//    public List<YmSchool> findAllStudent(){
//
//        return pageDao.findAll();
//    }


//    /**
//     * 分页获取所有的活动
//     * @param size
//     * @param page
//     * @return
//     */
//    public Paging findAllSchoolByPage(int page, int size){
//
//        PageRequest pageRequest = new PageRequest(page, size);
//
//        return (Paging) schoolDao.findAll(pageRequest);
//    }

    /**
     * 自定义分页获取所有活动
     * @param page
     * @param size
     */
//    public Paging findAllSchoolByMypage(int page, int size){
//
//
//		/*分页查询数据*/
//        Query query = em.createNativeQuery("SELECT * FROM ym_school s LIMIT " + (page-1)*size + "," + size);
//        List<YmSchool> schoolList = query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
//
//		/*查询总共的数据条目*/
//        query = em.createNativeQuery("SELECT COUNT(*) FROM ym_school");
//        Object object = query.getResultList().get(0);
//        int totalElements = Integer.parseInt(object.toString());
//
//		/*构建自定义Page对象*/
//        Paging pageUtil = new Paging(size, page, totalElements);
//        pageUtil.setNumberOfElements(schoolList.size());
//        pageUtil.setContent(schoolList);
//
//        return pageUtil;
//    }
}
