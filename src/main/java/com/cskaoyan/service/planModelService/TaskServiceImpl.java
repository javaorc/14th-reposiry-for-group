package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Task;
import com.cskaoyan.mapper.planModelMapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskMapper taskMapper;
    @Override
    public List<Task> queryTask() {
        return taskMapper.queryTask();
    }
}
