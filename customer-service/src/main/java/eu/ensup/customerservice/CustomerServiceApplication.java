package eu.ensup.customerservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import eu.ensup.customerservice.dao.CustomerRepository;
import eu.ensup.customerservice.domaine.Customer;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer("David","eddy","eddy@huios.com")); 
			customerRepository.save(new Customer("test","elise","elise@huios.com"));
			customerRepository.save(new Customer("Bernard","shirel","shirel@huios.com"));
			customerRepository.findAll().forEach(System.out::println);
		};
	}

}
