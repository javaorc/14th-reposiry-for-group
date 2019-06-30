package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper {
    List<Device> queryDevice();

    Device queryDeviceById(@Param("id") String deviceId);

    int updateDeviceByDid(@Param("device") Device device);
}
