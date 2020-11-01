package com.qf.hua.mybatis.mapper;

import com.qf.hua.mybatis.entity.Order1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Order1Mapper {

    Order1 selectOrderByOrderId(Integer orderId);

    List<Order1> selectOrderByUserId(@Param("usrId")int usrId);

}