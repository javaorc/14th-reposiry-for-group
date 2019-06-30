package com.cskaoyan.service.device.impl;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceCheck;
import com.cskaoyan.bean.employee.Employee;
import com.cskaoyan.mapper.device.DeviceCheckMapper;
import com.cskaoyan.service.device.DeviceCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceCheckServiceImpl implements DeviceCheckService {
    @Autowired
    DeviceCheckMapper mapper;
    @Override
    public int addDeviceCheck(DeviceCheck deviceCheck) {
        return mapper.addDeviceCheck(deviceCheck);
    }

    @Override
    public int updateDeviceCheck(DeviceCheck deviceCheck) {
        return mapper.updateDeviceCheck(deviceCheck);
    }

    @Override
    public int deleteDeviceCheck(String[] ids) {
        return mapper.deleteDeviceCheck(ids);
    }

    @Override
    public List<DeviceCheck> queryDeviceCheckPage() {
        return mapper.queryDeviceCheckPage();
    }

    @Override
    public Device getDeviceById(String deviceId) {
        return mapper.getDeviceById(deviceId);
    }

    @Override
    public List<Device> getDevice() {
        return mapper.getDevice();
    }

    @Override
    public List<Employee> getEmployee() {
        return mapper.getEmployee();
    }
}
