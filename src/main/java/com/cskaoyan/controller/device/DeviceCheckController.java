package com.cskaoyan.controller.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceCheck;
import com.cskaoyan.bean.employee.Employee;
import com.cskaoyan.service.device.DeviceCheckService;
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
public class DeviceCheckController {
    @Autowired
    DeviceCheckService service;


    @RequestMapping("device/deviceCheck")
    public String index(){

        return "deviceCheck";
    }

    @RequestMapping("deviceCheck/list")
    @ResponseBody
    public Map<String, Object> deviceCheckList(int page, int rows){
        List<DeviceCheck> devices = service.queryDeviceCheckPage();
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",rows);
        map.put("rows",devices);
        return map;
    }
    @RequestMapping("employee/get_data")
    @ResponseBody
    public List<Employee> getEmployee(){
         List<Employee> employee = service.getEmployee();
         return employee;

    }
    @RequestMapping("deviceCheck/add_judge")
    public String addJudge(){
        return
                "deviceCheck_add";
    }
    @RequestMapping("deviceCheck/add")
    public String add(){
        return
                "deviceCheck_add";
    }

    @RequestMapping("deviceList/get_data")
    @ResponseBody
    public List<Device> getDevice(){
         List<Device> device = service.getDevice();
         return device;
    }

    @RequestMapping("deviceCheck/insert")
    @ResponseBody
    public ResponseVo insert(DeviceCheck deviceCheck){
         int i = service.addDeviceCheck(deviceCheck);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");
    }
    @RequestMapping("deviceList/get/{deviceId}")
    @ResponseBody
    public Device getDevice(@PathVariable("deviceId") String deviceId){
         Device device = service.getDeviceById(deviceId);
         return device;
    }
    @RequestMapping("deviceCheck/edit_judge")
    public String editJudge(){
        return "deviceCheck_edit";
    }
    @RequestMapping("deviceCheck/edit")
    public String edit(){
        return "deviceCheck_edit";
    }
    @RequestMapping("deviceCheck/update")
    @ResponseBody
    public ResponseVo updateDevice(DeviceCheck deviceCheck){
        int i = service.updateDeviceCheck(deviceCheck);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");

    }
    @RequestMapping("deviceCheck/delete_judge")
    public String deleteJudge(){
        return "deviceCheck_edit";
    }
    @RequestMapping("deviceCheck/delete_batch")
    @ResponseBody
    public ResponseVo delete(String[] ids){
        final int i = service.deleteDeviceCheck(ids);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");
    }
}
