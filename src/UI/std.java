/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import TestData.TestData;
import helper.Helper;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Department.DepartmentDirectory;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Transcript;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.util.List;

/**
 *
 * @author shreyascr
 */
public class std extends javax.swing.JPanel {

    /**
     * Creates new form std
     */
    TestData td;
   Department d;
   StudentProfile sp;
   String profName;
    public std() {
        initComponents();
        
        td = TestData.getInstance();
      // td.test2();
        StdDspPnl.setVisible(false);
        RateProfPanel.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        StudentLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLowerPanel = new javax.swing.JPanel();
        PasswordField = new javax.swing.JPasswordField();
        UsernameLowerPanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        StdDspPnl = new javax.swing.JPanel();
        jStdDtlLb = new javax.swing.JLabel();
        jUnamelbl1 = new javax.swing.JLabel();
        StdDtlScrlPn = new javax.swing.JScrollPane();
        StdDtlTbl = new javax.swing.JTable();
        GpaLbl = new javax.swing.JLabel();
        GpaTxtfld = new javax.swing.JTextField();
        StdIDlbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CGPAtxt = new javax.swing.JTextField();
        btback = new javax.swing.JButton();
        RateProfessorbtn = new javax.swing.JButton();
        RateProfPanel = new javax.swing.JPanel();
        ProfNamelbl = new javax.swing.JLabel();
        RatingDropdown = new javax.swing.JComboBox<>();
        Ratinglbl = new javax.swing.JLabel();
        ProfNameValueTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cancelbtn = new javax.swing.JButton();
        OKbtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(29, 44, 64));
        jPanel1.setPreferredSize(new java.awt.Dimension(478, 419));

        StudentLoginPanel.setBackground(new java.awt.Color(23, 35, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT LOG IN");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout StudentLoginPanelLayout = new javax.swing.GroupLayout(StudentLoginPanel);
        StudentLoginPanel.setLayout(StudentLoginPanelLayout);
        StudentLoginPanelLayout.setHorizontalGroup(
            StudentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StudentLoginPanelLayout.setVerticalGroup(
            StudentLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(153, 153, 153));
        PasswordLabel.setText("PASSWORD:");

        UsernameTextField.setBackground(new java.awt.Color(44, 63, 87));
        UsernameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameTextField.setForeground(new java.awt.Color(153, 153, 153));
        UsernameTextField.setBorder(null);
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(153, 153, 153));
        UsernameLabel.setText("USERNAME: ");

        PasswordLowerPanel.setBackground(new java.awt.Color(255, 153, 153));
        PasswordLowerPanel.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout PasswordLowerPanelLayout = new javax.swing.GroupLayout(PasswordLowerPanel);
        PasswordLowerPanel.setLayout(PasswordLowerPanelLayout);
        PasswordLowerPanelLayout.setHorizontalGroup(
            PasswordLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PasswordLowerPanelLayout.setVerticalGroup(
            PasswordLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        PasswordField.setBackground(new java.awt.Color(44, 63, 87));
        PasswordField.setBorder(null);
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        UsernameLowerPanel.setBackground(new java.awt.Color(255, 153, 153));
        UsernameLowerPanel.setForeground(new java.awt.Color(255, 153, 153));
        UsernameLowerPanel.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout UsernameLowerPanelLayout = new javax.swing.GroupLayout(UsernameLowerPanel);
        UsernameLowerPanel.setLayout(UsernameLowerPanelLayout);
        UsernameLowerPanelLayout.setHorizontalGroup(
            UsernameLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        UsernameLowerPanelLayout.setVerticalGroup(
            UsernameLowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        LoginButton.setBackground(new java.awt.Color(44, 63, 87));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(153, 153, 153));
        LoginButton.setText("LOGIN");
        LoginButton.setBorder(null);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PasswordLowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(PasswordField)
                    .addComponent(UsernameLowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(UsernameTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(StudentLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(UsernameLowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PasswordLowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jStdDtlLb.setText("Student Details");

        jUnamelbl1.setText("Stduent ID");

        StdDtlTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Course Name", "Course Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StdDtlScrlPn.setViewportView(StdDtlTbl);

        GpaLbl.setText("Student Performance Metric");

        GpaTxtfld.setEditable(false);
        GpaTxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GpaTxtfldActionPerformed(evt);
            }
        });

        jLabel2.setText("CGPA");

        CGPAtxt.setEditable(false);
        CGPAtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CGPAtxtActionPerformed(evt);
            }
        });

        btback.setText("Back");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        RateProfessorbtn.setText("Rate Professor");
        RateProfessorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateProfessorbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StdDspPnlLayout = new javax.swing.GroupLayout(StdDspPnl);
        StdDspPnl.setLayout(StdDspPnlLayout);
        StdDspPnlLayout.setHorizontalGroup(
            StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StdDspPnlLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StdDspPnlLayout.createSequentialGroup()
                        .addComponent(jUnamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StdIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(StdDspPnlLayout.createSequentialGroup()
                            .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RateProfessorbtn)
                                .addComponent(btback))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StdDspPnlLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(31, 31, 31))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StdDspPnlLayout.createSequentialGroup()
                                    .addComponent(GpaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CGPAtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(StdDspPnlLayout.createSequentialGroup()
                                    .addComponent(GpaTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(StdDtlScrlPn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(StdDspPnlLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jStdDtlLb, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        StdDspPnlLayout.setVerticalGroup(
            StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StdDspPnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jStdDtlLb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jUnamelbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(StdIDlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StdDtlScrlPn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GpaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GpaTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CGPAtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RateProfessorbtn))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        ProfNamelbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProfNamelbl.setText("Professor Name:");

        RatingDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        RatingDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatingDropdownActionPerformed(evt);
            }
        });

        Ratinglbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ratinglbl.setText("Please Enter Rating:");

        ProfNameValueTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfNameValueTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RATE MY PROFESSOR ");

        Cancelbtn.setText("CANCEL");
        Cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbtnActionPerformed(evt);
            }
        });

        OKbtn.setText("OK");
        OKbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RateProfPanelLayout = new javax.swing.GroupLayout(RateProfPanel);
        RateProfPanel.setLayout(RateProfPanelLayout);
        RateProfPanelLayout.setHorizontalGroup(
            RateProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RateProfPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(RateProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cancelbtn)
                    .addGroup(RateProfPanelLayout.createSequentialGroup()
                        .addGroup(RateProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProfNamelbl)
                            .addComponent(Ratinglbl))
                        .addGap(39, 39, 39)
                        .addGroup(RateProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RatingDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfNameValueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(OKbtn)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        RateProfPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Cancelbtn, OKbtn});

        RateProfPanelLayout.setVerticalGroup(
            RateProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RateProfPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addGroup(RateProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProfNamelbl)
                    .addComponent(ProfNameValueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(RateProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RatingDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ratinglbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(RateProfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelbtn)
                    .addComponent(OKbtn))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(StdDspPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RateProfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(StdDspPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RateProfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
       System.out.println("Mouse Clicked");
        String uname = "";
        String pwd = "admin";
        String usertxt = UsernameTextField.getText();
        DepartmentDirectory dd = TestData.getInstance().getDd();
        boolean found = false;
        List<Department> list = dd.getDd();
        for(Department d : list)
        {
            StudentDirectory sd = d.getStudentDirectory();
            StudentProfile sp = sd.findStudent(usertxt);
            if(sp!=null)
            {
            this.sp = sp;    
            this.d=d;
                //            System.out.println(student);

                StdIDlbl.setText(usertxt);
                //if((student!=null) && (jPwdTxtfld.getPassword().equals(pwd)))

                jPanel1.setVisible(false);
                RateProfPanel.setVisible(false);
                StdDspPnl.setVisible(true);
                //jPanel1.setVisible(false);
                //ListOfCoursesPnl.setVisible(true);

                ArrayList<CourseLoad> cl1 = sp.getCurrentCourseLoad().getCourseInformation();
                //            System.out.println(student.studentPerformanceMetric());
                //            System.out.println(cl1);

                DefaultTableModel model = (DefaultTableModel) StdDtlTbl.getModel();
                model.setRowCount(0);

                for(int i=0;i<cl1.size();i++)
                {

                    Object[] row= new Object[2];
                    if(i%2==0)
                    {
                        row[0]=cl1.get(i);
                        row[1]=cl1.get(i+1);
                        model.addRow(row);
                    }
                }
                Double val1 = sp.studentPerformanceMetric();

                GpaTxtfld.setText(val1.toString());
                Double val2 = sp.getCurrentCourseLoad().iterateSeatAssignments();
                // System.out.println(val2);
                CGPAtxt.setText(val2.toString());
               found = true;
            }
           
        }
        
        if(!found)
        {
            JOptionPane.showMessageDialog(this ,"No Student Found");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void GpaTxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GpaTxtfldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_GpaTxtfldActionPerformed

    private void CGPAtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGPAtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CGPAtxtActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
       jPanel1.setVisible(true);
        StdDspPnl.setVisible(false);
    }//GEN-LAST:event_btbackActionPerformed


    private void RateProfessorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateProfessorbtnActionPerformed
        // TODO add your handling code here:
        List<String> l = new Helper().getProfessors(d,sp);
        profName = l.get(0);
        //System.out.println("Check");
//        for(String item : l ){
//        }
        ProfNameValueTxt.setText(profName);
        StdDspPnl.setVisible(false);
        RateProfPanel.setVisible(true);
        
    }//GEN-LAST:event_RateProfessorbtnActionPerformed

    private void RatingDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatingDropdownActionPerformed
        // TODO add your handling code here:
        //String[] dropDown = {"1","2"};
        //RatingDropdown obj = new RatingDropdown(dropDown);
        
        
    }//GEN-LAST:event_RatingDropdownActionPerformed

    private void CancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbtnActionPerformed
        // TODO add your handling code here:
        StdDspPnl.setVisible(true);
        RateProfPanel.setVisible(false);
    }//GEN-LAST:event_CancelbtnActionPerformed

    private void OKbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKbtnActionPerformed
        // TODO add your handling code here:
        StdDspPnl.setVisible(true);
        RateProfPanel.setVisible(false);
        String selectValue = RatingDropdown.getSelectedItem().toString();
        
        //System.out.println(selectValue);
        Boolean flag = false;
        DepartmentDirectory dd = TestData.getInstance().getDd();
        List<Department> list = dd.getDd();
        for(Department d : list)
        {
            if(d.getFacultyDirectory().getTeacherlist().get(0).getPerson().getPersonId().equals(profName)){
                d.getFacultyDirectory().getTeacherlist().get(0).setFacultyRatings(Integer.parseInt(selectValue));
                
                flag=true;
                System.out.println("Professor Ratings: "+d.getFacultyDirectory().getTeacherlist().get(0).getFacultyRatings());
                break;
            }
        }
            
        if(flag)
         JOptionPane.showMessageDialog(this ,"Your Rating has been Saved!");
    }//GEN-LAST:event_OKbtnActionPerformed

    private void ProfNameValueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfNameValueTxtActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ProfNameValueTxtActionPerformed

        
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new TestData().test2();
                //new StdJFrame().setVisible(true);
            }
        });
    }
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CGPAtxt;
    private javax.swing.JButton Cancelbtn;
    private javax.swing.JLabel GpaLbl;
    private javax.swing.JTextField GpaTxtfld;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton OKbtn;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordLowerPanel;
    private javax.swing.JTextField ProfNameValueTxt;
    private javax.swing.JLabel ProfNamelbl;
    private javax.swing.JPanel RateProfPanel;
    private javax.swing.JButton RateProfessorbtn;
    private javax.swing.JComboBox<String> RatingDropdown;
    private javax.swing.JLabel Ratinglbl;
    private javax.swing.JPanel StdDspPnl;
    private javax.swing.JScrollPane StdDtlScrlPn;
    private javax.swing.JTable StdDtlTbl;
    private javax.swing.JLabel StdIDlbl;
    private javax.swing.JPanel StudentLoginPanel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel UsernameLowerPanel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JButton btback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jStdDtlLb;
    private javax.swing.JLabel jUnamelbl1;
    // End of variables declaration//GEN-END:variables
}
