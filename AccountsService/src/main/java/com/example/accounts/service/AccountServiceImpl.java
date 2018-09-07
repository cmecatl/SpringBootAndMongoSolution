package com.example.accounts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accounts.model.Account;
import com.example.accounts.repository.AccountRepository;

/**
 * @author cmecatl
 *
 */

@Service("accountService")
public class AccountServiceImpl implements  AccountService
{
  
  @Autowired
  AccountRepository accountRepository;

  @Override
  public Account findById( String id )
  {
    return accountRepository.findById( id ).get();
  }

  @Override
  public Account findByUser( String user )
  {
    return accountRepository.findByUser( user ).get();
  }

  
  @Override
  public void save( Account account )
  {
    accountRepository.save( account );
    
  }

  @Override
  public void register( Account account )
  {
    accountRepository.save( account );    
  }


}