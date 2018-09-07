package com.example.notifications.service;

import com.example.notifications.model.Notification;

/**
 * @author cmecatl
 *
 */
public interface NotificationService
{

  Notification findById (String id);
  
  void save (Notification account);

  Notification findByUser( String account );

}