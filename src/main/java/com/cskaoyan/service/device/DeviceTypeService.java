package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.DeviceType;

import java.util.List;

public interface DeviceTypeService {
    //新增设备种类
    int addDeviceType(DeviceType deviceType);
    //修改设备信息
    int updateDeviceType(DeviceType deviceType);
    //删除设备种类
    int deleteDeviceType(String[] id);
    //分页查看
    List<DeviceType> queryDeviceTypePage();





}
