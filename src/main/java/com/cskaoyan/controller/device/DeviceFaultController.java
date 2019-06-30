package com.cskaoyan.controller.device;

import com.cskaoyan.bean.device.Device;
import com.cskaoyan.bean.device.DeviceFault;
import com.cskaoyan.service.device.DeviceFaultService;
import com.cskaoyan.service.device.DeviceService;
import com.cskaoyan.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DeviceFaultController {
    @Autowired
    DeviceFaultService service;
    @Autowired
    DeviceService service1;

    @RequestMapping("device/deviceFault")
    public String device(){
        return "deviceFault";
    }
    @RequestMapping("deviceFault/list")
    @ResponseBody
    public Map<String, Object> deviceFaultList(int page, int rows){
         List<DeviceFault> deviceFaults = service.queryDeviceFaultpage();
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",rows);
        map.put("rows",deviceFaults);
        return map;
    }
    @RequestMapping("deviceFault/add_judge")
    public String addJudge(){
        return "deviceFault_add";
    }
    @RequestMapping("deviceFault/add")
    public String add(){
        return "deviceFault_add";
    }
    @RequestMapping("deviceFault/insert")
    @ResponseBody
    public ResponseVo addDeviceFault(DeviceFault deviceFault){
        int i = service.addDeviceFault(deviceFault);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");

    }
    @RequestMapping("deviceFault/edit_judge")
    public String editJudge(){
        return "deviceFault_edit";
    }
    @RequestMapping("deviceFault/edit")
    public String edit(){
        return "deviceFault_edit";
    }

    @RequestMapping("deviceFault/update")
    @ResponseBody
    public ResponseVo updateDevice(DeviceFault deviceFault){
        int i = service.updateDeviceFault(deviceFault);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");

    }
    @RequestMapping("deviceFault/delete_judge")
    public String deleteJudge(){
        return "deviceFault_edit";
    }
    @RequestMapping("deviceFault/delete_batch")
    @ResponseBody
    public ResponseVo delete(String[] ids){
        final int i = service.deleteDeviceFault(ids);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");
    }

    @RequestMapping("deviceList/update_all")
    @ResponseBody
    public ResponseVo updateAll(Device device){
        int i = service1.updateDevice(device);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");
    }

}
