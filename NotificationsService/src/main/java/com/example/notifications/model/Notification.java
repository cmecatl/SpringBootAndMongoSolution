package com.example.notifications.model;

import org.springframework.data.annotation.Id;

public class Notification
{

  @Id
  public String id;
  
  public String user;
  public String phone;
  public String mobile;
  public String email;
  public String remindFrequency;
  public String backupFrequency;

  public Notification()
  {
  } 

  public Notification( String user, String phone, String mobile, String email, String remindFrequency, String backupFrequency )
  {
    super();
    this.user = user;
    this.phone = phone;
    this.mobile = mobile;
    this.email = email;
    this.remindFrequency = remindFrequency;
    this.backupFrequency = backupFrequency;
  }
  

  public String getUser()
  {
    return user;
  }

  public void setUser( String user )
  {
    this.user = user;
  }

  public String getId()
  {
    return id;
  }

  public void setId( String id )
  {
    this.id = id;
  }

  public String getPhone()
  {
    return phone;
  }

  public void setPhone( String phone )
  {
    this.phone = phone;
  }

  public String getMobile()
  {
    return mobile;
  }

  public void setMobile( String mobile )
  {
    this.mobile = mobile;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail( String email )
  {
    this.email = email;
  }

  public String getRemindFrequency()
  {
    return remindFrequency;
  }

  public void setRemindFrequency( String remindFrequency )
  {
    this.remindFrequency = remindFrequency;
  }

  public String getBackupFrequency()
  {
    return backupFrequency;
  }

  public void setBackupFrequency( String backupFrequency )
  {
    this.backupFrequency = backupFrequency;
  }

}