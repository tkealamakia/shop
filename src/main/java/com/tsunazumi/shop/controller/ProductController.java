package com.tsunazumi.shop.controller;

import com.tsunazumi.shop.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@RestController
public class ProductController {

  private ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @RequestMapping("/product/{name}")
  public String getProductByName(@PathVariable("name") String name) {
    try {
      String decodedName = URLDecoder.decode(name, "UTF-8");
      return productService.getProduct(decodedName).toString();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    return "nothing found";
  }
}
