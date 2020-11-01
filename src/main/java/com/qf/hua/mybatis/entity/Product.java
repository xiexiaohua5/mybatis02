package com.qf.hua.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Product {
    /**
    * 主键
    */
    private Integer productId;

    /**
    * 商品的标题
    */
    private String title;

    /**
    * 商品信息
    */
    private String content;

    /**
    * 商品的图片
    */
    private String img;

    /**
    * 商品的价格
    */
    private BigDecimal price;

    /**
    * 创建时间
    */
    private Date createDate;

    /**
    * 0 表示未删除 1 表示已删除
    */
    private Integer status;

    private Integer cateId;
}