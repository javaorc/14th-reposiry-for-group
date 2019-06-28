package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Manufacture;
import com.cskaoyan.mapper.planModelMapper.ManufactureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManufactureServiceImpl implements ManufactureService {
    @Autowired
    ManufactureMapper manufactureMapper;
    @Override
    public List<Manufacture> queryManufacture() {
        return manufactureMapper.queryManufature();
    }
}
