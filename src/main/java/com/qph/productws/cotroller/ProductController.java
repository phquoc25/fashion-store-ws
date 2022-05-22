package com.qph.productws.cotroller;

import com.qph.productws.model.ProductCreationRequestDto;
import com.qph.productws.model.ProductDto;
import com.qph.productws.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public List<ProductDto> createProduct(@RequestBody List<ProductCreationRequestDto> productCreationRequestDtos) {
        return productService.createProducts(productCreationRequestDtos);
    }
}
