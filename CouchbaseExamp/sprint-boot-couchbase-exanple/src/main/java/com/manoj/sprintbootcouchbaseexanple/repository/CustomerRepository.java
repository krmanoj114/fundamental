package com.manoj.sprintbootcouchbaseexanple.repository;

import com.manoj.sprintbootcouchbaseexanple.model.Customer;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
@N1qlPrimaryIndexed
@ViewIndexed(designDoc = "Customer", viewName="All")
public interface CustomerRepository extends CouchbaseRepository<Customer, Integer> {

}
