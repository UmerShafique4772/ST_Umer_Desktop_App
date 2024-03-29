/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approject1.View;

import approject1.Controller.Admin;
import approject1.Controller.Beneficiary;
import approject1.Controller.Donor;
import approject1.Controller.Projects;
import approject1.Controller.Volunteer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Farwa Malik
 */
public class ProjectInfo extends javax.swing.JFrame {

    /**
     * Creates new form ProjectInfo
     */
    public ProjectInfo() {
        initComponents();
    }

    Projects proj;
    Admin admin;
    Volunteer volun;
    Beneficiary ben;
    Donor don;
    public ProjectInfo(Projects p) {
        
        proj = p;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ArrayList<Admin> admins = new ArrayList<>();
        admins = proj.loadTeam();
        Object[][] objA = new Object[admins.size()][8];
        int iA=0;
        while(iA < admins.size()){
            objA[iA][0] = admins.get(iA).getUserName();
            objA[iA][1] = admins.get(iA).getName();
            objA[iA][2] = admins.get(iA).getpassword();
            objA[iA][3] = admins.get(iA).getDateOfBirth();

            objA[iA][4] = admins.get(iA).getJoiningDate();

            objA[iA][5] = admins.get(iA).getCity();
            objA[iA][6] = admins.get(iA).getPhoneNo();
            objA[iA][7] = admins.get(iA).getEmail();

            iA++;
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            objA,
            new String [] {
                "Username","Name","Password","Date of Birth","Joining Date","City","Phone no.","Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Add New Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete Admin");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jButton1)
                .addGap(47, 47, 47)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Admin", jPanel2);

        ArrayList<Volunteer> volunteers = new ArrayList<>();
        volunteers = proj.loadVolunteers();
        Object[][] objV = new Object[volunteers.size()][7];
        int iV =0;
        while(iV < volunteers.size()){
            objV[iV][0] = volunteers.get(iV).getVolunteerId();
            objV[iV][1] = volunteers.get(iV).getName();
            objV[iV][2] = volunteers.get(iV).getDateOfBirth();
            objV[iV][3] = volunteers.get(iV).getCity();
            objV[iV][4] = volunteers.get(iV).getCountry();
            objV[iV][5] = volunteers.get(iV).getPhoneNo();
            objV[iV][6] = volunteers.get(iV).getEmail();

            iV++;
        }
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            objV,
            new String [] {
                "Name","Serial Number" ,"Dateo Of Birth" ,"City","Country","Phone No","Email"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("Add New Volunteers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setText("Delete Volunteers");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton8))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Volunteers", jPanel3);

        ArrayList<Beneficiary> beneficiary = new ArrayList<>();
        beneficiary = proj.loadBeneficiaries();
        Object[][] objB = new Object[beneficiary.size()][7];
        int iB =0;
        while(iB < beneficiary.size()){
            objB[iB][0] = beneficiary.get(iB).getBeneficiariesId();
            objB[iB][1] = beneficiary.get(iB).getName();
            objB[iB][2] = beneficiary.get(iB).getDateOfBirth();
            objB[iB][3] = beneficiary.get(iB).getCity();
            objB[iB][4] = beneficiary.get(iB).getCountry();
            objB[iB][5] = beneficiary.get(iB).getPhoneNo();
            objB[iB][6] = beneficiary.get(iB).getEmail();

            iB++;
        }
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            objB,
            new String [] {
                "Name","Serial Number" ,"Dateo Of Birth" ,"City","Country","Phone No","Email"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton3.setText("Add New Beneficiary");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete Beneficiary");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Beneficiaries", jPanel4);

        ArrayList<Donor> donors = new ArrayList<>();
        donors = proj.loadDonor();
        Object[][] objD = new Object[donors.size()][8];
        int iD =0;
        while(iD < donors.size()){
            objD[iD][0] = donors.get(iD).getDonorId();
            objD[iD][1] = donors.get(iD).getName();
            objD[iD][2] = donors.get(iD).getDateOfBirth();
            objD[iD][3] = donors.get(iD).getCity();
            objD[iD][4] = donors.get(iD).getCountry();
            objD[iD][5] = donors.get(iD).getPhoneNo();
            objD[iD][6] = donors.get(iD).getEmail();

            iD++;
        }
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            objD,
            new String [] {
                "Name","Serial Number" ,"Dateo Of Birth" ,"City","Country","Phone No","Email"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jButton9.setText("Add New Donor");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Delete Donor");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jButton9)
                .addGap(54, 54, 54)
                .addComponent(jButton10)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Donors", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AddAdminToProject(proj).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(admin!=null){
            System.out.println(admin.getUserName());
            proj.DeleteProjectTeam(admin.getUserName());

            this.dispose();
            new ProjectInfo(proj).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "kindly select an admin");

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new AddVolunteerToProject(proj).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(volun!=null){
            System.out.println(volun.getVolunteerId());
            proj.DeleteVolunteer(volun.getVolunteerId());

            this.dispose();
            new ProjectInfo(proj).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "kindly select a volunteer");

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new AddBeneficiaryToProject(proj).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new AddDonorToProject(proj).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(don!=null){
            proj.DeleteDonor(don.getDonorId());
            this.setVisible(false);
            new ProjectInfo(proj).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "kindly select a donor");

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String userName=  jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        String name = jTable1.getValueAt(jTable1.getSelectedRow(),1).toString();
        String Password = jTable1.getValueAt(jTable1.getSelectedRow(),2).toString();
        String dateOfBirth =  jTable1.getValueAt(jTable1.getSelectedRow(),3).toString();
        java.sql.Date date = java.sql.Date.valueOf(dateOfBirth);
        String joiningDate =  jTable1.getValueAt(jTable1.getSelectedRow(),4).toString();
        java.sql.Date date1 = java.sql.Date.valueOf(joiningDate);
        String City = jTable1.getValueAt(jTable1.getSelectedRow(),5).toString();
        String Phone = jTable1.getValueAt(jTable1.getSelectedRow(),6).toString();
        String email = jTable1.getValueAt(jTable1.getSelectedRow(),7).toString();
        admin = new Admin(userName,name,Password,date1,date,City,Phone,email);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int id=  (int)jTable2.getValueAt(jTable2.getSelectedRow(),0);
        String name = jTable2.getValueAt(jTable2.getSelectedRow(),1).toString();
        String dateOfBirth =  jTable2.getValueAt(jTable2.getSelectedRow(),2).toString();
        java.sql.Date date = java.sql.Date.valueOf(dateOfBirth);
        String City = jTable2.getValueAt(jTable2.getSelectedRow(),3).toString();
        String Country = jTable2.getValueAt(jTable2.getSelectedRow(),4).toString();
        String Phone = jTable2.getValueAt(jTable2.getSelectedRow(),5).toString();
        String email = jTable2.getValueAt(jTable2.getSelectedRow(),6).toString();
        volun = new Volunteer(id,name,date,City,Country,Phone,email);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         if(ben!=null){
            System.out.println(ben.getBeneficiariesId());
            proj.DeleteBeneficiary(ben.getBeneficiariesId());

            this.dispose();
            new ProjectInfo(proj).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "kindly select a beneficiary");

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int Id =  (int) jTable3.getValueAt(jTable3.getSelectedRow(),0);
        String name = jTable3.getValueAt(jTable3.getSelectedRow(),1).toString();
        String dateOfBirth =  jTable3.getValueAt(jTable3.getSelectedRow(),2).toString();
        java.sql.Date date = java.sql.Date.valueOf(dateOfBirth);
        String City = jTable3.getValueAt(jTable3.getSelectedRow(),3).toString();
        String Country = jTable3.getValueAt(jTable3.getSelectedRow(),4).toString();
        String Phone = jTable3.getValueAt(jTable3.getSelectedRow(),5).toString();
        String email = jTable3.getValueAt(jTable3.getSelectedRow(),6).toString();
        ben = new Beneficiary(Id,name,date,City,Country,Phone,email);
    }//GEN-LAST:event_jTable3MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        // TODO add your handling code here:
         int Id =  (int) jTable5.getValueAt(jTable5.getSelectedRow(),0);
        String name = jTable5.getValueAt(jTable5.getSelectedRow(),1).toString();
        String dateOfBirth =  jTable5.getValueAt(jTable5.getSelectedRow(),2).toString();
        java.sql.Date date = java.sql.Date.valueOf(dateOfBirth);
        String City = jTable5.getValueAt(jTable5.getSelectedRow(),3).toString();
        String Country = jTable5.getValueAt(jTable5.getSelectedRow(),4).toString();
        String Phone = jTable5.getValueAt(jTable5.getSelectedRow(),5).toString();
        String email = jTable5.getValueAt(jTable5.getSelectedRow(),6).toString();
        don = new Donor(Id,name,date,City,Country,Phone,email);
    }//GEN-LAST:event_jTable5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    // End of variables declaration//GEN-END:variables
}
