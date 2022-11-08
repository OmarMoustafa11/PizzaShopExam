package com.PizzaShop.PizzaShop.controller;

import com.PizzaShop.PizzaShop.domain.Customer;
import com.PizzaShop.PizzaShop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<?> getCustomer(@PathVariable Long customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PutMapping("/customer/{customerId}")
    public ResponseEntity<?> updateCustomer(@RequestBody Customer customer, @PathVariable Long customerId) {
        return customerService.updateCustomer(customer,customerId);
    }

    @DeleteMapping("/customer/{custoemrId}")
    public void deleteCustomer(@PathVariable Long customerId) {
        customerService.deleteCustomer(customerId);

    }
}
