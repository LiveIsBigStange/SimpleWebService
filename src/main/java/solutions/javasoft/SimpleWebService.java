package solutions.javasoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import solutions.javasoft.dao.model.Customer;
import solutions.javasoft.dao.repository.CustomerRepository;

@SpringBootApplication
@RestController
public class SimpleWebService {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public Iterable<Customer> getCustomers(){
        return customerRepository.findAll();
    }


    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebService.class, args);
    }
}