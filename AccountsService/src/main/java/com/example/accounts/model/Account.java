package com.example.accounts.model;

import org.springframework.data.annotation.Id;


public class Account {

    @Id
    public String id;

    public String user;
    public String firstName;
    public String middleName;
    public String lastName;
    public String prefix;    
    public String suffix;   
    public String office;
    public String department;
    public String jobTittle;

    public Account() {}

    public Account( String user, String firstName, String middleName, String lastName, String prefix, String phone, String suffix, String mobile, String office, String department, String jobTittle )
    {
      super();
      this.user = user;
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
      this.prefix = prefix;
      this.suffix = suffix;
      this.office = office;
      this.department = department;
      this.jobTittle = jobTittle;
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

    public String getFirstName()
    {
      return firstName;
    }

    public void setFirstName( String firstName )
    {
      this.firstName = firstName;
    }

    public String getMiddleName()
    {
      return middleName;
    }

    public void setMiddleName( String middleName )
    {
      this.middleName = middleName;
    }

    public String getLastName()
    {
      return lastName;
    }

    public void setLastName( String lastName )
    {
      this.lastName = lastName;
    }

    public String getPrefix()
    {
      return prefix;
    }

    public void setPrefix( String prefix )
    {
      this.prefix = prefix;
    }
  

    public String getSuffix()
    {
      return suffix;
    }

    public void setSuffix( String suffix )
    {
      this.suffix = suffix;
    }

    public String getOffice()
    {
      return office;
    }

    public void setOffice( String office )
    {
      this.office = office;
    }

    public String getDepartment()
    {
      return department;
    }

    public void setDepartment( String department )
    {
      this.department = department;
    }

    public String getJobTittle()
    {
      return jobTittle;
    }

    public void setJobTittle( String jobTittle )
    {
      this.jobTittle = jobTittle;
    }
    

}