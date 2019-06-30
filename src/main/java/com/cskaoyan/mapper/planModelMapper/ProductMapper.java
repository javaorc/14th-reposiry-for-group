package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Product;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.AnnotatedParameterizedType;
import java.util.List;

public interface ProductMapper {
    List<Product>  queryProduct();
    int insertProduct(@Param("product") Product product);
    Product queryProductById(@Param("id") String id);

    int updateProduct(@Param("product") Product product);

    int deleteProduct(@Param("ids") String[] ids);

    String[] searchPidByPname(@Param("pname") String valuePName);

    List<Product> searchProductByPid(@Param("pid") String valueId);

    List<Product> searchProductByPtype(@Param("ptype") String valueType);
}
