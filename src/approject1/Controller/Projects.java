/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approject1.Controller;

import approject1.Model.DonationDAO;
import approject1.Model.IDonationDAO;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Farwa Malik
 */
public class Projects {
     String admin,name;
    Date startingDate;
    ArrayList<Beneficiary>beneficiaries;
    ArrayList<Donations> donations;
    ArrayList<Donor> donors;
    ArrayList<Volunteer> volunteers;
    ArrayList<Admin> projectTeam;
    IDonationDAO dao;
    
    public Projects(String admin,String name,Date startingDate){
        this.admin = admin;
        this.name = name;
        this.startingDate = startingDate;
        beneficiaries = new ArrayList<>();
        donors = new ArrayList<>();
        volunteers = new ArrayList<>();
        donations = new ArrayList<>();
        projectTeam = new ArrayList<>();
        dao = new DonationDAO();
    }
    public String getName(){
        return this.name;
    }
    public String getAdminName(){
        return this.admin;
    }
    public Date getStartingDate(){
        return this.startingDate;
    }
    public Projects showProject(String pName){
        return dao.showProject(pName);
    }
     public boolean insertBeneficiaryinTable(Beneficiary b){
        boolean check = true;
        int found = -1;
        beneficiaries = loadBeneficiaries();
        for(int i =0;i < beneficiaries.size();i++)
        {
            if(beneficiaries.get(i).getBeneficiariesId()== b.getBeneficiariesId())
            {
                check = false;
                found = i;
            }
        }
        if(!check)
        {
            return false;
        }
        else{
            beneficiaries.add(b);
            saveBenefeciaries(b);
            //dao.insertBeneficiaryInProject(b.getBeneficiariesId(), this.getName());
            return true;
        }
    }
    public boolean InsertDonation(Donations d){
        boolean check = false;
        int found = -1;
        donations = loadDonations();
        for(int i =0;i < donations.size();i++)
        {
            if(donations.get(i).getDonationId() == d.getDonationId())
            {
                check = true;
                found = i;
            }
        }
        if(!check)
        {
            return false;
        }
        else{
            donations.add(d);
            saveDonation(d);
            return true;
        }
    }
    public boolean UpdateDonation(Donations d,int id){
        boolean check = false;
        int found = -1;
        donations = loadDonations();
        for(int i =0;i < donations.size();i++)
        {
            if((donations.get(i).donationId == id))
            {
                check = true;
                found = i;
            }
        }
        if(check && found!= -1 )
        {
            String s = dao.updateDonation(d.getDonorId(),d.getDonationId(), d.getDonationType(), d.getAmount(), d.getProjectName(),d.getDonationDate(),id);
            if(!s.equals("Donation effected"))
            {
                donations.remove(found);
                donations.add(d);
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }
    public boolean DeleteDonation(int id){
        for(int i =0; i < donations.size();i++){
            if(donations.get(i).getDonationId() == id)
            {                    
                donations.remove(i);
                dao.deleteDonation(id);
                return true;
            }
        }
        return false;
    }
    public boolean InsertDonor(Donor d){
        boolean check = true;
        for(int i =0;i < donors.size();i++)
        {
            if(donors.get(i).getDonorId() == d.donorId)
                check = false;
        }
        if(!check)
        {
            return false;
        }
        else{
            donors.add(d);
            saveDonor(d);
            //dao.insertDonorInProject(d.donorId,this.getName());
            return true;
        }
    }
    public boolean UpdateDonor(Donor d,int id){
        boolean check = false;
        int found = -1;
        donors = loadDonor();
        for(int i =0;i < donors.size();i++)
        {
            if((donors.get(i).donorId == id))
            {
                check = true;
                found = i;
            }
        }
        if(check && found!= -1 )
        {
            String s = dao.updateDonor(d.donorId, d.getName(),d.getDateOfBirth(), d.getCity(), d.getCountry(), d.getPhoneNo(), d.getEmail(), id);
            if(s.equals("Donor Updated"))
            {
                donors.remove(found);
                donors.add(d);
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }
    public boolean DeleteDonor(int id){
        donors=loadDonor();
        for(int i =0; i < donors.size();i++){
            if(donors.get(i).getDonorId() == id)
            {                    
                donors.remove(i);
                dao.deleteDonorFromProject(id, name);
                return true;
            }
        }
        return false;
    }
    public boolean InsertVolunteer(Volunteer v){
        boolean check = true;
        int found = -1;
        volunteers = loadVolunteers();
        for(int i =0;i < volunteers.size();i++)
        {
            if(volunteers.get(i).getVolunteerId() == v.getVolunteerId())
            {
                check = false;
                found = i;
            }
        }
        if(!check)
        {
            return false;
        }
        else{
            volunteers.add(v);
            saveVolunteers(v);
            //dao.insertVolunteerInProject(v.volunteerId, this.getName());
            return true;
        }
    }
    public boolean UpdateVolunteer(Volunteer v,int id){
        boolean check = true;
        int found = -1;
        volunteers = loadVolunteers();
        for(int i =0;i < volunteers.size();i++)
        {
            if((volunteers.get(i).getVolunteerId() == id))
            {
                check = false;
                found = i;
            }
        }
        if(check && found!= -1 )
        {
            String s = dao.updateVolunteer(v.getVolunteerId(), v.getName(), v.getDateOfBirth(), v.getCity(), v.getCountry(), v.getPhoneNo(), v.getEmail(), id);
            if(s.equals("Volunteer Updated"))
            {
                volunteers.remove(found);
                volunteers.add(v);
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }
    public boolean DeleteVolunteer(int id){
        volunteers=loadVolunteers();
        for(int i =0; i < volunteers.size();i++){
            if(volunteers.get(i).getVolunteerId() == id)
            {                    
                volunteers.remove(i);
                dao.deleteVolunteerFromProject(id,name);
                return true;
            }
        }
        return false;
    }
    public boolean InsertBeneficiary(Beneficiary b){
        boolean check = true;
        int found = -1;
        beneficiaries = loadBeneficiaries();
        for(int i =0;i < beneficiaries.size();i++)
        {
            if(beneficiaries.get(i).getBeneficiariesId()== b.getBeneficiariesId())
            {
                check = false;
                found = i;
            }
        }
        if(!check)
        {
            return false;
        }
        else{
            beneficiaries.add(b);
            saveBenefeciaries(b);
            //dao.insertBeneficiaryInProject(b.getBeneficiariesId(), this.getName());
            return true;
        }
    }
    
   
    public boolean UpdateBeneficiary(Beneficiary b,int id){
        boolean check = false;
        int found = -1;
        beneficiaries = loadBeneficiaries();
        for(int i =0;i < beneficiaries.size();i++)
        {
            if((beneficiaries.get(i).getBeneficiariesId() == id))
            {
                check = true;
                found = i;
            }
        }
        if(check && found!= -1 )
        {
            String s = dao.updateBeneficiary(b.getBeneficiariesId(), b.getName(), b.getDateOfBirth(), b.getCity(), b.getCity(),b.getCountry(), b.getEmail(), id);
            if(s.equals("Beneficiary Updated"))
            {
                beneficiaries.remove(found);
                beneficiaries.add(b);
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    
    }
    public boolean DeleteBeneficiary(int id){
        beneficiaries=loadBeneficiaries();
        for(int i =0; i < beneficiaries.size();i++){
            if(beneficiaries.get(i).getBeneficiariesId()== id)
            {                    
                beneficiaries.remove(i);
                dao.deleteBeneficiaryFromProject(id,name);
                return true;
            }
        }
        return false;
    }
    public boolean InsertProjectTeam(Admin a){
        boolean check = true;
        int found = -1;
        projectTeam = loadTeam();
        for(int i =0;i < projectTeam.size();i++)
        {
            if(projectTeam.get(i).getUserName().equals(a.getUserName()))
            {
                check = false;
                found = i;
            }
        }
        if(!check)
        {
            return false;
        }
        else{
            projectTeam.add(a);
            saveProjectTeam(a);
            //dao.insertIntoProjectTeam(this.getName(), a.getName());
            return true;
        }
    }
    public boolean UpdateProjectTeam(Admin a,String username){
        boolean check = false;
        int found = -1;
        projectTeam = loadTeam();
        for(int i =0;i < projectTeam.size();i++)
        {
            if((projectTeam.get(i).getUserName().equals(username)))
            {
                check = true;
                found = i;
            }
        }
        if(check && found!= -1 )
        {
            boolean s = dao.updateAdmin(a.getUserName(), a.getName(), a.getpassword(),a.getJoiningDate(), a.getDateOfBirth(), a.getCity(),a.getPhoneNo(), a.getEmail(), username);
            if(s == true)
            {
                projectTeam.remove(found);
                projectTeam.add(a);
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    
    }
    public boolean DeleteProjectTeam(String username){
        projectTeam=loadTeam();
        for(int i =0; i < projectTeam.size();i++){
            if(projectTeam.get(i).getUserName().equals(username))
            {                    
                projectTeam.remove(i);
                dao.deleteFromProjectTeam(name, username);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Admin> loadTeam(){
        return dao.showProjectTeam(name);
    }
    public ArrayList<Donations> loadDonations(){
        return dao.showProjectDonations(name);
    }
    public ArrayList<Beneficiary> loadBeneficiaries(){
        return dao.showProjectBeneficiaries(name);
    }
    public ArrayList<Donor> loadDonor(){
        return dao.showProjectDonors(name);
    }
    public ArrayList<Volunteer> loadVolunteers(){
        return dao.showProjectVolunteers(name);
    }

    private void saveDonation(Donations d) {
        dao.insertDonation(d.getDonorId(), d.getDonationId(), d.getDonationType(), d.getAmount(), d.getProjectName(), d.getDonationDate());
    }

    private void saveDonor(Donor d) {
        dao.insertDonorInProject(d.getDonorId(), name);
    }

    private void saveVolunteers(Volunteer v) {
        dao.insertVolunteerInProject(v.getVolunteerId(), name);
    }

    private void saveBenefeciaries(Beneficiary b) {
        dao.insertBeneficiaryInProject(b.getBeneficiariesId(), name);
    }
    private void saveProjectTeam(Admin pt) {
        dao.insertIntoProjectTeam(name,pt.getUserName());
    }
}
