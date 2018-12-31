package com.ajay.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.ajay.domain.User2;
@Repository
public interface MongoRepo extends MongoRepository<User2,String> {

}
