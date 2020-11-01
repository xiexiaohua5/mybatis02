package com.qf.hua.mybatis.mapper;


import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteUser(@Param("userId") int userId);

}