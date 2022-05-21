package com.qph.fashionstorews.cotroller;

import com.qph.fashionstorews.model.ProductCreationRequestDto;
import com.qph.fashionstorews.model.ProductDto;
import com.qph.fashionstorews.service.ProductService;
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
    public ProductDto createProduct(@RequestBody ProductCreationRequestDto productCreationRequestDto) {
        return productService.createProduct(productCreationRequestDto);
    }
}
