package com.qf.hua.mybatis.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
    * 订单表
    */
@Data
public class OrderItem {
    /**
    * 订单
    */
    private Integer itemId;

    /**
    * 订单号
    */
    private Integer orderId;

    /**
    * 商品名称
    */
    private String productName;

    /**
    * 图片
    */
    private String productImg;

    /**
    * 价格
    */
    private BigDecimal productPrice;

    /**
    * 产品数量
    */
    private Integer productQuantity;
}