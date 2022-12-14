package com.PizzaShop.PizzaShop.service;

import com.PizzaShop.PizzaShop.domain.Customer;
import com.PizzaShop.PizzaShop.domain.Pizza;
import com.PizzaShop.PizzaShop.repository.CustomerRepository;
import com.PizzaShop.PizzaShop.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private CustomerRepository customerRepository;


    public ResponseEntity<Iterable<Pizza>> getAllPizza() {
        Iterable<Pizza> allBooks = pizzaRepository.findAll();
        return new ResponseEntity<>(pizzaRepository.findAll(), HttpStatus.OK);
    }

    public void createPizza(Pizza pizza, Long customerId) {
        customerRepository.findById(customerId).map(customer -> {
            pizza.setCustomer(customer);
            return pizzaRepository.save(pizza);

        });
    }
    public ResponseEntity<?> getPizzaById(Long pizzaId) {
        Optional<Pizza> p = pizzaRepository.findById(pizzaId);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }


    public void updatePizza(Pizza pizza, Long customerId) {
        customerRepository.findById(customerId).map(customer -> {
            pizza.setCustomer(customer);
            return pizzaRepository.save(pizza);
        });

    }


    public void deletePizza(Long pizzaId) {
       pizzaRepository.deleteById(pizzaId);
    }

}
