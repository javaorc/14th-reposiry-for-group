package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.DeviceFault;

import java.util.List;


public interface DeviceFaultService {
    int addDeviceFault(DeviceFault deviceFault);

    int updateDeviceFault(DeviceFault deviceFault);

    int deleteDeviceFault(String[] ids);

    List<DeviceFault> queryDeviceFaultpage();
}
