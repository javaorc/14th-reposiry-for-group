package com.cskaoyan.mapper.device;

import com.cskaoyan.bean.device.DeviceFault;
import com.cskaoyan.bean.device.DeviceMaintain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMaintainMapper {
    int addDeviceMaintain(@Param("dev") DeviceMaintain deviceMaintain);

    int updateDeviceMaintain(@Param("dev") DeviceMaintain deviceMaintain);

    int deleteDeviceMaintain(@Param("ids") String[] ids);

    List<DeviceMaintain> queryDeviceMaintainPage();

    DeviceFault getDeviceFaultById(@Param("id") String deviceFaultId);

    List<DeviceFault> getDeviceFault();
}
