package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper {
    List<Custom> queryCustom();
    int insertCustom(@Param("custom") Custom custom);
    Custom queryCustomById(@Param("id") String id);

    int updateCustom(@Param("custom") Custom custom);

    int deleteCustom(@Param("ids") String[] ids);

    String[] searchCidByCname(@Param("cname") String valueCName);

    List<Custom> searchCustomByCid(@Param("cid") String valueId);
}
