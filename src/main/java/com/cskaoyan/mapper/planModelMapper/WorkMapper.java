package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Work;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkMapper {
    List<Work> queryWork();
    int insertWork(@Param("work") Work work,@Param("productId")String productId,@Param("processId")String processId,@Param("deviceId")String devicedId);

    Work queryWorkById(@Param("id") String workId);

    int updateWork(@Param("work") Work work);

    int deleteWork(@Param("ids")String[] ids );

    List<Work> searchWorkByWorkId(@Param("wid") String valueWid);

    List<Work> searchWorkByPid(@Param("pid") String valuePid);

    List<Work> searchWorkByDname(@Param("dname") String valueDname);

    List<Work> searchWorkByProId(@Param("proid") String valueProid);

}
