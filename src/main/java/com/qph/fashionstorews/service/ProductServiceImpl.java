package com.qph.fashionstorews.service;

import com.qph.fashionstorews.dao.ProductRepository;
import com.qph.fashionstorews.entity.Product;
import com.qph.fashionstorews.model.ProductCreationRequestDto;
import com.qph.fashionstorews.model.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream().map(ProductDto::fromProduct).collect(toList());
    }

    @Override
    public ProductDto createProduct(ProductCreationRequestDto productCreationRequestDto) {
        Product product = new Product();
        product.setUuid(UUID.randomUUID().toString());
        product.setTitle(productCreationRequestDto.getTitle());
        product.setImage(productCreationRequestDto.getImage());
        return ProductDto.fromProduct(productRepository.insert(product));
    }
}
