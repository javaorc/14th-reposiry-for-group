package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    List<Order> queryOrder();
    int insertOrder(@Param("order") Order order,@Param("customId") String customId,@Param("productId") String ProductId);

    Order queryOrderById(@Param("id") String orderId);

    int updateOrder(@Param("order") Order order,@Param("id") String orderId);

    int deleteOrder(@Param("ids") String[] orderIds);

    List<Order> searchOrderById(@Param("id") String valueId);

    List<Order> searchOrderByCustomName(@Param("cids") String[]  cids);

    List<Order> searchOrderByProductName(@Param("pids") String[] pids);


}
