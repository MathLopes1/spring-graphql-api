package com.graphql.api.controller;

import com.graphql.api.domain.Product;
import com.graphql.api.dto.ProductDTO;
import com.graphql.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @MutationMapping()
    Product createProduct(@Argument ProductDTO product) {
        Product productSaved = productService.createProduct(product);
        return productSaved;
    }

    @QueryMapping()
    List<Product> findAllProduct() {
        List<Product> products = productService.findAllProduct();
        return products;
    }
}
