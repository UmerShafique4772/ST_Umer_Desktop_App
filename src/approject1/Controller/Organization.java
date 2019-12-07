/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approject1.Controller;

import approject1.Model.DonationDAO;
import approject1.Model.IDonationDAO;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Farwa Malik
 */
public class Organization {
    String username,name,department ,password,updateOrGeneratedBy;
	Date foundingDate;
	Time updateTime;
        ArrayList<Projects> projects;
        ArrayList<Admin> admins;
        ArrayList<Donations> donations;
        ArrayList<Donor> donors;
        ArrayList<Volunteer> volun;
        ArrayList<Beneficiary> ben;
        IDonationDAO dao;
        static Organization org; 
        public Organization getInstance(){
            if(org == null){
                dao = new DonationDAO();
                org = dao.showOrganization();
                projects = loadProjects();
                donations = loadDonations();
                admins = loadAdmin();
                if(projects == null)
                    projects = new ArrayList<>();
                if(admins == null)
                    admins = new ArrayList<>();
                if(donations == null)
                    donations = new ArrayList<>();
                if(donors == null)
                    donors = new ArrayList<>();
                
            }
            return org;
        }
        public Organization(){
            
        }
        public Organization(String username,String name,String department ,String password,String updateOrGeneratedBy,Date foundingDate,Time updateTime){
            this.username = username;
            this.password = password;
            this.name = name;
            this.foundingDate = foundingDate;
            this.department = department;
            this.updateTime = updateTime;
            this.updateOrGeneratedBy = updateOrGeneratedBy;
            dao = new DonationDAO();
            projects = loadProjects();
            donations = loadDonations();
            admins = loadAdmin();
            volun = loadVolunteers();
            ben = loadBeneficiaries();
            donors = loadDonors();
            if(projects == null)
                projects = new ArrayList<>();
            if(admins == null)
                admins = new ArrayList<>();
            if(donations == null)
                donations = new ArrayList<>();
            if(donors == null)
                donors = new ArrayList<>();
            if(volun == null)
                volun = new ArrayList<>();
            if(ben == null)
                ben = new ArrayList<>();
            if(donors==null)
                donors = new ArrayList<>();

        }
        public String update(Organization o){
            return dao.updateOrganization(o.getUserName(), o.getName(), o.getFoundingDate(), o.getDepartment(), o.getPassword(),o.getUserName());
        }
        public String getUserName(){
            return this.username;
        } 
        public String getName(){
            return this.name;
        } 
        public String getPassword(){
            return this.password;
        } 
        public String getDepartment(){
            return this.department;
        } 
        public String getUpdatedOrGeneratedBy(){
            return this.updateOrGeneratedBy;
        } 
        public Time getUpdateTime(){
            return this.updateTime;
        } 
        public Date getFoundingDate(){
            return this.foundingDate;
        } 
        public boolean InsertProject(Projects p){
            boolean check = true;
            for(int i =0;i < projects.size();i++)
            {
                if(projects.get(i).getName().equals(p.getName()))
                    check = false;
            }
            if(!check)
            {
                return false;
            }
            else{
                projects.add(p);
                saveProject(p);
                return true;
            }
        }
        public boolean UpdateProject(Projects p,String oldProjectName){
            boolean check = false;
            int found = -1;
            projects = loadProjects();
            for(int i =0;i < projects.size();i++)
            {
                if((projects.get(i).getName().equals(oldProjectName)))
                {
                    check = true;
                    found = i;
                }
            }
            if(check && found!= -1 )
            {
                String s = dao.updateProject(p.getName(),p.getStartingDate(), p.getAdminName(),oldProjectName);
                if(s.equals("Exception"))
                {
                    return false;
                }else{
                    projects.remove(found);
                    projects.add(p);
                    return true;    
                }
            }
            else{
                return false;
            }
        }
        public boolean DeleteProject(String projectName){
            for(int i =0; i < projects.size();i++){
                if((projects.get(i).getName().equals(projectName)))
                {                    
                    projects.remove(i);
                    dao.deleteProject(projectName);
                    return true;
                }
            }
            return false;

        }
        public boolean InsertDonation(Donations d){
            boolean check = false;
            int found = -1;
            donations = loadDonations();
            for(int i =0;i < donations.size();i++)
            {
                System.out.println(donations.get(i).getDonationId() + "    "+d.getDonationId());
                if(donations.get(i).getDonationId() != d.getDonationId())
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
            for(int i =0; i < donors.size();i++){
                if(donors.get(i).getDonorId() == id)
                {                    
                    donors.remove(i);
                    dao.deleteDonor(id);
                    return true;
                }
            }
            return false;
        }
        public boolean InsertAdmin(Admin a){
            boolean check = true;
            for(int i =0;i < admins.size();i++)
            {
                if(admins.get(i).getUserName().equals(a.getUserName()))
                    check = false;
            }
            if(!check)
            {
                return false;
            }
            else{
                admins.add(a);
                saveAdmin(a);
                return true;
            }
        }
        public boolean DeleteAdmin(String username){
            for(int i =0; i < admins.size();i++){
                if(admins.get(i).getUserName().equals(username))
                {                    
                    admins.remove(i);
                    dao.deleteAdmin(username);
                    return true;
                }
            }
            return false;
        }
        public boolean updateAdmin(Admin a,String username){
            boolean check = false;
            int found = -1;
            admins = loadAdmin();
            for(int i =0;i < admins.size();i++)
            {
                if((admins.get(i).getUserName().equals(username)))
                {
                    check = true;
                    found = i;
                }
            }
            if(check && found!= -1 )
            {
                boolean s = dao.updateAdmin(a.getUserName(), a.getName(), a.getpassword(), a.joiningDate, a.dateOfBirth, a.getCity(), a.getPhoneNo(),a.getEmail(), username);
                if(s == true)
                {
                    admins.remove(found);
                    admins.add(a);
                    return true;
                }
                return false;
            }
            else{
                return false;
            }
        }
        public boolean InsertVolunteer(Volunteer v) {
            boolean check = true;
            //volun = loadVolunteers();
            for(int i =0;i < volun.size();i++)
            {
                if(volun.get(i).getVolunteerId() == v.getVolunteerId())
                    check = false;
            }
            if(!check)
            {
                return false;
            }
            else{
                volun.add(v);
                saveVolunteer(v);
                return true;
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public boolean DeleteVolunteer(int VolunteerId){
            
            for(int i =0; i < volun.size();i++){
                if(volun.get(i).getVolunteerId()==VolunteerId)
                {                    
                    volun.remove(i);
                    dao.deleteVolunteer(VolunteerId);
                    return true;
                }
            }
            return false;
        }
        public boolean InsertBeneficiary(Beneficiary b) {
            boolean check = true;
            //volun = loadVolunteers();
            for(int i =0;i < ben.size();i++)
            {
                if(ben.get(i).getBeneficiariesId()== b.getBeneficiariesId())
                    check = false;
            }
            if(!check)
            {
                return false;
            }
            else{
                ben.add(b);
                saveBeneficiary(b);
                return true;
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public boolean DeleteBeneficiary(int Id){
            
            for(int i =0; i < ben.size();i++){
                if(ben.get(i).getBeneficiariesId()==Id)
                {                    
                    ben.remove(i);
                    dao.deleteBeneficiary(Id);
                    return true;
                }
            }
            return false;
        }
        
        public String signUp(){
            Organization o = this;
            String s = dao.configureOrganization(o.getUserName(),o.getName(),o.getFoundingDate(),o.getDepartment(),o.getPassword());
            return s;
        }
        public Admin showAdmin(String s){    //for login
            return dao.showProfile(s);
        }
        
        public Organization showOrganization(){ //for login
            return this;
        }
        public ArrayList<Projects> loadProjects(){
            return dao.showProjects();
        }
        public ArrayList<Admin> loadAdmin(){
            return dao.showAdmins();
        }
        public ArrayList<Donor> loadDonor(){
            return dao.showDonors();
        }
        public ArrayList<Volunteer> loadVolunteers(){
            return dao.showVolunteers();
        }
        public ArrayList<Beneficiary> loadBeneficiaries(){
            return dao.showBeneficiaries();
        }
        public ArrayList<Donor> loadDonors(){
            return dao.showDonors();
        } 
        public ArrayList<Donations> loadDonations(){
            return dao.showAllDonations();
        }
        public void saveAdmin(Admin a){
            dao.signUpAdmin(a.getUserName(), a.getName(), a.getpassword(), a.getJoiningDate(), a.getDateOfBirth(),a.getCity(),a.getPhoneNo(),a.getEmail());        }
        public void saveDonor(Donor d){
            dao.insertDonor(d.getDonorId(), d.getName(), d.getDateOfBirth(), d.getCity(),d.getCountry(), d.getPhoneNo(), d.getEmail());
        }
        public void saveDonation(Donations d){
            dao.insertDonation(d.getDonorId(), d.getDonationId(), d.getDonationType(), d.getAmount(), d.getProjectName(),d.getDonationDate());
        }
        public void saveProject(Projects p){
            dao.insertProject(p.getName(), p.getStartingDate(), p.getAdminName());
        }
        public void saveVolunteer(Volunteer v){
            dao.insertVolunteer(v.getVolunteerId(), v.getName(), v.getDateOfBirth(), v.getCity(), v.getCountry(), v.getPhoneNo(), v.getEmail());
        }
        
        public void saveBeneficiary(Beneficiary a){
            dao.insertBeneficiary(a.getBeneficiariesId(), a.getName(), a.getDateOfBirth(), a.getCity(), a.getCountry(),a.getPhoneNo(),a.getEmail());        }
        

    public Organization loginOrg(String uname,String pass) {
        org = dao.loginOrganization(uname, pass);
        return org;
        
    }

    public Admin loginAdmin(String uname, String pass) {
        return dao.loginAdmin(uname, pass);
    }

    public Donor getDonor(int s) {
        donors = loadDonor();
        for(int i =0;i<donors.size();i++){
            if(s == donors.get(i).getDonorId()){
                return donors.get(i);
            }

        }
        return null;
    }

    public StringBuffer update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Volunteer getVolunteer(int parseInt) {
        volun = loadVolunteers();
        for(int i =0;i<volun.size();i++){
            if(parseInt == volun.get(i).getVolunteerId()){
                return volun.get(i);
            }

        }
        return null;
    }



    public Beneficiary getBeneficiary(int parseInt) {
        ben = loadBeneficiaries();
        for(int i =0;i<ben.size();i++){
            if(parseInt == ben.get(i).getBeneficiariesId()){
                return ben.get(i);
            }

        }
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


}
