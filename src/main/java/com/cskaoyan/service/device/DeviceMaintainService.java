package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.DeviceFault;
import com.cskaoyan.bean.device.DeviceMaintain;

import java.util.List;

public interface DeviceMaintainService {
    int addDeviceMaintain(DeviceMaintain deviceMaintain);

    int updateDeviceMaintain(DeviceMaintain deviceMaintain);

    int deleteDeviceMaintain(String[] ids);

    List<DeviceMaintain> queryDeviceMaintainPage();


    DeviceFault getDeviceFaultById(String deviceFaultId);

    List<DeviceFault> getDeviceFault();

}
