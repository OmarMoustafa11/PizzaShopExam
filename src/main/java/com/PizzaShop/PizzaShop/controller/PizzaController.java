package com.PizzaShop.PizzaShop.controller;

import com.PizzaShop.PizzaShop.domain.Pizza;
import com.PizzaShop.PizzaShop.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/pizza")
    public ResponseEntity<Iterable<Pizza>> getAllBooks() {
        return pizzaService.getAllPizza();
    }

    @PostMapping("/pizza/{customerId}/pizza")
    public void createBook(@PathVariable(value = "customerId") Long customerId, @RequestBody Pizza pizza) {
        pizzaService.createBook(pizza,customerId);
    }



}
