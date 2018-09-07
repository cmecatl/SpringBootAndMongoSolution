package com.example.notifications.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.notifications.model.Account;
import com.example.notifications.model.Notification;
import com.example.notifications.service.NotificationService;


@RestController
@RequestMapping("/notifications")
public class NotificationRestController
{

  @Autowired
  NotificationService notificationService;
  
  @Autowired
  private RestTemplate restTemplate;

  /**
   * 
   */
  @RequestMapping(value = "/settings/{account}", method = RequestMethod.GET)
  public ResponseEntity<?> getAccount( @PathVariable("account") String account )
  {
    String url = "http://localhost:8081/accounts/" + account;     
    Account accountInfo = restTemplate.getForObject(url, Account.class);
    
    Notification notification = notificationService.findByUser( accountInfo.getUser() );
    
    if( notification == null )
    {
      return new ResponseEntity<Exception>( new Exception( "Notification for account " + account + " not found" ), HttpStatus.NOT_FOUND );
    }
    return new ResponseEntity<Notification>( notification, HttpStatus.OK );
  }


  /**
   * 
   */
  @RequestMapping(value = "/settings/{account}", method = RequestMethod.PUT)
  public ResponseEntity<?> saveAccount( @RequestBody Notification notification, @PathVariable("account") String account)
  {    
    String url = "http://localhost:8081/accounts/" + account;    
    Account accountInfo = restTemplate.getForObject(url, Account.class);
    
    notification.setUser( accountInfo.getUser() );
    
    try
    {
      notificationService.save( notification );     
      return new ResponseEntity<Notification>( notification, HttpStatus.OK);
    }
    catch( Exception e )
    {      
      return new ResponseEntity<Notification>( notification, HttpStatus.INTERNAL_SERVER_ERROR );
    }
 
  }

}