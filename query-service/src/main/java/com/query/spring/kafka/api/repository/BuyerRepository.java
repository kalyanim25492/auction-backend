package com.query.spring.kafka.api.repository;

import com.commons.dto.Buyer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BuyerRepository extends MongoRepository<Buyer, Integer>{
    List<Buyer> findByProductIdOrderByBidAmountDesc(Integer productId);

}

