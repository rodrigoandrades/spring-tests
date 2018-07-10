package com.javaee.rodrigoandrades.springtests.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javaee.rodrigoandrades.springtests.domain.Vendor;

@Repository
public interface VendorRepository extends MongoRepository<Vendor, String>{

}
