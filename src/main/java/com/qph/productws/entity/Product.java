package com.qph.productws.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Data
@Document
public class Product {
    @Id
    private String id;
    private String title;
    private String shortDescription;
    private String longDescription;
    private Double price;
    private Integer promotion;
    private String image;
    private String color;
}
