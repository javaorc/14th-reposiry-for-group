package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Task;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskMapper {
    List<Task> queryTask();
    int insertTask(@Param("task") Task task);

    int updateTask(@Param("task") Task task);

    int deleteTask(@Param("ids") String[] TaskIds);

    List<Task> searchTaskById(@Param("tid") String valueTid);

    List<Task> searchTaskByTaskWorkId(@Param("twid") String valueTWid);

    List<Task> searchTaskByTaskManuId(@Param("tmid") String valueTWid);

}
