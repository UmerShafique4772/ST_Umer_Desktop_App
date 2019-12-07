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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Farwa Malik
 */

public class DonationDAO implements IDonationDAO{
    @Override
    public ArrayList<Admin> showAdmins() {
    String sql = "select * from admins";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Admin> admins = new ArrayList<>();
        try {
            while(rs.next())
            {

                String phoneNo,email,city,name,country,password,username;
                Date dateOfBirth,joiningDate;
                username = rs.getString(1);
                name  = rs.getString(2);
                password = rs.getString(3);
                dateOfBirth = rs.getDate(4);
                joiningDate = rs.getDate(5);
                city = rs.getString(6);
                phoneNo = rs.getString(7);
                email = rs.getString(8);
                
                Admin a = new Admin(username,name,password,joiningDate,dateOfBirth,city,phoneNo,email);
                admins.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return admins;
    }

    @Override
    public ArrayList<Donor> showDonors() {
    String sql = "select * from donor";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Donor> donors = new ArrayList<>();
        try {
            while(rs.next())
            {

                String phoneNo,email,city,name,country;
                Date dateOfBirth;
                name = rs.getString(1);
                int donorId  = rs.getInt(2);
                dateOfBirth = rs.getDate(3);
                city = rs.getString(4);
                country = rs.getString(5);
                phoneNo = rs.getString(6);
                email = rs.getString(7);
                
                Donor d = new Donor(donorId,name,dateOfBirth,city,country,phoneNo,email);
                donors.add(d);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return donors;
    }

    @Override
    public ArrayList<Donations> showAllDonations() {
        String sql = "select * from donation";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Donations> donations = new ArrayList<>();
        try {
            while(rs.next())
            {
                
                int donorId = rs.getInt(1);
                String donationType = rs.getString(2);
                int donationId = rs.getInt(3);
                int amount = rs.getInt(4);
                Date donatedOn = rs.getDate(5);
                String project = rs.getString(6);
                Donations d;
                d = new Donations(donorId,donationType,donationId,amount,donatedOn,project);
                donations.add(d);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return donations;
    }

    @Override
    public ArrayList<Donations> showProjectDonations(String projectName) {
        String sql = "select * from donation where projectName = '" + projectName +"'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Donations> donations = new ArrayList<>();
        try {
            while(rs.next())
            {
                
                int donorId = rs.getInt(1);
                String donationType = rs.getString(2);
                int donationId = rs.getInt(3);
                int amount = rs.getInt(4);
                Date donatedOn = rs.getDate(5);
                String pName = rs.getString(6);
                Donations d;
                d = new Donations(donorId,donationType,donationId,amount,donatedOn,pName);
                donations.add(d);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return donations;
    }

    @Override
    public Organization showOrganization() {
        String sql = "select * from organization";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        Organization org = null;
        try {
            while(rs.next())
            {
                String username,name,department ,password,updateOrGeneratedBy;
                Date foundingDate;
                Time updateTime;
                username = rs.getString(1);
                name = rs.getString(2);
                foundingDate = rs.getDate(3);
                department = rs.getString(4);
                password = rs.getString(5);
                updateOrGeneratedBy = rs.getString(6);
                updateTime = rs.getTime(7);
                org = new Organization(username,name,department,password,updateOrGeneratedBy,foundingDate,updateTime);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return org;
    }

    @Override
    public ArrayList<Projects> showProjects() {
        String sql = "select * from projects";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Projects> projects = new ArrayList<>();
        try {
            while(rs.next())
            {
                
                String name = rs.getString(1);
                Date startingDate = rs.getDate(2);
                String adminUserName = rs.getString(3);
                Projects p;
                p = new Projects(adminUserName,name,startingDate);
                projects.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return projects;
        
    }

    @Override
    public Admin showProfile(String username) {
        String sql = "select * from admins where username = '" + username +"'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        Admin admin = null;
        try {
            while(rs.next())
            {
                String phoneNo,email,city,password,name,country,uname;
                Date dateOfBirth,joiningDate;
                uname = rs.getString(1);
                name = rs.getString(2);
                password = rs.getString(3);
                joiningDate = rs.getDate(4);
                dateOfBirth = rs.getDate(5);
                city = rs.getString(6);
                phoneNo = rs.getString(7);
                email = rs.getString(8);
                
                admin = new Admin(uname,name,password,joiningDate,dateOfBirth,city,phoneNo,email);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return admin;

    }
    @Override
    public ArrayList<Volunteer> showProjectVolunteers(String pName) {
        String sql = "select v.* from volunteers v inner join volunteerProject vp on vp.volunteerId = v.volunteerId where vp.p_name = '" + pName +"'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Volunteer> volunteers = new ArrayList<>();
        try {
            while(rs.next())
            {

                String phoneNo,email,city,name,country;
                Date dateOfBirth;
                name = rs.getString(1);
                int volunteerId  = rs.getInt(2);
                dateOfBirth = rs.getDate(3);
                city = rs.getString(4);
                country = rs.getString(5);
                phoneNo = rs.getString(6);
                email = rs.getString(7);
                
                Volunteer v = new Volunteer(volunteerId,name,dateOfBirth,city,country,phoneNo,email);
                volunteers.add(v);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return volunteers;
    }

    @Override
    public ArrayList<Beneficiary> showProjectBeneficiaries(String pName) {
        String sql = "select b.* from beneficiary b inner join beneficiaryProject bp on bp.beneficiaryId = b.beneficiaryId where bp.p_name = '" + pName +"'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Beneficiary> beneficiaries = new ArrayList<>();
        try {
            while(rs.next())
            {

                String phoneNo,email,city,name,country;
                Date dateOfBirth;
                name = rs.getString(1);
                int volunteerId  = rs.getInt(2);
                dateOfBirth = rs.getDate(3);
                city = rs.getString(4);
                country = rs.getString(5);
                phoneNo = rs.getString(6);
                email = rs.getString(7);
                
                Beneficiary b = new Beneficiary(volunteerId,name,dateOfBirth,city,country,phoneNo,email);
                beneficiaries.add(b);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        //System.out.println(rs.next());
        return beneficiaries;
    }

    @Override
    public ArrayList<Volunteer> showVolunteers() {
        String sql = "select * from volunteers";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Volunteer> volunteers = new ArrayList<>();
        try {
            while(rs.next())
            {

                String phoneNo,email,city,name,country;
                Date dateOfBirth;
                name = rs.getString(1);
                int volunteerId  = rs.getInt(2);
                dateOfBirth = rs.getDate(3);
                city = rs.getString(4);
                country = rs.getString(5);
                phoneNo = rs.getString(6);
                email = rs.getString(7);
                
                Volunteer v = new Volunteer(volunteerId,name,dateOfBirth,city,country,phoneNo,email);
                volunteers.add(v);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return volunteers;
    }

    @Override
    public ArrayList<Beneficiary> showBeneficiaries(){
        String sql = "select * from beneficiary";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Beneficiary> beneficiaries = new ArrayList<>();
        try {
            while(rs.next())
            {

                String phoneNo,email,city,name,country;
                Date dateOfBirth;
                name = rs.getString(1);
                int volunteerId  = rs.getInt(2);
                dateOfBirth = rs.getDate(3);
                city = rs.getString(4);
                country = rs.getString(5);
                phoneNo = rs.getString(6);
                email = rs.getString(7);
                
                Beneficiary b = new Beneficiary(volunteerId,name,dateOfBirth,city,country,phoneNo,email);
                beneficiaries.add(b);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return beneficiaries;
    }

    @Override
    public ArrayList<Admin> showProjectTeam(String projectName) {
        String sql = "select a.* from projectTeam p inner join admins a on a. username = p.username where p.projectName = '" + projectName+ "'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Admin> admins = new ArrayList<>();
        try {
            while(rs.next())
            {
                String phoneNo,email,city,password,name,country,uname;
                Date dateOfBirth,joiningDate;
                uname = rs.getString(1);
                name = rs.getString(2);
                password = rs.getString(3);
                joiningDate = rs.getDate(4);
                dateOfBirth = rs.getDate(5);
                city = rs.getString(6);
                phoneNo = rs.getString(7);
                email = rs.getString(8);
                
                Admin admin = new Admin(uname,name,password,joiningDate,dateOfBirth,city,phoneNo,email);
                admins.add(admin);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return admins;

    }
    @Override
    public Projects showProject(String pName) {
        String sql = "select * from projects where projectName = '" + pName + "'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        Projects p = null;
        try {
            while(rs.next())
            {
                
                String name = rs.getString(1);
                Date startingDate = rs.getDate(2);
                String adminUserName = rs.getString(3);
                p = new Projects(adminUserName,name,startingDate);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return p;

    }
    @Override
    public ArrayList<Donor> showProjectDonors(String projectName) {
        String sql = "select d.* from donor d inner join donorProject dp on d.donorId = dp.donorId where dp.p_name = '" +projectName+ "'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Donor> donors = new ArrayList<>();
        try {
            while(rs.next())
            {

                String phoneNo,email,city,name,country;
                Date dateOfBirth;
                name = rs.getString(1);
                int donorId  = rs.getInt(2);
                dateOfBirth = rs.getDate(3);
                city = rs.getString(4);
                country = rs.getString(5);
                phoneNo = rs.getString(6);
                email = rs.getString(7);
                
                Donor d = new Donor(donorId,name,dateOfBirth,city,country,phoneNo,email);
                donors.add(d);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return donors;

    }


    @Override
    public String configureOrganization(String username, String name, Date foundingDate, String department, String password) {
        String sql = "insert into organization values(?,?,?,?,?,?,?)";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(username);
        ob.add(name);
        ob.add(foundingDate);
        ob.add(department);
        ob.add(password);
        ob.add("System");
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String t = dateFormat.format(calendar.getTime());
        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Time updateTime;
        long ms = 0;
        try {
            ms = sdf.parse(t).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateTime = new Time(ms);

        ob.add(updateTime);
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        type.add("String");
        type.add("Date");
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("Time");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
            return "Flight saved";
        else if(effected >= 1)
            return "Flight already exists";
        else
            return "Exception";
    
    }

   @Override
    public String updateOrganization(String username, String name, Date foundingDate, String department, String password, String updatedBy) {
        String sql = "delete from organization where username = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(username);
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            System.out.println("Unable to delete");
        }
        else if(effected >= 1)
        {
            System.out.println("Deleted successfully!");
        }
        else{
            
            System.out.println("Exception");
            //return false;
        }    
//        String s=configureOrganization(username,name,foundingDate,department,password,updatedBy);
//        //String sql = "update organization set username = ? ,name = ? , foundingDate = ? , department = ? ,password = ? , updatedBy = ? , updateTime = ? where username = ?";
//        String sql1 = "insert into organization values(?,?,?,?,?,?,?)";
//        System.out.println(updatedBy);
//        System.out.println(username);
//        System.out.println(name);
//        System.out.println(foundingDate);
//        System.out.println(password);
//        ArrayList<Object> ob1 = new ArrayList<>();
//        ob1.add(username);
//        ob1.add(name);
//        ob1.add(foundingDate);
//        ob1.add(department);
//        ob1.add(password);
//        ob1.add(updatedBy);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
//        Calendar calendar = Calendar.getInstance();
//        String t = dateFormat.format(calendar.getTime());
//        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//        Time updateTime;
//        long ms = 0;
//        try {
//            ms = sdf.parse(t).getTime();
//        } catch (ParseException ex) {
//            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        updateTime = new Time(ms);
//        ob.add(updateTime);
//        System.out.println(updateTime);
//        ArrayList<String> type1 = new ArrayList<>();
//        type1.add("String");
//        type1.add("String");
//        type1.add("Date");
//        type1.add("String");
//        type1.add("String");
//        type1.add("String");
//        type1.add("Time");
//        effected = 0;
//        try{
//            effected= DataAccessHelper.execute(sql1,ob1 , type1);
//           
//        }
//        catch(Exception e)
//        {
//            effected = -1;
//        }
//        if(effected == 0)
//        {
//            System.out.println("Exception");
//            return "Exception";
//        }
//        else if(effected >= 1)
//        {
//            System.out.println("organization effected");
//            return "organization effected";
//        }
//        return null;
         String sql1 = "insert into organization values(?,?,?,?,?,?,?)";
        ArrayList<Object> ob1 = new ArrayList<>();
        ob1.add(username);
        ob1.add(name);
        ob1.add(foundingDate);
        ob1.add(department);
        ob1.add(password);
        ob1.add(updatedBy);
        System.out.println("Department : "+department);
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String t = dateFormat.format(calendar.getTime());
        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Time updateTime;
        long ms = 0;
        try {
            ms = sdf.parse(t).getTime();
        } catch (ParseException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateTime = new Time(ms);

        ob1.add(updateTime);
        ArrayList<String> type1 = new ArrayList<>();
        type1.add("String");
        type1.add("String");
        type1.add("Date");
        type1.add("String");
        type1.add("String");
        type1.add("String");
        type1.add("Time");
        effected = DataAccessHelper.execute(sql1,ob1, type1);
        if(effected == 0)
            return "Flight saved";
        else if(effected >= 1)
            return "Updated Successfully";
        else
            return "Exception";
    

    }
  
    
    @Override
    public Organization loginOrganization(String username, String password) {
        String sql = "select * from organization where username = '" + username+"' AND password = '" + password+ "'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        Organization org = null;
        try {
            while(rs.next())
            {
                String uname,name,department ,p,updateOrGeneratedBy;
                Date foundingDate;
                Time updateTime;
                uname = rs.getString(1);
                name = rs.getString(2);
                foundingDate = rs.getDate(3);
                department = rs.getString(4);
                p = rs.getString(5);
                updateOrGeneratedBy = rs.getString(6);
                updateTime = rs.getTime(7);
                org = new Organization(uname,name,department,p,updateOrGeneratedBy,foundingDate,updateTime);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return org;

    }

    @Override
    public Admin signUpAdmin(String username, String name, String password, Date joiningDate,Date dateOfBirth,String city,String phone,String email) {
        String sql = "insert into admins values(?,?,?,?,?,?,?,?)";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(username);
        ob.add(name);
        ob.add(password);
        ob.add(joiningDate);
        ob.add(dateOfBirth);
        ob.add(city);
        ob.add(phone);
        ob.add(email);
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("Date");
        type.add("Date");
        type.add("String");
        type.add("String");
        type.add("String");
        int effected = 0;
        try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return null;
        }
        else if(effected >= 1)
        {
            Admin a = new Admin(username,name,password,joiningDate,dateOfBirth,city,phone,email);
            return a;
        }
        return null;
    }

    @Override
    public boolean updateAdmin(String username, String name, String password, Date joiningDate,Date dateOfBirth,String city,String phone,String email,String oldUsername){
        String sql = "update admins set username = ? ,name = ? , password = ? , joiningDate = ? ,dateOfBirth = ? , city = ?, phone = ?, email=? where username = ? ";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(username);
        ob.add(name);
        ob.add(password);
        ob.add(joiningDate);
        ob.add(dateOfBirth);
        ob.add(city);
        ob.add(phone);
        ob.add(email);
        ob.add(oldUsername);
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("Date");
        type.add("Date");
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("String");
        int effected = 0;
        try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            System.out.println("Exception");
            return false;
        }
        else if(effected >= 1)
        {
            System.out.println("admin effected");
            return true;
        }
        return false;
    }
    
    public void deleteProjectAdmin(String username)
    {
        String sql = "delete from projects where adminName = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(username);
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            System.out.println( "Project not deleted");
        }
        else if(effected >= 1)
        {
            
            System.out.println( "Project deleted");
        }
        else{
            
            System.out.println("Exception");
            //return "Exception";
        }   
    }
    
    @Override
    public boolean deleteAdmin(String username) {
        String sql = "delete from admins where username = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(username);
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return false;
        }
        else if(effected >= 1)
        {
            deleteProjectAdmin(username);
            return true;
        }
        else{
            
            System.out.println("Exception");
            return false;
        }   

    }

    @Override
    public Admin loginAdmin(String username, String password) {
        String sql = "select * from admins where username = '" + username +"' AND password = '" +password +"'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        Admin admin = null;
        try {
            while(rs.next())
            {
                String phoneNo,email,city,p,name,country,uname;
                Date dateOfBirth,joiningDate;
                uname = rs.getString(1);
                name = rs.getString(2);
                p = rs.getString(3);
                joiningDate = rs.getDate(4);
                dateOfBirth = rs.getDate(5);
                city = rs.getString(6);
                phoneNo = rs.getString(7);
                email = rs.getString(8);
                
                admin = new Admin(uname,name,p,joiningDate,dateOfBirth,city,phoneNo,email);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        return admin;

    }

    @Override
    public Projects insertProject(String projectName, Date startingDate, String adminName) {
        String sql="insert into projects values(?,?,?)";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(projectName);
        ob.add(startingDate);
        ob.add(adminName);
        
        ArrayList<String>type=new ArrayList<>();
        type.add("String");
        type.add("Date");
        type.add("String");
        
        int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return null;
        }
        else if(effected >= 1)
        {
           Projects p  = new Projects(adminName,projectName,startingDate);
           return p;
        }
        return null;
    }

    @Override
    public String deleteProject(String projectName) {
        String sql = "delete from projects where projectName = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(projectName);
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return "Project not deleted";
        }
        else if(effected >= 1)
        {
            return "Project deleted";
        }
        else{
            
            System.out.println("Exception");
            return "Exception";
        }   
    }

    @Override
    public String updateProject(String projectName, Date startingDate, String adminName,String oldPname) {
        String sql = "update projects set projectName = ? ,startingDate = ? , adminName = ? where projectName = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(projectName);
        ob.add(startingDate);
        ob.add(adminName);
        ob.add(oldPname);
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        type.add("Date");
        type.add("String");
        type.add("String");
        int effected = 0;
        try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            System.out.println("Exception");
            return "Exception";
        }
        else if(effected >= 1)
        {
            return "Project effected";
        }
        return null;
    }

    @Override
    public String insertIntoProjectTeam(String projectName, String username) {
    String sql="insert into projectTeam values(?,?) ";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(username);
        ob.add(projectName);
        
        ArrayList<String>type=new ArrayList<>();
        type.add("String");
        type.add("String");
        
          int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return null;
        }
        else if(effected >= 1)
        {
           return "Team Member added";
        }
        return null;
        
    }

    @Override
    public String deleteFromProjectTeam(String projectName, String username) {
        String sql = "delete from projectTeam where username = ? AND projectName = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(username);
        ob.add(projectName);
        
        ArrayList<String> type = new ArrayList<>();
        type.add("String");
        type.add("String");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return "Member could not be deleted";
        }
        else if(effected >= 1)
        {
            return "Member Deleted";
        }
        else{
            
            System.out.println("Exception");
            return "Exception";
        } 
    }

    @Override
    public String insertDonation(int donorId, int donationId, String donationType, int amount, String projectName, Date donatedOn) {
        String sql="insert into donation values(?,?,?,?,?,?) ";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(donorId);
        ob.add(donationType);
        ob.add(donationId);
        
        ob.add(amount);
        ob.add(donatedOn);
        ob.add(projectName);
        
        ArrayList<String>type=new ArrayList<>();
        type.add("int");
        type.add("String");
        type.add("int");
       
        type.add("int");
        type.add("Date");
        type.add("String");
        
          int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return null;
        }
        else if(effected >= 1)
        {
          Donations d  = new Donations(donorId,donationType,donationId,amount, donatedOn,projectName);
           return "Donation added";
        }
        return null;
    }

    @Override
    public boolean deleteDonation(int donationId) {
        String sql = "delete from donation where donationId = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(donationId);
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return false;
        }
        else if(effected >= 1)
        {
            return true;
        }
        else{
            
            System.out.println("Exception");
            return false;
        } 
    }

    @Override
    public String updateDonation(int donorId, int donationId, String donationType, int amount, String projectName, Date donatedOn,int oldDonationId) {
       String sql = "update donation set donorId= ? ,donationType = ? , donationId = ? ,amount=? , donatedOn=?, projectName=? where donationId = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(donorId);
        ob.add(donationType);
        ob.add(donationId);
        
        ob.add(amount);
        ob.add(donatedOn);
        ob.add(projectName);
        ob.add(oldDonationId);
        
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        type.add("String");
        type.add("int");
        type.add("int");
        type.add("Date");
        type.add("String");
        type.add("int");
        int effected = 0;
        try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            System.out.println("Exception");
            return "Exception";
        }
        else if(effected >= 1)
        {
            return "Donation effected";
        }
        return null;
    }

    @Override
    public String insertDonor(int donorId, String name, Date dateOfBirth, String city, String country, String phoneNo, String email) {
        String sql="insert into donor values(?,?,?,?,?,?,?)";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(name);
        ob.add(donorId);
        ob.add(dateOfBirth);
        ob.add(city);
        ob.add(country);
        ob.add(phoneNo);
        ob.add(email);
         
        ArrayList<String>type=new ArrayList<>();
        type.add("String");
        type.add("int");
        type.add("Date");
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("String");
        
        int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return "Donor Not Added";
        }
        else if(effected >= 1)
        {
            Donor d  = new Donor(donorId, name,dateOfBirth,  city,  country, phoneNo, email);
           return "Donor added";
        }
        return null;

    }

    public void deletedonorProject(int id)
    {
        String sql = "delete from donorProject where donorId = ? ";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(id);
        
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            System.out.println( "Donor could not be deleted");
        }
        else if(effected >= 1)
        {
            System.out.println ("Donor Deleted");
        }
        else{
            
            System.out.println("Exception");
            //return "Exception";
        }
    }
    
    @Override
    public String deleteDonor(int donorId) {
        String sql = "delete from donor where donorId = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(donorId);
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            deletedonorProject(donorId);
            return "Donor not deleted";
        }
        else if(effected >= 1)
        {
            return "Donor deleted";
        }
        else{
            
            System.out.println("Exception");
            return "Exception";
        } 
    
    }

    @Override
    public String updateDonor(int donorId, String name, Date dateOfBirth, String city, String country, String phoneNo, String email,int oldDonorId) {
        String sql = "update donor set donorId = ?,name=?,dateOfBirth=?,city=?,country=?,phoneNo=?,email=? where donorId = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(donorId);
        ob.add(name);
        ob.add(dateOfBirth);
        ob.add(city);
         ob.add(country);
        ob.add(phoneNo);
        ob.add(email);
        ob.add(oldDonorId);
        
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        type.add("String");
        type.add("Date");
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("int");
        int effected = 0;
        try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            System.out.println("Exception");
            return "Exception";
        }
        else if(effected >= 1)
        {
            return "Donor effected";
        }
        return null;
    
    }

    @Override
    public String insertBeneficiary(int beneficiaryId, String name, Date dateOfBirth, String city, String country, String phoneNo, String email) {
       String sql="insert into beneficiary values(?,?,?,?,?,?,?)";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(name);
        ob.add(beneficiaryId);
        ob.add(dateOfBirth);
        ob.add(city);
        ob.add(country);
        ob.add(phoneNo);
        ob.add(email);
        
        ArrayList<String>type=new ArrayList<>();
        type.add("String");
        type.add("int");
        type.add("Date");
        type.add("String");
        type.add("String");
        type.add("String");
         type.add("String");
        
        int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            
            return "beneficiary not added";
        }
        else if(effected >= 1)
        {
          Beneficiary b=new Beneficiary(beneficiaryId, name,  dateOfBirth,city, country,  phoneNo, email);
           return "Beneficiary added";
        }
        return null;

    }

    public void deletebeneficiaryProject(int id)
    {
        String sql1 = "delete from beneficiaryProject where beneficiaryId = ? ";
        ArrayList<Object> ob1 = new ArrayList<>();
        ob1.add(id);
        //ob.add(p_name);
        
        ArrayList<String> type1 = new ArrayList<>();
        type1.add("int");
        //type.add("String");
        int effected = DataAccessHelper.execute(sql1,ob1 , type1);
        if(effected == 0)
        {
            System.out.println( "Beneficiary could not be deleted");
        }
        else if(effected >= 1)
        {
            System.out.println( "Beneficiary Deleted");
        }
        else{
            
            System.out.println("Exception");
          
        } 
 
    }
    
    @Override
    public String deleteBeneficiary(int beneficiaryId) {
        String sql = "delete from beneficiary where beneficiaryId = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(beneficiaryId);
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return "Beneficiary not deleted";
        }
        else if(effected >= 1)
        {
            deletebeneficiaryProject(beneficiaryId);
            return "Beneficiary deleted"; 
        }
        else{
            
            System.out.println("Exception");
            return "Exception";
        } 
       
        
       
    }

    @Override
    public String updateBeneficiary(int beneficiaryId, String name, Date dateOfBirth, String city, String country, String phoneNo, String email,int oldBeneficiaryId) {
        String sql = "update beneficiary set serial_number = ? ,name= ? , date_of_birth = ? ,city=?,country=?,phone_no=?,email=? where serial_number= ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(beneficiaryId);
        ob.add(name);
        ob.add(dateOfBirth);
        ob.add(city);
        ob.add(country);
        ob.add(phoneNo);
        ob.add(email);
        ob.add(oldBeneficiaryId);
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        type.add("String");
        type.add("Date");
        
        type.add("String");
        type.add("String");
        
        type.add("String");
        type.add("String");
        type.add("int");
        int effected = 0;
        try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            System.out.println("Exception");
            return "Exception";
        }
        else if(effected >= 1)
        {
            return "Beneficiary effected";
        }
        return null;

    }

    @Override
    public String insertVolunteer(int volunteerId, String name, Date dateOfBirth, String city, String country, String phoneNo, String email) {
        String sql="insert into volunteers values(?,?,?,?,?,?,?)";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(name);
        ob.add( volunteerId);
        ob.add(dateOfBirth);
        ob.add(city);
        ob.add(country);
        ob.add(phoneNo);
        ob.add(email);
        
        ArrayList<String>type=new ArrayList<>();
        type.add("String");
        type.add("int");
        type.add("Date");
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("String");
        
        int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return "volunteer not added";
        }
        else if(effected >= 1)
        {
           Volunteer v  = new Volunteer(volunteerId, name,  dateOfBirth,  city, country,  phoneNo,email);
           return "vounteer added";
        }
        return null;
}

    public void deleteVolunteerProject(int id){
        String sql = "delete from volunteerProject where volunteerId = ? ";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(id);
        
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            System.out.println("Volunteer could not be deleted");
        }
        else if(effected >= 1)
        {
            System.out.println("Volunteer Deleted");
        }
        else{
            
            System.out.println("Exception");
            //return "Exception";
        } 
    }
    
    @Override
    public String deleteVolunteer(int volunteerId) {
        String sql = "delete from volunteers where volunteerId = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(volunteerId);
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return "Volunteer not deleted";
        }
        else if(effected >= 1)
        {
            deleteVolunteerProject(volunteerId);
            return "volunteer deleted";
        }
        else{
            
            System.out.println("Exception");
            return "Exception";
        } 
    }

    @Override
    public String updateVolunteer(int volunteerId, String name, Date dateOfBirth, String city, String country, String phoneNo, String email,int oldVolunteerId) {
       String sql = "update volunteers set serial_number = ? ,name = ? , date_of_birth = ?,city=?,country=?,phone_no=?,email=? where serial_number = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(volunteerId);
        ob.add(name);
        ob.add(dateOfBirth);
        ob.add(city);
        ob.add(country);
        ob.add(phoneNo);
        ob.add(email);
        ob.add(oldVolunteerId);
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        type.add("String");
        type.add("Date");
        
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("String");
        type.add("int");
        int effected = 0;
        try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            System.out.println("Exception");
            return "Exception";
        }
        else if(effected >= 1)
        {
            return "Volunteer effected";
        }
        return null;
    }

    @Override
    public String insertVolunteerInProject(int volunteerId, String p_name) {
   String sql="insert into volunteerProject values(?,?) ";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(volunteerId);
        ob.add(p_name);
        
        ArrayList<String>type=new ArrayList<>();
        type.add("int");
        type.add("String");
        
          int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return null;
        }
        else if(effected >= 1)
        {
           return "Volunteer added";
        }
        return null;
    
    }

    @Override
    public String deleteVolunteerFromProject(int volunteerId, String p_name) {
        String sql = "delete from volunteerProject where volunteerId = ? AND p_name = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(volunteerId);
        ob.add(p_name);
        
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        type.add("String");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return "Volunteer could not be deleted";
        }
        else if(effected >= 1)
        {
            return "Volunteer Deleted";
        }
        else{
            
            System.out.println("Exception");
            return "Exception";
        } 
    }


    @Override
    public String insertDonorInProject(int donorId, String p_name) {
       String sql="insert into donorProject values(?,?) ";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(donorId);
        ob.add(p_name);
        
        ArrayList<String>type=new ArrayList<>();
        type.add("int");
        type.add("String");
        
          int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return null;
        }
        else if(effected >= 1)
        {
           return "Donor added";
        }
        return null;
    }

    @Override
    public String deleteDonorFromProject(int donorId, String p_name) {
        String sql = "delete from donorProject where donorId = ? AND p_name = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(donorId);
        ob.add(p_name);
        
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        type.add("String");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return "Donor could not be deleted";
        }
        else if(effected >= 1)
        {
            return "Donor Deleted";
        }
        else{
            
            System.out.println("Exception");
            return "Exception";
        } 
}


    @Override
    public String insertBeneficiaryInProject(int beneficiaryId, String p_name) {
       String sql="insert into beneficiaryProject values(?,?) ";
        ArrayList<Object>ob=new ArrayList<>();
        ob.add(beneficiaryId);
        ob.add(p_name);
        
        ArrayList<String>type=new ArrayList<>();
        type.add("int");
        type.add("String");
        
          int effected=0;
          try{
            effected = DataAccessHelper.execute(sql,ob , type);
           
        }
        catch(Exception e)
        {
            effected = -1;
        }
        if(effected == 0)
        {
            return null;
        }
        else if(effected >= 1)
        {
           return "Beneficiary added";
        }
        return null;
    }

    @Override
    public String deleteBeneficiaryFromProject(int beneficiaryId, String p_name) {
        String sql = "delete from beneficiaryProject where beneficiaryId = ? AND p_name = ?";
        ArrayList<Object> ob = new ArrayList<>();
        ob.add(beneficiaryId);
        ob.add(p_name);
        
        ArrayList<String> type = new ArrayList<>();
        type.add("int");
        type.add("String");
        int effected = DataAccessHelper.execute(sql,ob , type);
        if(effected == 0)
        {
            return "Beneficiary could not be deleted";
        }
        else if(effected >= 1)
        {
            return "Beneficiary Deleted";
        }
        else{
            
            System.out.println("Exception");
            return "Exception";
        } 
    }
    @Override    
    public String getProjectAdminName(String projectName){
        String sql = "select [adminName] from projects where projectName = '"+ projectName+"'";
        ResultSet rs = null;
        try {
            rs = DataAccessHelper.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Null output");
        }
        catch(NullPointerException e){
            System.out.println("Null output");
            
        }
        ArrayList<Projects> projects = new ArrayList<>();
        try {
            while(rs.next())
            {
                
                String adminUserName = rs.getString(1);
                return adminUserName;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DonationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NullPointerException e){
            System.out.println("No Records present");
        }
        
        return null;
    }

   
    
}
