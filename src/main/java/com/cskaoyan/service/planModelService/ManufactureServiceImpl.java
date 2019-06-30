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

    @Override
    public int insertManufacture(Manufacture manufacture, String OrderId, String technologyId) {
        return manufactureMapper.insertManufacture(manufacture,OrderId,technologyId);
    }

    @Override
    public Manufacture queryManuById(String manufactureSn) {
        return manufactureMapper.queryManuById(manufactureSn);
    }

    @Override
    public int updateManu(Manufacture manufacture) {
        return manufactureMapper.updateManu(manufacture);
    }

    @Override
    public int deleteManu(String[] ids) {
        return manufactureMapper.deleteManu(ids);
    }

    @Override
    public List<Manufacture> searchManuByMsn(String valueSn) {
        return manufactureMapper.searchManuByMsn(valueSn);
    }

    @Override
    public List<Manufacture> searchManuByOId(String valueOid) {
        return manufactureMapper.searchManuByOId(valueOid);
    }

    @Override
    public List<Manufacture> searchManuByTname(String valueTname) {
        return manufactureMapper.searchManuByTname(valueTname);
    }
}
