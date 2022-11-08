package com.PizzaShop.PizzaShop.controller;

import com.PizzaShop.PizzaShop.domain.Customer;
import com.PizzaShop.PizzaShop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public ResponseEntity<?> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/customer")
    public void createCategory( @RequestBody Customer customer) {
        customerService.createCustomer(customer);
    }
}
