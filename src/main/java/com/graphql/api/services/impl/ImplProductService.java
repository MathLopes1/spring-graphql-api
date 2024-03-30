package com.graphql.api.services.impl;

import com.graphql.api.domain.Product;
import com.graphql.api.dto.ProductDTO;
import com.graphql.api.repositories.ProductRepository;
import com.graphql.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplProductService implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(ProductDTO product) {
        Product productSaved = productRepository.save(new Product(product.getName(), product.getPrice(), product.getCategoryId()));
        return productSaved;
    }

    public List<Product> findAllProduct() {
        List<Product> products = productRepository.findAll();
        return products;
    }
}
