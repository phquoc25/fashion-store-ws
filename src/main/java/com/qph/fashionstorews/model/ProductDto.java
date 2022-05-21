package com.qph.fashionstorews.model;

import com.qph.fashionstorews.entity.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {
    private String uuid;
    private String title;
    private String shortDescription;
    private String longDescription;
    private Double price;
    private Integer promotion;
    private String image;
    private String color;

    public static ProductDto fromProduct(Product product) {
        return ProductDto.builder()
                .uuid(product.getId())
                .title(product.getTitle())
                .shortDescription(product.getShortDescription())
                .longDescription(product.getLongDescription())
                .price(product.getPrice())
                .promotion(product.getPromotion())
                .image(product.getImage())
                .color(product.getColor())
                .build();
    }
}
