package com.cskaoyan.controller.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceType;
import com.cskaoyan.bean.employee.Department;
import com.cskaoyan.bean.employee.Employee;
import com.cskaoyan.service.device.DeviceService;
import com.cskaoyan.service.device.DeviceTypeService;
import com.cskaoyan.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DeviceController {
    @Autowired
    DeviceService service;
    @Autowired
    DeviceTypeService service1;


    @RequestMapping("device/deviceList")
    public String device(){
        return "deviceList";
    }

    @RequestMapping("deviceList/list")
    @ResponseBody
    public Map<String, Object> deviceList(int page, int rows){
         List<Device> devices = service.queryDevicePage();
         HashMap<String, Object> map = new HashMap<>();
        map.put("total",rows);
        map.put("rows",devices);
        return map;
    }

   /* @RequestMapping("employee/get_data")
      @ResponseBody
    public Map<String,Object> getData(){
        return null;
    }*/

   @RequestMapping("deviceType/get_data")
    @ResponseBody
    public  List<DeviceType> getDataDeviceType(){
        List<DeviceType> devicesType = service.getDataDeviceType();
      //  HashMap<Integer, Object> map = new HashMap<>();
     //   map.put(devicesType.size(),devicesType);
        return devicesType;

   }
    @RequestMapping("deviceList/add_judge")
    public String addJudge(){
        return "deviceList_add";
    }
    @RequestMapping("deviceList/add")
    public String add(){
        return "deviceList_add";
    }

   @RequestMapping("deviceList/insert")
    @ResponseBody
    public ResponseVo addDevice(Device device){
        int i = service.addDevice(device);
       if (i==1){
           return new ResponseVo("200","OK","null");
       }
       return new ResponseVo("0","错误","null");

   }
   @RequestMapping("employee/get/{id}")
   @ResponseBody
   public Employee getEmployee(@PathVariable("id") String deviceKeeperId){
       Employee employee = service.getEmployee(deviceKeeperId);
       return employee;
   }
   @RequestMapping("employee/edit_judge")
   public String editEm(){
       return "deviceList_edit";
    }
   @RequestMapping("employee/update_all")
   @ResponseBody
   public ResponseVo updateEmployee(Employee employee){
       int i = service.updateEmployee(employee);
       if (i==1){
           return new ResponseVo("200","OK","null");
       }
       return new ResponseVo("0","错误","null");
   }

    @RequestMapping("deviceType/get/{deviceTypeId}")
    @ResponseBody
    public DeviceType getDeviceType(@PathVariable("deviceTypeId") String deviceTypeId){
         DeviceType deviceType = service.getDeviceTypeById(deviceTypeId);
        return deviceType;
    }
    @RequestMapping("deviceType/update_all")
    @ResponseBody
    public ResponseVo updateAll(DeviceType deviceType){
         int i = service1.updateDeviceType(deviceType);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");
    }


    @RequestMapping("department/get_data")
    @ResponseBody
    public List<Department> getDepartment() {
         List<Department> department = service.getDepartment();
         return department;
    }


   @RequestMapping("deviceList/edit_judge")
    public String editJudge(){
       return "deviceList_edit";
   }
   @RequestMapping("deviceList/edit")
    public String edit(){
       return "deviceList_edit";
   }

   @RequestMapping("deviceList/update")
    @ResponseBody
    public ResponseVo updateDevice(Device device){
        int i = service.updateDevice(device);
        if (i==1){
           return new ResponseVo("200","OK","null");
       }
       return new ResponseVo("0","错误","null");

   }

   @RequestMapping("deviceList/delete_judge")
    public String deleteJudge(){
       return "deviceList_edit";
   }

   @RequestMapping("deviceList/delete_batch")
    @ResponseBody
    public ResponseVo delete(String[] ids){
       final int i = service.deleteDevice(ids);
       if (i==1){
           return new ResponseVo("200","OK","null");
       }
       return new ResponseVo("0","错误","null");
   }



}
