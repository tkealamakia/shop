package com.tsunazumi.shop.repository;

import com.tsunazumi.shop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

  Product findByName(String name);
}
