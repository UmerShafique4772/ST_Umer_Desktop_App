/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approject1.Controller;

import java.sql.Date;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hassan X-BOT
 */
public class DonorNGTest {
    
    private static Donor test;
    
    public DonorNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Date date = new Date(2,2,2);
        test=new Donor(1,"umer",date,"lahore", "pakistan","12345","email@gmail.com");
    }
    
    @Test
    public void testGetDonorId() {
        System.out.println("getDonorId");
        Assert.assertTrue(test.getDonorId()==1);
        Assert.assertFalse(test.getDonorId()==9);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Assert.assertTrue(test.getName().equals("umer"));
        Assert.assertFalse(test.getName().equals("fail"));
    }

    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Assert.assertTrue(test.getCountry().equals("pakistan"));
        Assert.assertFalse(test.getCountry().equals("fail"));
    }

    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Assert.assertTrue(test.getCity().equals("lahore"));
        Assert.assertFalse(test.getCity().equals("fail"));
    }

    @Test
    public void testGetPhoneNo() {
        System.out.println("getPhoneNo");
        Assert.assertTrue(test.getPhoneNo().equals("12345"));
        Assert.assertFalse(test.getPhoneNo().equals("fail"));
    }

    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Assert.assertTrue(test.getEmail().equals("email@gmail.com"));
        Assert.assertFalse(test.getEmail().equals("fail"));
    }

    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Date date2 = new Date(2,2,2);
        Date date3 = new Date(1,1,1);
        Assert.assertTrue(test.getDateOfBirth().equals(date2));
        Assert.assertFalse(test.getDateOfBirth().equals(date3));
    }
    
}
