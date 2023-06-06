package com.query.spring.kafka.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.commons.dto.Seller;

public interface SellerRepository extends MongoRepository<Seller, Integer>{


    @Query("{'product.productId':?0}")
    Seller findByProductId(Integer productId);
}
