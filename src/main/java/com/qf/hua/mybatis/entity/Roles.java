package com.qf.hua.mybatis.entity;

import lombok.Data;

import java.util.List;

/**
 * 角色表
 */
@Data
public class Roles {
    private Integer roleId;

    /**
     * 角色的名称
     */
    private String roleName;

    /**
     * 角色的说明
     */
    private String declare;

    /**
     * 0 表示未删除 1 表示已删除
     */
    private Integer isDel;

    private Integer userId;

    private List<Privilege> privileges;
}