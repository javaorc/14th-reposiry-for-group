package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Work;
import com.cskaoyan.mapper.planModelMapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkServiceImpl implements  WorkService {
    @Autowired
    WorkMapper workMapper;
    @Override
    public List<Work> queryWork() {
        return workMapper.queryWork();
    }
}
