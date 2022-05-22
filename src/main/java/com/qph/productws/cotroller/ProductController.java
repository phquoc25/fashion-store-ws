package com.qph.productws.cotroller;

import com.qph.productws.model.ProductCreationRequestDto;
import com.qph.productws.model.ProductDto;
import com.qph.productws.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @GetMapping
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public List<ProductDto> createProduct(@RequestBody List<ProductCreationRequestDto> productCreationRequestDtos) {
        return productService.createProducts(productCreationRequestDtos);
    }
}
