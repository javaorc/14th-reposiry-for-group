package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Custom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomMapper {
    List<Custom> queryCustom();
    int insertCustom(@Param("custom") Custom custom);
}
