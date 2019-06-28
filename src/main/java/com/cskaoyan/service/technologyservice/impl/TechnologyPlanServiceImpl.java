package com.cskaoyan.service.technologyservice.impl;

import com.cskaoyan.mapper.technologymapper.TechnologyPlanMapper;
import com.cskaoyan.service.technologyservice.TechnologyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyPlanServiceImpl implements TechnologyPlanService {

    @Autowired
    private TechnologyPlanMapper technologyPlanMapper;
}
