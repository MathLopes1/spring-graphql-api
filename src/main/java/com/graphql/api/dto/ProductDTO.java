package com.graphql.api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ProductDTO {
    private String name;
    private Long price;
    private UUID categoryId;
}
