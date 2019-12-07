/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approject1.Controller;

import java.sql.Date;

/**
 *
 * @author Farwa Malik
 */
public class Admin {
    String name,city,phoneNo,email,password,username;
    Date dateOfBirth,joiningDate;
    public Admin(String username,String name,String password,Date joiningDate,Date dateOfBirth,String city,String phoneNo,String email){
        this.username = username;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.password = password;
        this.phoneNo = phoneNo;
        this.email = email;
        this.joiningDate = joiningDate;
    }
    public String getUserName(){
        return this.username;
    }
    public String getName(){
        return this.name;
    }
    public String getpassword(){
        return this.password;
    }
    public String getCity(){
        return this.city;
    }
    public String getPhoneNo(){
        return this.phoneNo;
    }
    public String getEmail(){
        return this.email;
    }
    public Date getDateOfBirth(){
        return  this.dateOfBirth;
    }
    public Date getJoiningDate(){
        return  this.joiningDate;
    }
}
