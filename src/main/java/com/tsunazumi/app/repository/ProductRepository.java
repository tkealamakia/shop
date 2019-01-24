package com.tsunazumi.app.repository;

import com.tsunazumi.app.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

  Product findByName(String name);
}
