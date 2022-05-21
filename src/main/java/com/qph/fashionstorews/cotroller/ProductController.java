package com.qph.fashionstorews.cotroller;

import com.qph.fashionstorews.model.ProductDto;
import com.qph.fashionstorews.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping()
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }
}
