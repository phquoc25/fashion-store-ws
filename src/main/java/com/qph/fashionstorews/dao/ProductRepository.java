package com.qph.fashionstorews.dao;

import com.qph.fashionstorews.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
