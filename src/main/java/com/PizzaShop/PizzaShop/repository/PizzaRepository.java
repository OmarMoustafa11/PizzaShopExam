package com.PizzaShop.PizzaShop.repository;

import com.PizzaShop.PizzaShop.domain.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza,Long> {
}
