package com.qf.hua.mybatis.mapper;

import com.qf.hua.mybatis.entity.Roles;import org.apache.ibatis.annotations.Param;


public interface RolesMapper {
    Roles selectByUserId(@Param("userId") int userId);
}