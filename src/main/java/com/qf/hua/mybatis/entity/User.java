package com.qf.hua.mybatis.entity;

import lombok.Data;

/**
 * 用户表
 */
@Data
public class User {
    /**
     * 主键
     */
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态 0表示未删除 1表示删除
     */
    private Integer status;
}