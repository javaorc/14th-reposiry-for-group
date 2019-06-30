package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Technology;

import java.util.List;

public interface TechnologyService {
    List<Technology> queryTechnology();

    Technology queryTechById(String techId);

    int updateTechByTid( Technology technology);
}
