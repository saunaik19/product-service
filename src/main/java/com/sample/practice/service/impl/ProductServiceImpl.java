package com.sample.practice.service.impl;

import com.sample.practice.dto.Product;
import com.sample.practice.repository.ProductRepository;
import com.sample.practice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> allProducts() {
        return productRepository.findAll();
    }

    @Override
    public void createNewProduct(Product product) {
        productRepository.save(product);
        System.out.println("product created....");

    }
}
