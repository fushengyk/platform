package com.fusheng.platform.entity;

import javax.persistence.*;

/**
 * @author yk
 * @ClassName: TestEntity
 * @Description: ${todo}
 * @date 2017/8/17 16:17
 */
@Entity
@Table(name="test")
public class TestEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
