package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Technology;
import org.apache.ibatis.annotations.Param;
import sun.nio.ch.AbstractPollArrayWrapper;

import java.util.List;

public interface TechnologyMapper {
    List<Technology> queryTechnology();
    Technology queryTechById(@Param("id") String techId);

    int updateTechByTid(@Param("tech") Technology technology);
}
