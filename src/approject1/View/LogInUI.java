/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package approject1.View;

import approject1.Controller.Admin;
import approject1.Controller.Organization;
import javax.swing.JOptionPane;

/**
 *
 * @author Farwa Malik
 */
public class LogInUI extends javax.swing.JFrame {
    Organization org;
    String d[]={"Select Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};        
    String d1[]={"Select Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};        
    String d2[]={"Select Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"};        
    String d3[]={"Select Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};        

    public LogInUI() {
        org = new Organization();
        org = org.getInstance();

            setVisible(true);
        if(org == null){
            JOptionPane.showMessageDialog(this, "Organization does not exist");
        }
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<String>();
        jComboBox8 = new javax.swing.JComboBox<String>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<String>();
        jComboBox11 = new javax.swing.JComboBox<String>();
        jComboBox12 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Log-In", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLabel1.setText("UserName:");

        jLabel2.setText("Password:");

        jButton1.setText("LogIn As Organization");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("LogIn As Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(221, 221, 221))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Login", jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registration", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        jLabel6.setText("User Name:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Joining Date:");

        jLabel5.setText("Password:");

        jButton3.setText("Sign Up");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Date Of Birth:");

        jLabel8.setText("City:");

        jLabel9.setText("Phone No.");

        jLabel10.setText("Email:");

        String y[]={"Select Year","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029"};
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(y));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        String m[]={"Select Month","01","02","03","04","05","06","07","08","09","10","11","12"};
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(m));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(d));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        String y2[]={"Select Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000"};
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(y2));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        String m2[]={"Select Month","01","02","03","04","05","06","07","08","09","10","11","12"};
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(m));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        String d[]={"Select Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String d1[]={"Select Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        String d2[]={"Select Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"};
        String d3[]={"Select Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(d));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField7)
                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("Register", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if( jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter the username");
        }
        else if( jPasswordField1.getPassword().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter thepassword");
        }
        else{
            String username= jTextField1.getText();
            char[] pass = jPasswordField1.getPassword();
            String password = String.valueOf(pass);
            org = org.loginOrg(username,password);
            MainUIOrg mainUIOrg = new MainUIOrg(org);
            //mainUIOrg.setVisible(true);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if( jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter the username");
        }
        else if( jPasswordField1.getPassword().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter thepassword");
        }
        else{
            String username= jTextField1.getText();
            char[] pass = jPasswordField1.getPassword();
            String password = String.valueOf(pass);
            Admin a = org.loginAdmin(username,password);
            new MainUI(org,a);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if( jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter the name");
        }
        else if( jTextField4.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter username");
        }
        else if( jTextField4.getText().length()>=10){
            JOptionPane.showMessageDialog(this, "Lenght of username should be less than 10 letters");
        }
        else if(jComboBox7.getSelectedItem().equals("Select Year")){
            JOptionPane.showMessageDialog(this, "Kindly select the joining year");
        }
        else if(jComboBox8.getSelectedItem().equals("Select Month")){
            JOptionPane.showMessageDialog(this, "Kindly select the joining month");
        }
        else if(jComboBox9.getSelectedItem().equals("Select Date")){
            JOptionPane.showMessageDialog(this, "Kindly select the joining date");
        }
        else if(jComboBox10.getSelectedItem().equals("Select Year")){
            JOptionPane.showMessageDialog(this, "Kindly select the year  of birth");
        }
        else if(jComboBox11.getSelectedItem().equals("Select Month")){
            JOptionPane.showMessageDialog(this, "Kindly select the month  of birth");
        }
        else if(jComboBox12.getSelectedItem().equals("Select Date")){
            JOptionPane.showMessageDialog(this, "Kindly select the date of birth");
        }
        else if( jPasswordField2.getPassword().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter the password");
        }
        else if( jTextField5.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter the city");
        }
        else if( jTextField6.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter the phone no.");
        }
        else if( jTextField7.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Kindly enter the email");
        }
        else{
            String name,username,password,joiningDateString ,dateOfBirthString,city,email,phoneNo;
            char[] pass = jPasswordField2.getPassword();
            password = String.valueOf(pass);
            name = jTextField2.getText();
            username = jTextField4.getText();
            city = jTextField5.getText();
            phoneNo = jTextField6.getText();
            email = jTextField7.getText();
            String y1,y2,m1,m2,d21,d22;
            y1 = jComboBox7.getSelectedItem().toString();
            y2 = jComboBox10.getSelectedItem().toString();
            m1 = jComboBox8.getSelectedItem().toString();
            m2 = jComboBox11.getSelectedItem().toString();
            d21 = jComboBox9.getSelectedItem().toString();
            d22 = jComboBox12.getSelectedItem().toString();
            String totalDate1 = y1+ "-" + m1 + "-" + d21;

            java.sql.Date joiningDate = java.sql.Date.valueOf(totalDate1);
            String totalDate2 = y2+ "-" + m2 + "-" + d22;

            java.sql.Date dateOfBirth = java.sql.Date.valueOf(totalDate2);
            Admin a = new Admin(username,name,password,joiningDate,dateOfBirth,city,phoneNo,email);
            org.InsertAdmin(a);

            new MainUI(org,a);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:

        if(!(jComboBox7.getSelectedItem().equals("Select Year"))&&jComboBox8.getSelectedItem().equals("02"))
        {
            boolean leap = false;
            int year = Integer.parseInt(jComboBox7.getSelectedItem().toString());
            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    // year is divisible by 400, hence the year is a leap year
                    if ( year % 400 == 0)
                    leap = true;
                    else
                    leap = false;
                }
                else
                leap = true;
            }
            else
            leap = false;
            if(leap)
            {
                jComboBox9.removeAllItems();
                for(String str : d2) {
                    jComboBox9.addItem(str);
                }
            }
            else{
                jComboBox9.removeAllItems();
                for(String str : d3) {
                    jComboBox9.addItem(str);
                }

            }
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        if(jComboBox8.getSelectedItem().equals("01") || jComboBox8.getSelectedItem().equals("03") || jComboBox8.getSelectedItem().equals("05") || jComboBox8.getSelectedItem().equals("08") || jComboBox8.getSelectedItem().equals("10")|| jComboBox8.getSelectedItem().equals("12"))
        {
            jComboBox9.removeAllItems();
            for(String str : d) {
                jComboBox9.addItem(str);
            }
        }
        else if(jComboBox8.getSelectedItem().equals("04")|| jComboBox8.getSelectedItem().equals("06")|| jComboBox8.getSelectedItem().equals("09")|| jComboBox8.getSelectedItem().equals("11"))
        {
            jComboBox9.removeAllItems();
            for(String str : d1) {
                jComboBox9.addItem(str);
            }

        }
        else if(jComboBox8.getSelectedItem().equals("02") && !(jComboBox7.getSelectedItem().equals("Select Year")))
        {
            boolean leap = false;
            int year = Integer.parseInt(jComboBox7.getSelectedItem().toString());
            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    // year is divisible by 400, hence the year is a leap year
                    if ( year % 400 == 0)
                    leap = true;
                    else
                    leap = false;
                }
                else
                leap = true;
            }
            else
            leap = false;
            if(leap)
            {
                jComboBox9.removeAllItems();
                for(String str : d2) {
                    jComboBox9.addItem(str);
                }
            }
            else{
                jComboBox9.removeAllItems();
                for(String str : d3) {
                    jComboBox9.addItem(str);
                }

            }
        }
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed

    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        if(!(jComboBox10.getSelectedItem().equals("Select Year"))&&jComboBox11.getSelectedItem().equals("02"))
        {
            boolean leap = false;
            int year = Integer.parseInt(jComboBox10.getSelectedItem().toString());
            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    // year is divisible by 400, hence the year is a leap year
                    if ( year % 400 == 0)
                    leap = true;
                    else
                    leap = false;
                }
                else
                leap = true;
            }
            else
            leap = false;
            if(leap)
            {
                jComboBox12.removeAllItems();
                for(String str : d2) {
                    jComboBox12.addItem(str);
                }
            }
            else{
                jComboBox12.removeAllItems();
                for(String str : d3) {
                    jComboBox12.addItem(str);
                }

            }
        }
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        if(jComboBox11.getSelectedItem().equals("01") || jComboBox11.getSelectedItem().equals("03") || jComboBox11.getSelectedItem().equals("05") || jComboBox11.getSelectedItem().equals("08") || jComboBox11.getSelectedItem().equals("10")|| jComboBox11.getSelectedItem().equals("12"))
        {
            jComboBox12.removeAllItems();
            for(String str : d) {
                jComboBox12.addItem(str);
            }
        }
        else if(jComboBox11.getSelectedItem().equals("04")|| jComboBox11.getSelectedItem().equals("06")|| jComboBox11.getSelectedItem().equals("09")|| jComboBox11.getSelectedItem().equals("11"))
        {
            jComboBox12.removeAllItems();
            for(String str : d1) {
                jComboBox12.addItem(str);
            }

        }
        else if(jComboBox11.getSelectedItem().equals("02") && !(jComboBox10.getSelectedItem().equals("Select Year")))
        {
            boolean leap = false;
            int year = Integer.parseInt(jComboBox10.getSelectedItem().toString());
            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    // year is divisible by 400, hence the year is a leap year
                    if ( year % 400 == 0)
                    leap = true;
                    else
                    leap = false;
                }
                else
                leap = true;
            }
            else
            leap = false;
            if(leap)
            {
                jComboBox12.removeAllItems();
                for(String str : d2) {
                    jComboBox12.addItem(str);
                }
            }
            else{
                jComboBox12.removeAllItems();
                for(String str : d3) {
                    jComboBox12.addItem(str);
                }

            }
        }
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

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
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}