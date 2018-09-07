package com.example.notifications.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.notifications.model.Notification;

public interface NotificationRepository extends MongoRepository<Notification, String> {

  Notification findByUser( String user );
}