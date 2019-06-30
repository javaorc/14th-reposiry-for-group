package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Work;
import com.cskaoyan.mapper.planModelMapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkServiceImpl implements  WorkService {
    @Autowired
    WorkMapper workMapper;
    @Override
    public List<Work> queryWork() {
        return workMapper.queryWork();
    }

    @Override
    public int insertWork(Work work, String productId, String processId, String deviceId) {
        return workMapper.insertWork(work,productId,processId,deviceId);
    }

    @Override
    public Work queryWorkById(String workId) {
        return workMapper.queryWorkById(workId);
    }

    @Override
    public int updateWork(Work work) {
        return workMapper.updateWork(work);
    }

    @Override
    public int deleteWork(String[] ids) {
        return workMapper.deleteWork(ids);
    }

    @Override
    public List<Work> searchWorkByWorkId(String valueWid) {
        return workMapper.searchWorkByWorkId(valueWid);
    }

    @Override
    public List<Work> searchWorkByPid(String valuePid) {
        return workMapper.searchWorkByPid(valuePid);
    }

    @Override
    public List<Work> searchWorkByDname(String valueDname) {
        return workMapper.searchWorkByDname(valueDname);
    }

    @Override
    public List<Work> searchWorkByProId(String valueProid) {
        return workMapper.searchWorkByProId(valueProid);
    }
}
