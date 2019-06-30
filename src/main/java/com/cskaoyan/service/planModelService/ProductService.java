package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Product;

import java.util.List;

public interface ProductService {
    List<Product> queryProduct();
    int insertProduct(Product product);
    Product queryProductById(String id);

    int updateProduct(Product product);

    int deleteProduct(String[] ids);

    String[] searchPidByPname( String valuePName);

    List<Product> searchProductByPid( String valueId);

    List<Product> searchProductByPtype( String valueType);
}
