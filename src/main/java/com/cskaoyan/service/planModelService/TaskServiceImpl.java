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

    @Override
    public int insertTask(Task task) {
        return taskMapper.insertTask(task);
    }

    @Override
    public int updateTask(Task task) {
        return taskMapper.updateTask(task);
    }

    @Override
    public int deleteTask(String[] TaskIds) {
        return taskMapper.deleteTask(TaskIds);
    }

    @Override
    public List<Task> searchTaskById(String valueTid) {
        return taskMapper.searchTaskById(valueTid);
    }

    @Override
    public List<Task> searchTaskByTaskWorkId(String valueTWid) {
        return taskMapper.searchTaskByTaskWorkId(valueTWid);
    }

    @Override
    public List<Task> searchTaskByTaskManuId(String valueTWid) {
        return taskMapper.searchTaskByTaskManuId(valueTWid);
    }
}
