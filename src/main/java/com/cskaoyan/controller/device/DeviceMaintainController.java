package com.cskaoyan.controller.device;

import com.cskaoyan.bean.device.DeviceFault;
import com.cskaoyan.bean.device.DeviceMaintain;
import com.cskaoyan.service.device.DeviceFaultService;
import com.cskaoyan.service.device.DeviceMaintainService;
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
public class DeviceMaintainController {
    @Autowired
    DeviceMaintainService service;
    @Autowired
    DeviceFaultService service1;

    @RequestMapping("device/deviceMaintain")
    public String device(){
        return "deviceMaintain";
    }
    @RequestMapping("deviceMaintain/list")
    @ResponseBody
    public Map<String, Object> deviceMaintainList(int page, int rows){
        List<DeviceMaintain> deviceMaintain = service.queryDeviceMaintainPage();
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",rows);
        map.put("rows",deviceMaintain);
        return map;
    }

    @RequestMapping("deviceFault/update_all")
    @ResponseBody
    public ResponseVo updateAll(DeviceFault deviceFault){
        int i = service1.updateDeviceFault(deviceFault);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");
    }
    @RequestMapping("deviceMaintain/add_judge")
    public String addJudge(){
        return "deviceMaintain_add";
    }
    @RequestMapping("deviceMaintain/add")
    public String add(){
        return "deviceMaintain_add";
}


    @RequestMapping("deviceFault/get_data")
    @ResponseBody
    public List<DeviceFault> getEmployee(){
        List<DeviceFault> deviceFault = service.getDeviceFault();
        return deviceFault;

    }
    @RequestMapping("deviceFault/get/{id}")
    @ResponseBody
    public DeviceFault getDeviceType(@PathVariable("id") String deviceFaultId){
        DeviceFault deviceFault = service.getDeviceFaultById(deviceFaultId);
        return deviceFault;
    }
    @RequestMapping("deviceMaintain/insert")
    @ResponseBody
    public ResponseVo addDeviceMaintain(DeviceMaintain deviceFault){
        int i = service.addDeviceMaintain(deviceFault);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");

    }
    @RequestMapping("deviceMaintain/edit_judge")
    public String editJudge(){

        return "deviceMaintain_edit";
    }
    @RequestMapping("deviceMaintain/edit")
    public String edit(){

        return "deviceMaintain_edit";
    }

    @RequestMapping("deviceMaintain/update")
    @ResponseBody
    public ResponseVo updateDeviceMaintain(DeviceMaintain deviceFault){
        int i = service.updateDeviceMaintain(deviceFault);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");

    }

    @RequestMapping("deviceMaintain/delete_judge")
    public String deleteJudge(){
        return "deviceMaintain_edit";
    }
    @RequestMapping("deviceMaintain/delete_batch")
    @ResponseBody
    public ResponseVo delete(String[] ids){
        final int i = service.deleteDeviceMaintain(ids);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","错误","null");
    }
}
