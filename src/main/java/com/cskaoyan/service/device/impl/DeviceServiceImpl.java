package com.cskaoyan.service.device.impl;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceType;
import com.cskaoyan.bean.employee.Department;
import com.cskaoyan.bean.employee.Employee;
import com.cskaoyan.mapper.device.DeviceMapper;
import com.cskaoyan.service.device.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceMapper mapper;

    @Override
    public int addDevice(Device device) {
        return mapper.addDevice(device);
    }

    @Override
    public int updateDevice(Device device) {
        return mapper.updateDevice(device);
    }

    @Override
    public int deleteDevice(String[] ids) {
        return mapper.deleteDevice(ids);
    }

    @Override
    public List<Device> queryDevicePage() {
        return mapper.queryDevicePage();
    }

    @Override
    public List<DeviceType> getDataDeviceType() {
        return mapper.getDataDeviceType();
    }

    @Override
    public DeviceType getDeviceTypeById(String deviceTypeId) {
        return mapper.getDeviceTypeById(deviceTypeId);
    }

    @Override
    public List<Department> getDepartment() {
        return mapper.getDepartment();
    }

    @Override
    public Employee getEmployee(String deviceKeeperId) {
        return mapper.getEmployee(deviceKeeperId);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return mapper.updateEmployee(employee);
    }
}
