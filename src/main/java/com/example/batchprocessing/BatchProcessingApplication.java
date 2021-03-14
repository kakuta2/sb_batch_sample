package com.example.batchprocessing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.CommandLineRunner;

/**
 * メイン　
 * ST001対応
 */
@SpringBootApplication
public class BatchProcessingApplication  implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args)));
	}

	@Autowired
	JdbcTemplate j;
  
	@Override
	public void run(String... args) throws Exception {
	  System.out.println("***********" + j.queryForObject("select count(*) from people", Integer.class));
	}
  
}
