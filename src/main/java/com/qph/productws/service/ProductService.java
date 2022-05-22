package com.qph.productws.service;

import com.qph.productws.model.ProductCreationRequestDto;
import com.qph.productws.model.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();

    List<ProductDto> createProducts(List<ProductCreationRequestDto> productCreationRequestDto);
}
