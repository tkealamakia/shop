package com.tsunazumi.app.bootstrap;

import com.tsunazumi.app.model.Product;
import com.tsunazumi.app.repository.ProductRepository;
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
