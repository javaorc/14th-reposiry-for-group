package com.cskaoyan.service.technologyservice.impl;

import com.cskaoyan.mapper.technologymapper.ProcessMapper;
import com.cskaoyan.service.technologyservice.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private ProcessMapper processMapper;

}
