package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Process;
import com.cskaoyan.mapper.planModelMapper.ProcessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProcessServiceImpl implements ProcessService {
    @Autowired
    ProcessMapper processMapper;
    @Override
    public List<Process> queryProcess() {
        return processMapper.queryProcess();
    }

    @Override
    public Process queryProcessById(String processId) {
        return processMapper.queryProcessById(processId);
    }

    @Override
    public int updateProcess(Process process) {
        return processMapper.updateProcess(process);
    }


}
