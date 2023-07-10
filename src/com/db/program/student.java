package com.db.program;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class student extends javax.swing.JFrame {

    private void blank_form() {
        id.setEditable(true);
        id.setText(null);
        name.setText(null);
        age.setText(null);
        date.setSelectedIndex(0);
        month.setSelectedIndex(0);
        year.setSelectedIndex(0);
        male.setSelected(false);
        female.setSelected(false);
        address.setText(null);
        email.setText(null);
        phone.setText(null);
        islam.setSelected(false);
        christian.setSelected(false);
        catholic.setSelected(false);
        buddha.setSelected(false);
        hindu.setSelected(false);
        konghucu.setSelected(false);
        sport.setSelected(false);
        traveling.setSelected(false);
        singing.setSelected(false);
        major.setSelectedIndex(0);
        batch.setSelectedIndex(0);
    }

    private void ShowData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("SID");
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Date_of_Birth");
        model.addColumn("Gender");
        model.addColumn("Address");
        model.addColumn("Email");
        model.addColumn("Phone");
        model.addColumn("Religion");
        model.addColumn("Hobby");
        model.addColumn("Major");
        model.addColumn("Batch");

        try {
            int no = 1;
            String sql = "SELECT * FROM student";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4), res.getString(5), res.getString(6),
                    res.getString(7), res.getString(8), res.getString(9), res.getString(10),
                    res.getString(11), res.getString(12)});
            }
            table_student.setModel(model);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public student() {
        initComponents();
        ShowData();
        blank_form();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlabel7 = new javax.swing.JLabel();
        reli = new javax.swing.JLabel();
        hobby = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        date = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        address = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        islam = new javax.swing.JCheckBox();
        christian = new javax.swing.JCheckBox();
        catholic = new javax.swing.JCheckBox();
        buddha = new javax.swing.JCheckBox();
        hindu = new javax.swing.JCheckBox();
        konghucu = new javax.swing.JCheckBox();
        sport = new javax.swing.JCheckBox();
        traveling = new javax.swing.JCheckBox();
        singing = new javax.swing.JCheckBox();
        major = new javax.swing.JComboBox<>();
        batch = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_student = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Data Application");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("STUDENT DATA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Age");

        dob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dob.setText("Date of Birth");

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jlabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel7.setText("Phone");

        reli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reli.setText("Religion");

        hobby.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hobby.setText("Hobby");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Major");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Batch");

        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date :", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        month.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month :", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year :", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        male.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        male.setText("Male");

        female.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        islam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        islam.setText("Islam");

        christian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        christian.setText("Christian");

        catholic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        catholic.setText("Catholic");

        buddha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buddha.setText("Buddha");

        hindu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hindu.setText("Hindu");

        konghucu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        konghucu.setText("Konghucu");

        sport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sport.setText("Sport");

        traveling.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        traveling.setText("Traveling");
        traveling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelingActionPerformed(evt);
            }
        });

        singing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        singing.setText("Singing");

        major.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        major.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Major :", "Information Technology", "Information System", " " }));

        batch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        batch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batch :", "2018", "2019", "2020", "2021", "2022" }));

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        table_student.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_studentMouseClicked(evt);
            }
        });
        table_student.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                table_studentComponentMoved(evt);
            }
        });
        jScrollPane1.setViewportView(table_student);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(dob)
                            .addComponent(gender)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jlabel7)
                            .addComponent(reli)
                            .addComponent(hobby)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(add))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sport)
                                        .addGap(18, 18, 18)
                                        .addComponent(traveling)
                                        .addGap(18, 18, 18)
                                        .addComponent(singing))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(male)
                                        .addGap(18, 18, 18)
                                        .addComponent(female))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(jLabel1))
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(edit)
                                                .addGap(56, 56, 56)
                                                .addComponent(delete)
                                                .addGap(54, 54, 54)
                                                .addComponent(cancel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(islam)
                                                .addGap(18, 18, 18)
                                                .addComponent(christian)
                                                .addGap(18, 18, 18)
                                                .addComponent(catholic)
                                                .addGap(18, 18, 18)
                                                .addComponent(buddha)
                                                .addGap(18, 18, 18)
                                                .addComponent(hindu)))
                                        .addGap(18, 18, 18)
                                        .addComponent(konghucu))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(save)
                                .addGap(420, 420, 420)
                                .addComponent(exit)))
                        .addGap(0, 556, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel7)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reli)
                    .addComponent(islam)
                    .addComponent(christian)
                    .addComponent(catholic)
                    .addComponent(buddha)
                    .addComponent(hindu)
                    .addComponent(konghucu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hobby)
                    .addComponent(sport)
                    .addComponent(traveling)
                    .addComponent(singing))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(save)
                    .addComponent(edit)
                    .addComponent(delete)
                    .addComponent(cancel)
                    .addComponent(exit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void travelingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_travelingActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        blank_form();
    }//GEN-LAST:event_addActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String DOB = date.getSelectedItem().toString() +" " +month.getSelectedItem() +" "+ year.getSelectedItem();
        //define gender
        String gender;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else {
            gender = "Rainbow";
        }

        //religion
        String reli;

        if (islam.isSelected()) {
            reli = "Islam";
        } else if (christian.isSelected()) {
            reli = "Christian";
        } else if (catholic.isSelected()) {
            reli = "Catholic";
        } else if (buddha.isSelected()) {
            reli = "Buddha";
        } else if (hindu.isSelected()) {
            reli = "Hindu";
        } else if (konghucu.isSelected()) {
            reli = "Konghucu";
        } else {
            reli = "Atheis";
        }
        //hobby
        String hobby;
        String spt = "";
        String trv = "";
        String sng = "";
        if (sport.isSelected()) {
            spt = "Sport";
        }
        if (traveling.isSelected()) {
            trv = ",Traveling";
        }
        if (singing.isSelected()) {
            sng = ",Singing";
        }

        hobby = spt + trv + sng;

        try {
            String sql = "INSERT INTO student VALUES('" + id.getText() + "','" + name.getText() + "',"
                    + "'" + age.getText() + "','" + DOB + "','" + gender + "','" + address.getText() + "','" + email.getText()
                    + "','" + phone.getText() + "','" + reli + "','" + hobby + "','" + major.getSelectedItem() + "','" + batch.getSelectedItem() + "')";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Saving data successful");
            ShowData();
            blank_form();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        blank_form();
    }//GEN-LAST:event_cancelActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM student WHERE SID= '" + id.getText() + "'";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Delete data successful");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        ShowData();
        blank_form();
    }//GEN-LAST:event_deleteActionPerformed

    private void table_studentComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_table_studentComponentMoved
    }//GEN-LAST:event_table_studentComponentMoved

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        String DOB = date.getSelectedItem().toString() +" "+ month.getSelectedItem() +" "+ year.getSelectedItem();
        //define gender
        String gender;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else {
            gender = "bencong";
        }

        //religion
        String reli;
        if (islam.isSelected()) {
            reli = "Islam";
        } else if (christian.isSelected()) {
            reli = "Christian";
        } else if (catholic.isSelected()) {
            reli = "Catholic";
        } else if (buddha.isSelected()) {
            reli = "Buddha";
        } else if (hindu.isSelected()) {
            reli = "Hindu";
        } else if (konghucu.isSelected()) {
            reli = "Konghucu";
        } else {
            reli = "atheis";
        }
        //hobby
        String hobby;
        String spt = "";
        String trv = "";
        String sng = "";
        if (sport.isSelected()) {
            spt = "Sport";
        }
        if (traveling.isSelected()) {
            trv = ", Traveling";
        }
        if (singing.isSelected()) {
            sng = ", Singing";
        }

        hobby = spt + trv + sng;

        try {
            String sql = "UPDATE student SET Name='" + name.getText() + "', Age='" + age.getText()
                    + "', Date_Of_Birth='" + DOB + "', Gender='" + gender + "', Address='" + address.getText() + "', Email='" + email.getText()
                    + "',Phone='" + phone.getText() + "', Religion='" + reli + "', Hobby='" + hobby + "', Major='" + major.getSelectedItem()
                    + "', Batch='" + batch.getSelectedItem() + "' WHERE SID='"+id.getText()+"'";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit data successful");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        ShowData();
        blank_form();


    }//GEN-LAST:event_editActionPerformed

    private void table_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_studentMouseClicked
        // TODO add your handling code here:
        int row = table_student.rowAtPoint(evt.getPoint());

        String SID = table_student.getValueAt(row, 1).toString();
        id.setText(SID);

        String Name = table_student.getValueAt(row, 2).toString();
        name.setText(Name);

        String Age = table_student.getValueAt(row, 3).toString();
        age.setText(Age);

        String DOB = table_student.getValueAt(row, 4).toString();
        String str = DOB;
        String[] splitStr = str.split("\\s+");
        date.setSelectedItem(splitStr[0]);
        month.setSelectedItem(splitStr[1]);
        year.setSelectedItem(splitStr[2]);

        String Gender = table_student.getValueAt(row, 5).toString();
        if (Gender == "Female") {
            female.isSelected();
        } else if (Gender == "Male") {
            male.isSelected();
        }

        String Address = table_student.getValueAt(row, 6).toString();
        address.setText(Address);

        String Email = table_student.getValueAt(row, 7).toString();
        email.setText(Email);

        String Phone = table_student.getValueAt(row, 8).toString();
        phone.setText(Phone);

        String Religion = table_student.getValueAt(row, 9).toString();
        if (Religion == "Islam") {
            islam.isSelected();
        } else if (Religion == "Christian") {
            christian.isSelected();
        } else if (Religion == "Catholic") {
            catholic.isSelected();
        } else if (Religion == "Buddha") {
            buddha.isSelected();
        } else if (Religion == "Hindu") {
            hindu.isSelected();
        } else if (Religion == "Konghucu") {
            konghucu.isSelected();
        }

        String Hobby = table_student.getValueAt(row, 10).toString();
        String hobs = Hobby;
        String[] splitHobs = hobs.split(",");
        int length = splitHobs.length;
        
        if(length > 0 && length < 3){
//            boolean spt = false;
//            boolean trv = false;
//            boolean sng = false;
            for(int i = 0; i<length; i++){
                 if(splitHobs[i] == "Sport")
                     sport.isSelected();
//                     spt = true;
                 else if(splitHobs[i] == "traveling")
                     traveling.isSelected();
//                     trv = true;
                 else if(splitHobs[i] == "singing")
                     singing.isSelected();
//                     sng = true;
            }
        }
        else{
            sport.isSelected();
            traveling.isSelected();
            singing.isSelected();
            
            
                    
        }
        String Major = table_student.getValueAt(row, 11).toString();
        major.setSelectedItem(Major);

        String Batch = table_student.getValueAt(row, 12).toString();
        batch.setSelectedItem(Batch);
    }//GEN-LAST:event_table_studentMouseClicked

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JCheckBox buddha;
    private javax.swing.JButton cancel;
    private javax.swing.JCheckBox catholic;
    private javax.swing.JCheckBox christian;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JButton delete;
    private javax.swing.JLabel dob;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel gender;
    private javax.swing.JCheckBox hindu;
    private javax.swing.JLabel hobby;
    private javax.swing.JTextField id;
    private javax.swing.JCheckBox islam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel7;
    private javax.swing.JCheckBox konghucu;
    private javax.swing.JComboBox<String> major;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel reli;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox singing;
    private javax.swing.JCheckBox sport;
    private javax.swing.JTable table_student;
    private javax.swing.JCheckBox traveling;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
