package com.fusheng.platform.dao;

import com.fusheng.platform.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yk
 * @ClassName: TestDao
 * @Description: ${todo}
 * @date 2017/8/17 16:20
 */
public interface TestDao extends JpaRepository<TestEntity, Long> {
}
