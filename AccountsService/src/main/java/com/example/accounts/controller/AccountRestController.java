package com.example.accounts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.accounts.model.Account;
import com.example.accounts.service.AccountService;


@RestController
@RequestMapping("/")
public class AccountRestController
{

  @Autowired
  AccountService accountService;

  /**
   * 
   */
  @RequestMapping(value = "/accounts/{account}", method = RequestMethod.GET)
  public ResponseEntity<?> getAccount( @PathVariable("account") String accountId )
  {
    Account account = accountService.findById( accountId );
    if( account == null )
    {
      return new ResponseEntity<Exception>( new Exception( "Account with id " + accountId + " not found" ), HttpStatus.NOT_FOUND );
    }
    return new ResponseEntity<Account>( account, HttpStatus.OK );
  }

  
  /**
   * 
   */
  @RequestMapping(value = "/accounts/", method = RequestMethod.POST)
  public ResponseEntity<?> registerAccount( @RequestBody Account account)
  {
    try
    {
      accountService.register( account );     
      return new ResponseEntity<Account>( account, HttpStatus.CREATED);
    }
    catch( Exception e )
    {      
      return new ResponseEntity<Account>( account, HttpStatus.INTERNAL_SERVER_ERROR );
    }
 
  }


  /**
   * 
   */
  @RequestMapping(value = "/accounts/", method = RequestMethod.PUT)
  public ResponseEntity<?> saveAccount( @RequestBody Account account)
  {
    try
    {
      accountService.save( account );     
      return new ResponseEntity<Account>( account, HttpStatus.OK);
    }
    catch( Exception e )
    {      
      return new ResponseEntity<Account>( account, HttpStatus.INTERNAL_SERVER_ERROR );
    }
 
  }


}