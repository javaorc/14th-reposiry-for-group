package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Product;
import com.cskaoyan.mapper.planModelMapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<Product> queryProduct() {
        return productMapper.queryProduct();
    }
}
