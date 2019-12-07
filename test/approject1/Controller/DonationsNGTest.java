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
public class DonationsNGTest {
    private static Donations test;
    public DonationsNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Date date = new Date(2,2,2);
        test=new Donations(1,"type",2,3,date,"project");
    }

    
    @Test
    public void testGetDonorId() {
        System.out.println("getDonorId");
        Assert.assertTrue(test.getDonorId()==1);
        Assert.assertFalse(test.getDonorId()==9);
        
    }

    @Test
    public void testGetDonationId() {
        System.out.println("getDonationId");
        Assert.assertTrue(test.getDonationId()==2);
        Assert.assertFalse(test.getDonationId()==9);
    }

    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Assert.assertTrue(test.getAmount()==3);
        Assert.assertFalse(test.getAmount()==9);
    }

    @Test
    public void testGetDonationType() {
        System.out.println("getDonationType");
        Assert.assertTrue(test.getDonationType().equals("type"));
        Assert.assertFalse(test.getDonationType().equals("fail"));
    }

    @Test
    public void testGetProjectName() {
        System.out.println("getProjectName");
        Assert.assertTrue(test.getProjectName().equals("project"));
        Assert.assertFalse(test.getProjectName().equals("fail"));
    }

    @Test
    public void testGetDonationDate() {
        System.out.println("getDonationDate");
        Date date2 = new Date(2,2,2);
        Date date3 = new Date(1,1,1);
        Assert.assertTrue(test.getDonationDate().equals(date2));
        Assert.assertFalse(test.getDonationDate().equals(date3));
    }
    
}
