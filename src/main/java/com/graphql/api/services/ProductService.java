package com.graphql.api.services;

import com.graphql.api.domain.Product;
import com.graphql.api.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductDTO product);

    List<Product> findAllProduct();
}
