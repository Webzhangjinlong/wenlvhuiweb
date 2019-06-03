package com.suguang.dao;

import com.suguang.domin.YmImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Mr.King on 2019/6/3.
 */
public interface ImgDao extends JpaRepository<YmImage,Integer> {

    //    @Query(value = "select   *  from ym_image  where img_type = 4 and pid = ?id", nativeQuery = true)
    List<YmImage> getByImgTypeAndPid(Integer imgType, Integer pid);

    YmImage getByImgTypeAndPidAndImageType(Integer imgType,Integer pid,Integer imageType);

}
