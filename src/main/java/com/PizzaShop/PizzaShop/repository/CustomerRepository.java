package com.PizzaShop.PizzaShop.repository;

import com.PizzaShop.PizzaShop.domain.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
