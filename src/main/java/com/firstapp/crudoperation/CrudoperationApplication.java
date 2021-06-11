package com.firstapp.crudoperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import com.firstapp.crudoperation.models.WCMaster;

@SpringBootApplication
public class CrudoperationApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(CrudoperationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM dbo.TBM_WCMaster";

		List<WCMaster> wcMasters = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(WCMaster.class));

		wcMasters.forEach(System.out::println);
	}

}
