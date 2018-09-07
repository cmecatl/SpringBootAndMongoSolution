package com.example.accounts.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.accounts.model.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

    public Account findByFirstName(String firstName);
    public List<Account> findByLastName(String lastName);
    public Optional<Account> findByUser( String user );

}