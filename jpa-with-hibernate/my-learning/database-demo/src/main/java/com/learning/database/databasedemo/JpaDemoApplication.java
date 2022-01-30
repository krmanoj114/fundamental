package com.learning.database.databasedemo;

import com.learning.database.databasedemo.entity.Person;
import com.learning.database.databasedemo.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;


	public static void main(String[] args) {

		SpringApplication.run(JpaDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println("color >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:"+abc);


		logger.info("Insert users ->{}", repository.insert(new Person( new Date(),  "Bokaro", "Bhavya")));
		logger.info("All users ->{}", repository.findAll());
		logger.info("Find by id  users ->{}", repository.findById(1));


		/*logger.info("All users ->{}", dao.findAll());
		logger.info("Insert users ->{}", repository.insert(new Person(1001, "Bhavya", "Bokaro", new Date())));
		logger.info("Update users ->{}", repository.update(new Person(1002, "Sunita", "Begusarai", new Date())));
		//logger.info("Find by name  users ->{}", dao.findByName("Shreya"));
		logger.info("Find by name  users ->{}", dao.insert(new Person(1006, "Bhavya", "Bokaro", new Date())));
		logger.info("Find by name  users ->{}", dao.update(new Person(1002, "Sunita", "Begusarai", new Date())));
*/
	}
}
