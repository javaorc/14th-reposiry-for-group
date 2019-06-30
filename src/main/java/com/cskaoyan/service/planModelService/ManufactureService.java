package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Manufacture;

import java.util.List;

public interface ManufactureService {
    List<Manufacture> queryManufacture();
    int insertManufacture(Manufacture manufacture,String OrderId,String technologyId);

    Manufacture queryManuById( String manufactureSn);

    int updateManu(Manufacture manufacture);

    int deleteManu(String[] ids);

    List<Manufacture> searchManuByMsn( String valueSn);

    List<Manufacture> searchManuByOId( String valueOid);

    List<Manufacture> searchManuByTname( String valueTname);
}
