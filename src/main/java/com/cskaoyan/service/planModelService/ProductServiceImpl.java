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

    @Override
    public int insertProduct(Product product) {
        return productMapper.insertProduct(product);
    }

    @Override
    public Product queryProductById(String id) {
        return productMapper.queryProductById(id);
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }

    @Override
    public int deleteProduct(String[] ids) {
        return productMapper.deleteProduct(ids);
    }

    @Override
    public String[] searchPidByPname(String valuePName) {
        return productMapper.searchPidByPname(valuePName);
    }

    @Override
    public List<Product> searchProductByPid(String valueId) {
        return productMapper.searchProductByPid(valueId);
    }

    @Override
    public List<Product> searchProductByPtype(String valueType) {
        return productMapper.searchProductByPtype(valueType);
    }
}
