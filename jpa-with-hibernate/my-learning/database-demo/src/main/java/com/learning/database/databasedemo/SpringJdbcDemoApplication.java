package com.learning.database.databasedemo;

import com.learning.database.databasedemo.entity.Person;
import com.learning.database.databasedemo.jdbc.PersonJdbcDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		/*logger.info("All users ->{}", dao.findAll());
		logger.info("Find by id  users ->{}", dao.findById(1001));
		//logger.info("Find by name  users ->{}", dao.findByName("Shreya"));
		logger.info("Find by name  users ->{}", dao.insert(new Person(1006, "Bhavya", "Bokaro", new Date())));
		logger.info("Find by name  users ->{}", dao.update(new Person(1002, "Sunita", "Begusarai", new Date())));
*/
	}
}
