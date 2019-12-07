/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approject1.Model;

import approject1.Controller.Admin;
import approject1.Controller.Beneficiary;
import approject1.Controller.Donations;
import approject1.Controller.Donor;
import approject1.Controller.Organization;
import approject1.Controller.Projects;
import approject1.Controller.Volunteer;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Farwa Malik
 */
public interface IDonationDAO {
    public ArrayList<Admin> showAdmins();
    public ArrayList<Donor> showDonors();
    public ArrayList<Donations> showAllDonations();
    public ArrayList<Donations> showProjectDonations(String projectName);
    public ArrayList<Donor> showProjectDonors(String projectName);
    public Organization showOrganization();
    public Projects showProject(String pName);
    public ArrayList<Projects> showProjects();
    public Admin showProfile(String username);
    public ArrayList<Volunteer> showVolunteers();
    public ArrayList<Beneficiary> showBeneficiaries();
    public String getProjectAdminName(String projectName);
    public ArrayList<Volunteer> showProjectVolunteers(String pName);
    public ArrayList<Beneficiary> showProjectBeneficiaries(String pName);
    public ArrayList<Admin> showProjectTeam(String projectName);
    public String configureOrganization(String username,String name,Date foundingDate, String department, String password);
    public String updateOrganization(String username,String name,Date foundingDate, String department, String password,String updatedBy);
    public Organization loginOrganization(String username, String password);
    public Admin signUpAdmin(String username, String name, String password, Date joiningDate,Date dateOfBirth,String city,String phone,String email);
    public boolean updateAdmin(String username, String name, String password, Date joiningDate,Date dateOfBirth,String city,String phone,String email,String oldUsername);
    public Admin loginAdmin(String username, String password);
    public boolean deleteAdmin(String username);
    
    //TODO: these and add,remove donor ,beneficiary,volunteer from project
    public Projects insertProject(String projectName,Date startingDate,String adminName);
    public String deleteProject(String projectName);
    public String updateProject(String projectName,Date startingDate,String adminName,String oldPname);
    public String insertIntoProjectTeam(String projectName,String username);
    public String deleteFromProjectTeam(String projectName,String username);
    public String insertDonation(int donorId,int donationId,String donationType,int amount,String projectName,Date donatedOn);
    public boolean deleteDonation(int donationId);
    public String updateDonation(int donorId,int donationId,String donationType,int amount,String projectName,Date donatedOn,int oldDonationId);
    public String insertDonor(int donorId,String name,Date dateOfBirth,String city, String country,String phoneNo,String email);
    public String deleteDonor(int donorId);
    public String updateDonor(int donorId,String name,Date dateOfBirth,String city, String country,String phoneNo,String email,int oldDonorId);
    public String insertBeneficiary(int beneficiaryId,String name,Date dateOfBirth,String city, String country,String phoneNo,String email);
    public String deleteBeneficiary(int beneficiaryId);
    public String updateBeneficiary(int beneficiaryId,String name,Date dateOfBirth,String city, String country,String phoneNo,String email,int oldBeneficiaryId);
    public String insertVolunteer(int volunteerId,String name,Date dateOfBirth,String city, String country,String phoneNo,String email);
    public String deleteVolunteer(int volunteerId);
    public String updateVolunteer(int volunteerId,String name,Date dateOfBirth,String city, String country,String phoneNo,String email,int oldVolunteerId);
    public String insertVolunteerInProject(int volunteerId,String p_name);
    public String deleteVolunteerFromProject(int volunteerId,String p_name);
    public String insertDonorInProject(int donorId,String p_name);
    public String deleteDonorFromProject(int donorId,String p_name);
    public String insertBeneficiaryInProject(int beneficiaryId,String p_name);
    public String deleteBeneficiaryFromProject(int beneficiaryId,String p_name);
    
}
