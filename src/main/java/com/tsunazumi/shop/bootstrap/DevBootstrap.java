package com.tsunazumi.shop.bootstrap;

import com.tsunazumi.shop.model.Product;
import com.tsunazumi.shop.repository.ProductRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

  private ProductRepository productRepository;

  public DevBootstrap(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
  }

  private void initData(){

    Product product = new Product("Game of Thrones", "An epic TV show");
    productRepository.save(product);

  }
}
