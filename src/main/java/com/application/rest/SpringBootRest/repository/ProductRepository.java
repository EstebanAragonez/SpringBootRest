package com.application.rest.SpringBootRest.repository;

import com.application.rest.SpringBootRest.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
