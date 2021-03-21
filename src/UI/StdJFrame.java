package UI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
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

/**
 *
 * @author naren
 */
public class StdJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public StdJFrame() {
        initComponents();
        StdDspPnl.setVisible(false);
        StdLgnPnl.setVisible(false);
        //jPanel1.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        StdLgnPnl = new javax.swing.JPanel();
        jStdLoginlbl = new javax.swing.JLabel();
        jUnamelbl = new javax.swing.JLabel();
        jUserTxtfld = new javax.swing.JTextField();
        jPasswordlbl = new javax.swing.JLabel();
        jPwdTxtfld = new javax.swing.JPasswordField();
        Stdlgnbtn = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout StdDspPnlLayout = new javax.swing.GroupLayout(StdDspPnl);
        StdDspPnl.setLayout(StdDspPnlLayout);
        StdDspPnlLayout.setHorizontalGroup(
            StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StdDspPnlLayout.createSequentialGroup()
                .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StdDspPnlLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(StdDspPnlLayout.createSequentialGroup()
                                    .addComponent(jUnamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(StdIDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(StdDtlScrlPn, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btback)))
                        .addGroup(StdDspPnlLayout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jStdDtlLb, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StdDspPnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GpaLbl)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(StdDspPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GpaTxtfld, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(CGPAtxt))))
                .addContainerGap(24, Short.MAX_VALUE))
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
                    .addComponent(CGPAtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jStdLoginlbl.setText("Student Login");

        jUnamelbl.setText("Username:");

        jUserTxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUserTxtfldActionPerformed(evt);
            }
        });

        jPasswordlbl.setText("Password:");

        jPwdTxtfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPwdTxtfldActionPerformed(evt);
            }
        });

        Stdlgnbtn.setText("Login");
        Stdlgnbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StdlgnbtnMouseClicked(evt);
            }
        });
        Stdlgnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StdlgnbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StdLgnPnlLayout = new javax.swing.GroupLayout(StdLgnPnl);
        StdLgnPnl.setLayout(StdLgnPnlLayout);
        StdLgnPnlLayout.setHorizontalGroup(
            StdLgnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StdLgnPnlLayout.createSequentialGroup()
                .addGroup(StdLgnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StdLgnPnlLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(StdLgnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StdLgnPnlLayout.createSequentialGroup()
                                .addComponent(jPasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPwdTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(StdLgnPnlLayout.createSequentialGroup()
                                .addComponent(jUnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jUserTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(StdLgnPnlLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jStdLoginlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StdLgnPnlLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Stdlgnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        StdLgnPnlLayout.setVerticalGroup(
            StdLgnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StdLgnPnlLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jStdLoginlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StdLgnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUnamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUserTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(StdLgnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPwdTxtfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Stdlgnbtn)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(29, 44, 64));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StdLgnPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(StdDspPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StdLgnPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(StdDspPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(9, 9, 9)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StdlgnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StdlgnbtnActionPerformed
      // TODO add your handling code here:
        String uname = "";
        String pwd = "admin";
        String usertxt = jUserTxtfld.getText();
        
 
          StudentProfile student = sd.findStudent(usertxt);
//            System.out.println(student);
        
            StdIDlbl.setText(usertxt);
             //if((student!=null) && (jPwdTxtfld.getPassword().equals(pwd)))
           if(student!=null)
           {
              StdLgnPnl.setVisible(false);
              StdDspPnl.setVisible(true);
              //jPanel1.setVisible(false);
              //ListOfCoursesPnl.setVisible(true);

              ArrayList<CourseLoad> cl1 = student.getCurrentCourseLoad().getCourseInformation();
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
              Double val1 = student.studentPerformanceMetric();

              GpaTxtfld.setText(val1.toString());
              Double val2 = student.getCurrentCourseLoad().iterateSeatAssignments();
              // System.out.println(val2);
              CGPAtxt.setText(val2.toString());
            }
            else {
                JOptionPane.showMessageDialog(this,"No Student found");
                        
            }
    }//GEN-LAST:event_StdlgnbtnActionPerformed

    private void StdlgnbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StdlgnbtnMouseClicked
        // TODO add your handling code here:

//        StudentProfile student = sd.findStudent("1");
//        System.out.println(student.studentPerformanceMetric());
        
    }//GEN-LAST:event_StdlgnbtnMouseClicked

    private void jUserTxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUserTxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUserTxtfldActionPerformed

    private void GpaTxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GpaTxtfldActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_GpaTxtfldActionPerformed

    private void CGPAtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CGPAtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CGPAtxtActionPerformed

    private void jPwdTxtfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPwdTxtfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPwdTxtfldActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
       StdLgnPnl.setVisible(true);
       StdDspPnl.setVisible(false);
    }//GEN-LAST:event_btbackActionPerformed

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String uname = "";
        String pwd = "admin";
        String usertxt = UsernameTextField.getText();
        
 
          StudentProfile student = sd.findStudent(usertxt);
//            System.out.println(student);
        
            StdIDlbl.setText(usertxt);
             //if((student!=null) && (jPwdTxtfld.getPassword().equals(pwd)))
           if(student!=null)
           {
              StdLgnPnl.setVisible(false);
              StdDspPnl.setVisible(true);
              //jPanel1.setVisible(false);
              //ListOfCoursesPnl.setVisible(true);

              ArrayList<CourseLoad> cl1 = student.getCurrentCourseLoad().getCourseInformation();
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
              Double val1 = student.studentPerformanceMetric();

              GpaTxtfld.setText(val1.toString());
              Double val2 = student.getCurrentCourseLoad().iterateSeatAssignments();
              // System.out.println(val2);
              CGPAtxt.setText(val2.toString());
            }
            else {
                JOptionPane.showMessageDialog(this,"No Student found");
                        
            }
    }//GEN-LAST:event_LoginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    static Department department;
    static PersonDirectory pd;
         
         static FacultyDirectory facultyDirectory ;
         static Person person1;
        
       
        
        static Course course ;
        static Course course1;
        static Course course2;
        
        static Transcript transcript;

        static CourseSchedule courseschedule ;

        static CourseOffer courseoffer ;
        
        
        static FacultyProfile facultyProfile ;
        
        static CourseOffer courseoffer1 ;
        static CourseLoad courseload;
        
        
        
        static CourseOffer courseoffer2 ;//added by myself
        
       
       
        static Person person ;
        static StudentDirectory sd ;
        static StudentProfile student;
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
                new StdJFrame().setVisible(true);
                 department = new Department("Information Systems");
          pd = department.getPersonDirectory();
         
         facultyDirectory = new FacultyDirectory(department);
         person1 = pd.newPerson("TeacherName");
        
       
        
         course = department.newCourse("app eng", "info 5100", 4);
         course1 = department.newCourse("dmdd", "info 6100", 4);
         course2 = department.newCourse("PSA", "info 6205", 4);//added by myself
        
        //SeatAssignment sa = new SeatAssignment();
        //sa.setGrade("B+");

         courseschedule = department.newCourseSchedule("Fall 2020");

         courseoffer = courseschedule.newCourseOffer("info 5100");
        
        courseoffer.generatSeats(10);
         facultyProfile = new FacultyProfile(person1);
        facultyProfile.AssignAsTeacher(courseoffer);
        facultyProfile.getCourseOffer("info 5100");
         courseoffer1 = courseschedule.newCourseOffer("info 6100");
        
        courseoffer1.generatSeats(20);
        
         courseoffer2 = courseschedule.newCourseOffer("info 6205");//added by myself
        
        courseoffer2.generatSeats(30);//added by myself
       
         person = pd.newPerson("100");
         sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload = student.newCourseLoad("Fall 2020"); 
//        
        courseload.newSeatAssignment(courseoffer);
        courseload.newSeatAssignment(courseoffer1);
        courseload.newSeatAssignment(courseoffer2);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CGPAtxt;
    private javax.swing.JLabel GpaLbl;
    private javax.swing.JTextField GpaTxtfld;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordLowerPanel;
    private javax.swing.JPanel StdDspPnl;
    private javax.swing.JScrollPane StdDtlScrlPn;
    private javax.swing.JTable StdDtlTbl;
    private javax.swing.JLabel StdIDlbl;
    private javax.swing.JPanel StdLgnPnl;
    private javax.swing.JButton Stdlgnbtn;
    private javax.swing.JPanel StudentLoginPanel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel UsernameLowerPanel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JButton btback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPasswordlbl;
    private javax.swing.JPasswordField jPwdTxtfld;
    private javax.swing.JLabel jStdDtlLb;
    private javax.swing.JLabel jStdLoginlbl;
    private javax.swing.JLabel jUnamelbl;
    private javax.swing.JLabel jUnamelbl1;
    private javax.swing.JTextField jUserTxtfld;
    // End of variables declaration//GEN-END:variables
}
