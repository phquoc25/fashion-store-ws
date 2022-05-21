package com.qph.fashionstorews.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductCreationRequestDto {
    private String title;
    private String shortDescription;
    private String longDescription;
    private Double price;
    private Integer promotion;
    private String image;
    private String color;
}
