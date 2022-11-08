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
        pizzaService.createPizza(pizza,customerId);
    }
    @DeleteMapping("/pizza/{Id}")
    public void deletePizza(@PathVariable Long Id) {
        pizzaService.deletePizza(Id);
    }


    @GetMapping("/pizza/{pizzaId}")
    public ResponseEntity<?> getPizzaId(@PathVariable Long pizzaId) {
        return pizzaService.getPizzaById(pizzaId);
    }

    @PutMapping("/pizza/{customerId}/pizza")
    public void updatePizza(@RequestBody Pizza pizza, @PathVariable (value = "customerId") Long customerId) {
        pizzaService.updatePizza(pizza,customerId);
    }

}
