package com.qph.productws.service;

import com.qph.productws.dao.ProductRepository;
import com.qph.productws.entity.Product;
import com.qph.productws.model.ProductCreationRequestDto;
import com.qph.productws.model.ProductDto;
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
    public List<ProductDto> createProducts(List<ProductCreationRequestDto> productCreationRequestDtos) {
        var products = productCreationRequestDtos.stream().map(ProductServiceImpl::buildProduct).collect(toList());
        return productRepository.insert(products).stream().map(ProductDto::fromProduct).collect(toList());
    }

    private static Product buildProduct(ProductCreationRequestDto productCreationRequestDto) {
        Product product = new Product();
        product.setId(UUID.randomUUID().toString());
        product.setTitle(productCreationRequestDto.getTitle());
        product.setImage(productCreationRequestDto.getImage());
        product.setColor(productCreationRequestDto.getColor());
        product.setPrice(productCreationRequestDto.getPrice());
        product.setPromotion(productCreationRequestDto.getPromotion());
        product.setLongDescription(productCreationRequestDto.getLongDescription());
        product.setShortDescription(productCreationRequestDto.getShortDescription());
        return product;
    }
}
