package com.cskaoyan.service.planModelService;

import com.cskaoyan.bean.planModelBean.Custom;

import java.util.List;

/**
 * Created by little Stone
 * Date 2019/6/26 Time 10:28
 */
public interface CustomService {

	List<Custom> queryCustom();
	int insertCustom(Custom custom);
}
