package com.cskaoyan.service.technologyservice.impl;

import com.cskaoyan.bean.technologybean.Technology;
import com.cskaoyan.mapper.technologymapper.TechnologyMapper;
import com.cskaoyan.service.technologyservice.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Autowired
    private TechnologyMapper technologyMapper;

    @Override
    public void insert(Technology technology) {
        technologyMapper.insert(technology);
    }

}
