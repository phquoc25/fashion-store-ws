package com.qph.fashionstorews.service;

import com.qph.fashionstorews.model.ProductCreationRequestDto;
import com.qph.fashionstorews.model.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();

    ProductDto createProduct(ProductCreationRequestDto productCreationRequestDto);
}
