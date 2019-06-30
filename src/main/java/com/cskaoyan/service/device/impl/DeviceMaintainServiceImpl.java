package com.cskaoyan.service.device.impl;

import com.cskaoyan.bean.device.DeviceFault;
import com.cskaoyan.bean.device.DeviceMaintain;
import com.cskaoyan.mapper.device.DeviceMaintainMapper;
import com.cskaoyan.service.device.DeviceMaintainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceMaintainServiceImpl implements DeviceMaintainService {
    @Autowired
    DeviceMaintainMapper mapper;
    @Override
    public int addDeviceMaintain(DeviceMaintain deviceMaintain) {
        return mapper.addDeviceMaintain(deviceMaintain);
    }

    @Override
    public int updateDeviceMaintain(DeviceMaintain deviceMaintain) {
        return mapper.updateDeviceMaintain(deviceMaintain);
    }

    @Override
    public int deleteDeviceMaintain(String[] ids) {
      return mapper.deleteDeviceMaintain(ids);
    }

    @Override
    public List<DeviceMaintain> queryDeviceMaintainPage() {
        return mapper.queryDeviceMaintainPage();
    }

    @Override
    public DeviceFault getDeviceFaultById(String deviceFaultId) {
        return mapper.getDeviceFaultById(deviceFaultId);
    }

    @Override
    public List<DeviceFault> getDeviceFault() {
        return mapper.getDeviceFault();
    }
}
