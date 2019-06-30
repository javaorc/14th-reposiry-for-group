package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Process;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProcessMapper {
    List<Process> queryProcess();
    Process queryProcessById(@Param("id") String processId);

    int updateProcess(@Param("process") Process process);
}
