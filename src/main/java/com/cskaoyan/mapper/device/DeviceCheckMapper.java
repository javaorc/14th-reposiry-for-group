package com.cskaoyan.mapper.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceCheck;
import com.cskaoyan.bean.employee.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceCheckMapper {
    //新增例检
    int addDeviceCheck(@Param("dev") DeviceCheck deviceCheck);
    //修改例检
    int updateDeviceCheck(@Param("dev") DeviceCheck deviceCheck);
    //删除例检
    int deleteDeviceCheck(@Param("ids") String[] ids);

    List<DeviceCheck> queryDeviceCheckPage();

    Device getDeviceById(@Param("devId") String deviceId);

    List<Device> getDevice();

    List<Employee> getEmployee();
}
