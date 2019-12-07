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
public class Donations {
    int donorId,donationId,amount;
    String donationType,projectName;
    Date donatedOn;
    public Donations(int donorId,String donationType,int donationId,int amount,Date donatedOn,String projectName){
        this.donorId = donorId;
        this.donationId = donationId;
        this.amount = amount;
        this.donationType = donationType;
        this.donatedOn = donatedOn;
        this.projectName = projectName;
    }
    
    public Donations(int donorId,String donationType,int donationId,int amount,Date donatedOn){ //for DAO CLASS
        this.donorId = donorId;
        this.donationId = donationId;
        this.amount = amount;
        this.donationType = donationType;
        this.donatedOn = donatedOn;
    }
    public int getDonorId(){
        return this.donorId;
    }
    public int getDonationId(){
        return this.donationId;
    }
    public int getAmount(){
        return this.amount;
    }
    public String getDonationType(){
        return this.donationType;
    }
    public String getProjectName(){
        return this.projectName;
    }
    public Date getDonationDate(){
        return this.donatedOn;
    }
}
