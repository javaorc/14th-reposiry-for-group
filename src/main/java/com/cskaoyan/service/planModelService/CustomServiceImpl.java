package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Custom;
import com.cskaoyan.mapper.planModelMapper.CustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by little Stone
 * Date 2019/6/26 Time 10:29
 */
@Service
public class CustomServiceImpl implements CustomService {

	@Autowired
	CustomMapper customMapper;
	@Override
	public List<Custom> queryCustom() {
		List<Custom> customs = customMapper.queryCustom();
		return customs;
	}

	@Override
	public int insertCustom(Custom custom) {
		return customMapper.insertCustom(custom);
	}

	@Override
	public Custom queryCustomById(String id) {
		return customMapper.queryCustomById(id);
	}

	@Override
	public int updateCustom(Custom custom) {
		return customMapper.updateCustom(custom);
	}

	@Override
	public int deleteCustom(String[] ids) {
		return customMapper.deleteCustom(ids);
	}

	@Override
	public String[] searchCidByCname(String valueCName) {
		return customMapper.searchCidByCname(valueCName);
	}

    @Override
    public List<Custom> searchCustomByCid(String valueId) {
        return customMapper.searchCustomByCid(valueId);
    }
}
