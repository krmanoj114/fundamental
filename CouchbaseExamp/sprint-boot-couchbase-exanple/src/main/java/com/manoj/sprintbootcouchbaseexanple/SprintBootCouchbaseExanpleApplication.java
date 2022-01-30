package com.manoj.sprintbootcouchbaseexanple;

import com.manoj.sprintbootcouchbaseexanple.model.Customer;
import com.manoj.sprintbootcouchbaseexanple.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class SprintBootCouchbaseExanpleApplication {

	@Autowired
	private CustomerRepository repository;

	public void initCustomerRepo(){
		repository.saveAll(Stream.of(new Customer(111, "Manoj Kumar", new String[] {"Begusarai", "Bihar"}),
				new Customer(112, "Sunita Kumari", new String[] {"Bokaro", "Jharkhand"})).collect(Collectors.toList()));
	}

	@GetMapping("/fetchAllCustomer")
	public List<Customer> getAll(){
		return repository.findAll();

	}

	public static void main(String[] args) {

		SpringApplication.run(SprintBootCouchbaseExanpleApplication.class, args);
	}

}
