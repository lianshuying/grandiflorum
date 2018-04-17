package com.ulo.auth.server.dao;

import com.ulo.auth.server.po.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ILoginResp extends CrudRepository<User, Long> {

    /**
     * 验证用户名和密码
     * @param userName
     * @param password
     * @return
     */
    @Query(value = "select * from user_info  where password=?2 and user_name = ?1 ",nativeQuery = true)
    List<User> findByUserNameAndPassword(String userName, String password);

}
