package com.cskaoyan.mapper.planModelMapper;

import com.cskaoyan.bean.planModelBean.Manufacture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManufactureMapper {
    List<Manufacture> queryManufature();
    int insertManufacture(@Param("manu") Manufacture manufacture,@Param("orderId") String OrderId,@Param("techId")String technologyId);

    Manufacture queryManuById(@Param("id") String manufactureSn);

    int updateManu(@Param("manu") Manufacture manufacture);

    int deleteManu(@Param("ids") String[] ids);

    List<Manufacture> searchManuByMsn(@Param("msn") String valueSn);

    List<Manufacture> searchManuByOId(@Param("oid") String valueOid);

    List<Manufacture> searchManuByTname(@Param("tname") String valueTname);
}
