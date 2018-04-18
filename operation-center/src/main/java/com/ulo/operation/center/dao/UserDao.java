package com.ulo.operation.center.dao;


import com.ulo.operation.center.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from system_user where user_name = #{username}")
    User findByName(@Param("username") String username);


    @Insert("insert into system_user (user_name, pass_word) VALUES(#{username}, #{password})")
    int insert(@Param("username") String name, @Param("password") String password);



}
