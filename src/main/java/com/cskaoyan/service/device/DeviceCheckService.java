package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceCheck;
import com.cskaoyan.bean.employee.Employee;

import java.util.List;

public interface DeviceCheckService {
    //新增例检
    int addDeviceCheck(DeviceCheck deviceCheck);
    //修改例检
    int updateDeviceCheck(DeviceCheck deviceCheck);
    //删除例检
    int deleteDeviceCheck(String[] ids);

    List<DeviceCheck> queryDeviceCheckPage();


    Device getDeviceById(String deviceId);

    List<Device> getDevice();

    List<Employee> getEmployee();



}
