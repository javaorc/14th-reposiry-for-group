package com.cskaoyan.service.device.impl;

import com.cskaoyan.bean.device.DeviceFault;
import com.cskaoyan.mapper.device.DeviceFaultMapper;
import com.cskaoyan.service.device.DeviceFaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceFaultServiceImpl implements DeviceFaultService {
    @Autowired
    DeviceFaultMapper mapper;
    @Override
    public int addDeviceFault(DeviceFault deviceFault) {
        return mapper.addDeviceFault(deviceFault);
    }

    @Override
    public int updateDeviceFault(DeviceFault deviceFault) {
        return mapper.updateDeviceFault(deviceFault);
    }

    @Override
    public int deleteDeviceFault(String[] ids) {
        return mapper.deleteDeviceFault(ids);
    }

    @Override
    public List<DeviceFault> queryDeviceFaultpage() {
        return mapper.queryDeviceFaultpage();
    }
}
