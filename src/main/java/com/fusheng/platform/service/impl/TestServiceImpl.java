package com.fusheng.platform.service.impl;

import com.fusheng.platform.dao.TestDao;
import com.fusheng.platform.entity.TestEntity;
import com.fusheng.platform.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yk
 * @ClassName: TestServiceImpl
 * @Description: ${todo}
 * @date 2017/8/17 15:32
 */
@Service
public class TestServiceImpl implements TestService{
	@Autowired
	private TestDao testDao;

	@Override public void test(Long id, String name) {
		TestEntity testEntity=new TestEntity();
		testEntity.setId(id);
		testEntity.setName(name);
		this.testDao.save(testEntity);
	}
}
