package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Order;
import com.cskaoyan.mapper.planModelMapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> queryOrder() {
        return orderMapper.queryOrder();
    }

    @Override
    public int insertOrder(Order order,String customId,String productId) {
        return orderMapper.insertOrder(order,customId,productId);
    }

    @Override
    public Order queryOrderById(String orderId) {
        return orderMapper.queryOrderById(orderId);
    }

    @Override
    public int updateOrder(Order order,String id) {
        return orderMapper.updateOrder(order,id);
    }

    @Override
    public int deleteOrder(String[] orderIds) {
        return orderMapper.deleteOrder(orderIds);
    }

    @Override
    public List<Order> searchOrderById(String valueId) {
        return orderMapper.searchOrderById(valueId);
    }

    @Override
    public List<Order> searchOrderByCustomName(String[] cids) {
        return orderMapper.searchOrderByCustomName(cids);
    }

    @Override
    public List<Order> searchOrderByProductName(String[] pids) {
        return orderMapper.searchOrderByProductName(pids);
    }
}
