package com.cskaoyan.mapper.device;

import com.cskaoyan.bean.device.DeviceFault;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceFaultMapper {
    int addDeviceFault(@Param("dev") DeviceFault deviceFault);

    int updateDeviceFault(@Param("dev") DeviceFault deviceFault);

    int deleteDeviceFault(@Param("ids") String[] ids);

    List<DeviceFault> queryDeviceFaultpage();
}
