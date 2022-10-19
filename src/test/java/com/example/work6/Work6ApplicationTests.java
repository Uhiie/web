package com.example.work6;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Work6ApplicationTests {
	@Autowired
	private DataSource dataSource;
	@Autowired
	DataSourceProperties dataSourceProperties;

	@Autowired
	protected ApplicationContext applicationContext;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
		DataSource dataSource = applicationContext.getBean(DataSource.class); //获取数据源
		System.out.println(dataSource);
		System.out.println(dataSource.getClass().getName());
		System.out.println(dataSourceProperties);
		//JdbcTemplate 已经封装一层函数可以直接使用.
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from picture");
		for (Map<String, Object> stringObjectMap : list) {
			System.out.println(stringObjectMap);
		}
	}


	@Test
	void getConnection() throws SQLException {
		System.out.println(dataSource.getConnection());
	}
}
