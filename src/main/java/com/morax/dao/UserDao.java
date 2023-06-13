package com.morax.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    @Insert("insert into users(user,password) values(username,password)")
    void createUser(@Param("username") String username,@Param("password") String password);
}
