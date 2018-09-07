package com.example.notifications.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notifications.model.Notification;
import com.example.notifications.repository.NotificationRepository;

/**
 * @author cmecatl
 *
 */

@Service("notificationService")
public class NotificationServiceImpl implements  NotificationService
{
  
  @Autowired
  NotificationRepository notificationRepository;

  @Override
  public void save( Notification account )
  {
    notificationRepository.save( account );
    
  }

  @Override
  public Notification findById( String id )
  {
    return notificationRepository.findById( id ).get();
  }

  @Override
  public Notification findByUser( String user )
  {
    return notificationRepository.findByUser (user);
  }


}