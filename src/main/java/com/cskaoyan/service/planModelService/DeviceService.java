package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Device;

import java.util.List;

public interface DeviceService {
    List<Device> queryDevice();

    Device queryDeviceById(String deviceId);

    int updateDeviceByDid( Device device);
}
