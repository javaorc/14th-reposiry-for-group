package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Device;
import com.cskaoyan.mapper.planModelMapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceMapper deviceMapper;
    @Override
    public List<Device> queryDevice() {
        return deviceMapper.queryDevice();
    }

    @Override
    public Device queryDeviceById(String deviceId) {
        return deviceMapper.queryDeviceById(deviceId);
    }

    @Override
    public int updateDeviceByDid(Device device) {
        return deviceMapper.updateDeviceByDid(device);
    }
}
