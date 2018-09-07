package com.example.accounts.service;

import com.example.accounts.model.Account;

/**
 * @author cmecatl
 *
 */
public interface AccountService
{

  Account findById (String id);
  
  void save (Account account);
  
  void register (Account account);

  Account findByUser( String user );

}