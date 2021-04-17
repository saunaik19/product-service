package com.sample.practice.controller;

import com.sample.practice.dto.Product;
import com.sample.practice.repository.ProductRepository;
import com.sample.practice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
//@RequiredArgsConstructor
public class ProductController {

    //NOTE:HERE We did not use Autowired we used Required args constructor using lombok --didn't work
    @Autowired
    private ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
    return productService.allProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateProduct(@RequestBody Product product){
    productService.createNewProduct(product);
    }

}
