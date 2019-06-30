package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Technology;
import com.cskaoyan.mapper.planModelMapper.TechnologyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TechnologyServiceImpl implements  TechnologyService {
    @Autowired
    TechnologyMapper technologyMapper;
    @Override
    public List<Technology> queryTechnology() {
        return technologyMapper.queryTechnology();
    }

    @Override
    public Technology queryTechById(String techId) {
        return technologyMapper.queryTechById(techId);
    }

    @Override
    public int updateTechByTid(Technology technology) {
        return technologyMapper.updateTechByTid(technology);
    }
}
