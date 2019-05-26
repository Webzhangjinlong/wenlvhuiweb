package com.suguang.dao;




import com.suguang.domin.YmUser;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by 11491 on 2019/5/26.
 */
public interface LoginDao extends JpaRepository<YmUser,Integer> {
    //根据密码账号判断

    public YmUser getByPasswordAndUsername(String username,String password);

}
