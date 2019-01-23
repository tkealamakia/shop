package com.tsunazumi.shop.service;

import com.tsunazumi.shop.model.Product;
import com.tsunazumi.shop.repository.ProductRepository;
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
