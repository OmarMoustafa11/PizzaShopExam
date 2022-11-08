package com.PizzaShop.PizzaShop.service;

import com.PizzaShop.PizzaShop.domain.Customer;
import com.PizzaShop.PizzaShop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public ResponseEntity<Iterable<Customer>> getAllCustomers (){
        Iterable<Customer> allCategory = customerRepository.findAll();

        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);

    }

}
