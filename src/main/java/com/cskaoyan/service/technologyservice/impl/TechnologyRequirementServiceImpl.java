package com.cskaoyan.service.technologyservice.impl;

import com.cskaoyan.mapper.technologymapper.TechnologyRequirementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyRequirementServiceImpl {

    @Autowired
    TechnologyRequirementMapper technologyRequirementMapper;

}
