package com.cskaoyan.service.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceType;
import com.cskaoyan.bean.employee.Department;
import com.cskaoyan.bean.employee.Employee;

import java.util.List;

public interface DeviceService {
    //新增设备台账
    int addDevice(Device device);
    //修改设备台账
    int updateDevice(Device device);
    //删除设备台账
    int deleteDevice(String[] id);
    //分页查看台账
    List<Device> queryDevicePage();
    //下拉选择设备种类
    List<DeviceType> getDataDeviceType();


    DeviceType getDeviceTypeById(String deviceTypeId);

    List<Department> getDepartment();

    Employee getEmployee(String deviceKeeperId);

    int updateEmployee(Employee employee);


}
