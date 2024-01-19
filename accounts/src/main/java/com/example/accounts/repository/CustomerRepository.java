package com.example.accounts.repository;


import com.example.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //NOTE: Since CustomerRepository is an interface that communicates with the
    // database using Spring JPA and perform the queries, the following case is
    // custom defined where we need to find a customer by its mobile number.
    // JPA normally applies queries based on primary keys (in our case it is
    // Id. But here we don't have the id while creating a new customer object,
    // and we need to check if the mobile number of this customer already exists
    // in the database.
    // This concept is called Derived-named method, means the JPA applies query
    // based on the attribute name mentioned in the method name (MobileNumber).
    // It should be same as in the Entity class
    Optional<Customer> findByMobileNumber(String mobileNumber);

}
