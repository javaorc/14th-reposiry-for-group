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
}
