package com.sample.practice.service;

import com.sample.practice.dto.Product;

import java.util.List;

public interface ProductService {
    public List<Product> allProducts();
    public void createNewProduct(Product product);
}
