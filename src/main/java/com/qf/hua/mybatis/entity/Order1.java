package com.qf.hua.mybatis.entity;

import lombok.Data;

import java.util.List;

/**
    * 订单表
    */
@Data
public class Order1 {
    private Integer orderId;

    /**
    * 订单号
    */
    private Integer orderNo;

    /**
    * 创建时间
    */
    private Integer createDate;

    /**
    * 0 表示未支付状态，1 表示已支付状态
    */
    private Integer status;

    /**
    * 用户Id
    */
    private Integer userId;

    private User user;

    private List<OrderItem> orderItems;
}