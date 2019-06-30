package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Task;

import java.util.List;

public interface TaskService {
    List<Task> queryTask();
    int insertTask(Task task);
    int updateTask( Task task);

    int deleteTask( String[] TaskIds);

    List<Task> searchTaskById( String valueTid);

    List<Task> searchTaskByTaskWorkId( String valueTWid);

    List<Task> searchTaskByTaskManuId( String valueTWid);


}
