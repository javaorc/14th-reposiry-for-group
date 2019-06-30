package com.cskaoyan.controller.device;

import com.cskaoyan.bean.device.DeviceType;
import com.cskaoyan.service.device.DeviceTypeService;
import com.cskaoyan.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DeviceTypeController {
    @Autowired
    DeviceTypeService service;

    @RequestMapping("/")
    public String index(){
        return "home";
    }


    @RequestMapping("device/deviceType")
    public String findDeviceType(){
        return "deviceType";
    }

    @RequestMapping("deviceType/list")
    @ResponseBody
    public Map<String,Object> findDeviceTypeList(int page,int rows){
        List<DeviceType> deviceTypeList = service.queryDeviceTypePage();
         HashMap<String, Object> map = new HashMap<>();
         map.put("total",rows);
         map.put("rows",deviceTypeList);
         return map;
    }
    @RequestMapping("deviceType/add_judge")
    public  String addJudge(){
        return "deviceType_add";
    }
    @RequestMapping("deviceType/add")
    public String addDeviceType(){
        return "deviceType_add";
    }
    @RequestMapping("deviceType/insert")
    @ResponseBody
    public ResponseVo insert(DeviceType deviceType){
         int i = service.addDeviceType(deviceType);
         if (i==1){
             return new ResponseVo("200","OK","null");
         }
        return new ResponseVo("0","该设备种类编号已经存在，请更换设备种类编号！","null");
    }
    @RequestMapping("deviceType/edit_judge")
    public String editJudge(){
        return "deviceType_edit";
    }
    @RequestMapping("deviceType/edit")
    public String editDevice(){
        return "deviceType_edit";
    }
    @RequestMapping("deviceType/update")
    @ResponseBody
    public ResponseVo update(DeviceType deviceType){
         int i = service.updateDeviceType(deviceType);
        if (i==1){
            return new ResponseVo("200","OK","null");
        }
        return new ResponseVo("0","该设备种类编号已经存在，请更换设备种类编号！","null");

    }
    @RequestMapping("deviceType/delete_judge")
    public String deleteJudge(){
        return "deviceType_edit";
    }
    @RequestMapping("deviceType/delete_batch")
    @ResponseBody
    public ResponseVo delete(String[] ids){
         int i = service.deleteDeviceType(ids);
         if (i==1){
             return new ResponseVo("200","OK","null");
         }
        return new ResponseVo("0","该设备种类编号已经存在，请更换设备种类编号！","null");
    }
}