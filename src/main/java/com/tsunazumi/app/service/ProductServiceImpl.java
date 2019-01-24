package com.tsunazumi.app.service;

import com.tsunazumi.app.model.Product;
import com.tsunazumi.app.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;

  public ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Product getProduct(String name) {
    return productRepository.findByName(name);
  }
}
