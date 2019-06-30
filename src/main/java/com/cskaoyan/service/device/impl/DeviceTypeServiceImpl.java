package com.cskaoyan.service.device.impl;

import com.cskaoyan.bean.device.DeviceType;
import com.cskaoyan.mapper.device.DeviceTypeMapper;
import com.cskaoyan.service.device.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceTypeServiceImpl implements DeviceTypeService {
    @Autowired
    DeviceTypeMapper mapper;
    @Override
    public int addDeviceType(DeviceType deviceType) {
        return mapper.addDeviceType(deviceType);
    }

    @Override
    public int updateDeviceType(DeviceType deviceType) {
        return mapper.updateDeviceType(deviceType);
    }

    @Override
    public int deleteDeviceType(String[] id) {
        return mapper.deleteDeviceType(id);
    }

    @Override
    public List<DeviceType> queryDeviceTypePage() {

        return mapper.queryDeviceTypePage();
    }

}
