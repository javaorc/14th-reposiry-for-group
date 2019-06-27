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
}
