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
public class Volunteer {
    int volunteerId;
    String name,city,country,phoneNo,email;
    Date dateOfBirth;
    public Volunteer(int donorId,String name,Date dateOfBirth,String city, String country,String phoneNo,String email){
        this.volunteerId = donorId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
        this.phoneNo = phoneNo;
        this.email = email;
    }
    public int getVolunteerId(){
        return this.volunteerId;
    }
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
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
}
