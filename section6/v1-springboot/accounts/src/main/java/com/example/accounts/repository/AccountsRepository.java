package com.example.accounts.repository;

import com.example.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional  //because of transaction, if any error occurs during the query execution, it rolls back the partial change in the data
    @Modifying      //it tells the JPA framework that this method is going to modify the data, hence run it in a transaction
    void deleteByCustomerId(Long customerId);

}
