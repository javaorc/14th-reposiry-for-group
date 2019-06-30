package com.cskaoyan.mapper.device;

import com.cskaoyan.bean.device.DeviceType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceTypeMapper {
    //新增设备种类
    int addDeviceType(@Param("device") DeviceType deviceType);
    //修改设备信息
    int updateDeviceType(@Param("dev") DeviceType deviceType);
    //删除设备种类
    int deleteDeviceType(@Param("ids") String[] id);
    //分页查看
    List<DeviceType> queryDeviceTypePage();

}
