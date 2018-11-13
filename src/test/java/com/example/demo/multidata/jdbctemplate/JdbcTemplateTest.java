package com.example.demo.multidata.jdbctemplate;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTemplateTest {
	@Autowired
	@Qualifier("primaryJdbcTemplate")
	private JdbcTemplate jdbcTemplate1;
	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	private JdbcTemplate jdbcTemplate2;
	
	@Test
	public void find() {
		List<Map<String, Object>> listUser = jdbcTemplate1.queryForList("select * from com_cmig_zrgk_user");
	    for (Map<String, Object> map : listUser) {
			System.out.println(map.entrySet().toString());
		}
	}
	@Test
	public void find2() {
		List<Map<String, Object>> listUser = jdbcTemplate2.queryForList("select * from csp_ljh_app_user");
	    for (Map<String, Object> map : listUser) {
			System.out.println(map.entrySet().toString());
		}
	}
	

}
