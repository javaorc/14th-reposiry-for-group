package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Process;

import java.util.List;

public interface ProcessService {
    List<Process> queryProcess();

    Process queryProcessById(String processId);

    int updateProcess( Process process);
}
