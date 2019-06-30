package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Order;

import java.util.List;

public interface OrderService {
    List<Order> queryOrder();
    int insertOrder( Order order,String customId,String productId);

    Order queryOrderById(String orderId);

    int updateOrder(Order order,String id);

    int deleteOrder( String[] orderIds);

    List<Order> searchOrderById( String valueId);

    List<Order> searchOrderByCustomName( String[] cids);

    List<Order> searchOrderByProductName( String[] pids);


}
