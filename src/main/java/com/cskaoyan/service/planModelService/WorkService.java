package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Work;

import java.util.List;

public interface WorkService {
    List<Work> queryWork();
    int insertWork(Work work,String productId,String processId,String deviceId);

    Work queryWorkById( String workId);
    int updateWork(Work work);

    int deleteWork(String[] ids);

    List<Work> searchWorkByWorkId( String valueWid);

    List<Work> searchWorkByPid( String valuePid);

    List<Work> searchWorkByDname( String valueDname);

    List<Work> searchWorkByProId( String valueProid);
}
