package org.study.spring.service.impl;

import java.util.Date;
import java.util.Map;

import org.quincy.rock.core.dao.sql.Predicate;
import org.quincy.rock.core.util.DateUtil;
import org.springframework.stereotype.Service;
import org.study.spring.BaseService;
import org.study.spring.dao.UnlockRequestDao;
import org.study.spring.entity.UnlockRequest;
import org.study.spring.service.UnlockRequestService;

/**
 * <b>UnlockRequestServiceImpl。</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author 刘
 * @since 1.0
 */
@Service
public class UnlockRequestServiceImpl extends BaseService<UnlockRequest, UnlockRequestDao> implements UnlockRequestService {

	@Override
	public boolean insert(UnlockRequest entity, boolean ignoreNullValue, String... excluded) {
		Date date = DateUtil.getDateByWord("now");
		entity.setRequestTime(date);
		return super.insert(entity, ignoreNullValue, excluded);
	}

	@Override
	public boolean updateMap(Map<String, Object> voMap, Predicate where) {
		Date date = DateUtil.getDateByWord("now");
		voMap.put("processingTime", date);
		return super.updateMap(voMap, where);
	}


}