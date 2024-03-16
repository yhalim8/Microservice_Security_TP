package org.halim.customerservice;

import org.halim.customerservice.entities.Customer;
import org.halim.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class customerserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(customerserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer(null,"youness","youness@gmail.com"));
            customerRepository.save(new Customer(null,"Aziz","aziz@gmail.com"));
        };
    }
}
