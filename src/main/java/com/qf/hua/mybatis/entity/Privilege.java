package com.qf.hua.mybatis.entity;

import lombok.Data;

import java.util.List;

/**
    * 权限表
    */
@Data
public class Privilege {
    private Integer privilegeId;

    /**
    * 权限的名称 例如 add
    */
    private String name;

    /**
    * 权限的说明
    */
    private String declare;

    /**
    * 0 表示未删除 1 表示已删除
    */
    private Integer isDel;

    private List<Roles> roles;
}