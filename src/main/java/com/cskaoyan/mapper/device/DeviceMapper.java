package com.cskaoyan.mapper.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceType;
import com.cskaoyan.bean.employee.Department;
import com.cskaoyan.bean.employee.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper {
    //新增设备台账
    int addDevice(@Param("dev") Device device);
    //修改设备台账
    int updateDevice(@Param("dev") Device device);
    //删除设备台账
    int deleteDevice(@Param("ids") String[] id);
    //分页查看台账
    List<Device> queryDevicePage();

    //下拉选择设备种类
    List<DeviceType> getDataDeviceType();

    DeviceType getDeviceTypeById(@Param("devId") String deviceTypeId);

    List<Department> getDepartment();

    Employee getEmployee(@Param("id") String deviceKeeperId);

    int updateEmployee(@Param("em") Employee employee);
}
