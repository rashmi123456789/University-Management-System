
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentGUI extends javax.swing.JFrame {
    
    
    public StudentGUI() {
        initComponents();
    }

    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTextFieldSuccessfull = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabelsucessfullDelete = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        GetRegNoUGTextFeild = new javax.swing.JTextField();
        jTextFieldIntakeYear = new javax.swing.JTextField();
        jCheckBoxIntakeYear = new javax.swing.JCheckBox();
        jTextFieldFaculty = new javax.swing.JTextField();
        jCheckBoxFaculty = new javax.swing.JCheckBox();
        jTextFieldDob = new javax.swing.JTextField();
        jCheckBoxDob = new javax.swing.JCheckBox();
        jTextFieldforname = new javax.swing.JTextField();
        jCheckBoxName = new javax.swing.JCheckBox();
        jTextFieldforEmail = new javax.swing.JTextField();
        jCheckBoxEmail = new javax.swing.JCheckBox();
        jTextFieldforIntake = new javax.swing.JTextField();
        jCheckBoxIntakeMonth = new javax.swing.JCheckBox();
        jTextFieldCourse = new javax.swing.JTextField();
        jCheckBoxCourse = new javax.swing.JCheckBox();
        jCheckBoxRank = new javax.swing.JCheckBox();
        jTextFieldRank = new javax.swing.JTextField();
        OKButton = new javax.swing.JButton();
        jCheckBoxFees = new javax.swing.JCheckBox();
        jTextFieldFees = new javax.swing.JTextField();
        jCheckBoxNPSubjectNames = new javax.swing.JCheckBox();
        jTextFieldNPSubjectsNames = new javax.swing.JTextField();
        jCheckBoxPSubjectNames = new javax.swing.JCheckBox();
        jTextFieldPSubjects = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldREGNO = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNAME = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldINTAKEMONTH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldINTAKEYEAR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFACULTYNAME = new javax.swing.JTextField();
        jTextFieldRANK = new javax.swing.JTextField();
        jTextFieldALRESULT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDOB = new javax.swing.JTextField();
        jButtonOK = new javax.swing.JButton();
        jTextFieldCOURSECODE = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldEMAIL = new javax.swing.JTextField();
        jTextFieldsuccessfull = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldToDelete = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jTextFieldDeleteSucessfull = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jTextFieldSuccessfull.setEditable(false);
        jTextFieldSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldSuccessfull.setForeground(new java.awt.Color(0, 51, 255));
        jTextFieldSuccessfull.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 204, 204));
        jTextField1.setText("Undergraduate Students ");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 724, Short.MAX_VALUE)
                .addComponent(jLabelsucessfullDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelsucessfullDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(jLabel16)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(0, 0, 255));
        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jTabbedPane1.setForeground(new java.awt.Color(255, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Add Registration Number");

        GetRegNoUGTextFeild.setBackground(new java.awt.Color(240, 240, 240));
        GetRegNoUGTextFeild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GetRegNoUGTextFeild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GetRegNoUGTextFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetRegNoUGTextFeildActionPerformed(evt);
            }
        });

        jTextFieldIntakeYear.setEditable(false);
        jTextFieldIntakeYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldIntakeYear.setBorder(null);

        jCheckBoxIntakeYear.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxIntakeYear.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxIntakeYear.setText("Intake Year");

        jTextFieldFaculty.setEditable(false);
        jTextFieldFaculty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldFaculty.setBorder(null);
        jTextFieldFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFacultyActionPerformed(evt);
            }
        });

        jCheckBoxFaculty.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxFaculty.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxFaculty.setText("Faculty");

        jTextFieldDob.setEditable(false);
        jTextFieldDob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldDob.setBorder(null);

        jCheckBoxDob.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxDob.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxDob.setText("Date Of Birth");

        jTextFieldforname.setEditable(false);
        jTextFieldforname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldforname.setBorder(null);
        jTextFieldforname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfornameActionPerformed(evt);
            }
        });

        jCheckBoxName.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxName.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxName.setText("Name");
        jCheckBoxName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jCheckBoxName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNameActionPerformed(evt);
            }
        });

        jTextFieldforEmail.setEditable(false);
        jTextFieldforEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldforEmail.setBorder(null);
        jTextFieldforEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldforEmailActionPerformed(evt);
            }
        });

        jCheckBoxEmail.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxEmail.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxEmail.setText("Email");

        jTextFieldforIntake.setEditable(false);
        jTextFieldforIntake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldforIntake.setBorder(null);
        jTextFieldforIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldforIntakeActionPerformed(evt);
            }
        });

        jCheckBoxIntakeMonth.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxIntakeMonth.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxIntakeMonth.setText("Intake Month");

        jTextFieldCourse.setEditable(false);
        jTextFieldCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCourse.setBorder(null);

        jCheckBoxCourse.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxCourse.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxCourse.setText("Course");

        jCheckBoxRank.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxRank.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxRank.setText("Rank");

        jTextFieldRank.setEditable(false);
        jTextFieldRank.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldRank.setBorder(null);
        jTextFieldRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRankActionPerformed(evt);
            }
        });

        OKButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OKButton.setForeground(new java.awt.Color(51, 51, 255));
        OKButton.setText("OK");
        OKButton.setBorder(new javax.swing.border.MatteBorder(null));
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        jCheckBoxFees.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxFees.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxFees.setText("Payments");

        jTextFieldFees.setEditable(false);
        jTextFieldFees.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldFees.setBorder(null);

        jCheckBoxNPSubjectNames.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxNPSubjectNames.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxNPSubjectNames.setText("None Practical Subjects");

        jTextFieldNPSubjectsNames.setEditable(false);
        jTextFieldNPSubjectsNames.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNPSubjectsNames.setBorder(null);

        jCheckBoxPSubjectNames.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jCheckBoxPSubjectNames.setForeground(new java.awt.Color(0, 0, 255));
        jCheckBoxPSubjectNames.setText("Practical Subjects");

        jTextFieldPSubjects.setEditable(false);
        jTextFieldPSubjects.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPSubjects.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Search an Undergraduate Student");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxFaculty)
                            .addComponent(jCheckBoxIntakeYear)
                            .addComponent(jCheckBoxDob)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBoxEmail)
                                .addComponent(jCheckBoxName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxCourse)
                                    .addComponent(jCheckBoxIntakeMonth)
                                    .addComponent(jCheckBoxRank)
                                    .addComponent(jCheckBoxFees)
                                    .addComponent(jCheckBoxNPSubjectNames)
                                    .addComponent(jCheckBoxPSubjectNames)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldforIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIntakeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDob, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFees, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNPSubjectsNames, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRank, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldforname, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldforEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addComponent(OKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(GetRegNoUGTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(351, 351, 351)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(GetRegNoUGTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIntakeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxIntakeYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxFaculty))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDob, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldforname, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldforEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxEmail))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(OKButton)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldforIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxIntakeMonth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRank, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jCheckBoxRank))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFees, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxFees))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxNPSubjectNames)
                    .addComponent(jTextFieldNPSubjectsNames, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxPSubjectNames))
                .addGap(23, 23, 23))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Search Student", jScrollPane1);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 204));
        jLabel4.setText("Registration Number");

        jTextFieldREGNO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldREGNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldREGNOActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 204));
        jLabel10.setText("Course Code");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 204));
        jLabel5.setText("Name");

        jTextFieldNAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 204));
        jLabel8.setText("IntakeMonth");

        jTextFieldINTAKEMONTH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldINTAKEMONTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldINTAKEMONTHActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 204));
        jLabel6.setText("Intake Year");

        jTextFieldINTAKEYEAR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 204));
        jLabel7.setText("Faculty Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 204));
        jLabel11.setText("Rank");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 204));
        jLabel9.setText("A/L Result");

        jTextFieldFACULTYNAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldFACULTYNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFACULTYNAMEActionPerformed(evt);
            }
        });

        jTextFieldRANK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldRANK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRANKActionPerformed(evt);
            }
        });

        jTextFieldALRESULT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 204));
        jLabel13.setText("Birth Date");

        jTextFieldDOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonOK.setForeground(new java.awt.Color(0, 51, 255));
        jButtonOK.setText("Insert");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jTextFieldCOURSECODE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 204));
        jLabel12.setText("Email");

        jTextFieldEMAIL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldsuccessfull.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldsuccessfull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsuccessfullActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Add an Undergraduate Student");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jButtonOK)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldINTAKEMONTH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextFieldREGNO, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCOURSECODE, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldINTAKEYEAR, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(713, 713, 713))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldALRESULT, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldFACULTYNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldRANK, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))
                                .addGap(0, 705, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(713, 713, 713))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jTextFieldsuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldREGNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldINTAKEMONTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCOURSECODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldINTAKEYEAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldFACULTYNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldRANK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jTextFieldNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldALRESULT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButtonOK)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldsuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Add Student", jScrollPane2);

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 255));
        jLabel14.setText("Enter Registration Number ");

        jTextFieldToDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonDelete.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(0, 0, 204));
        jButtonDelete.setText("Remove");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jTextFieldDeleteSucessfull.setEditable(false);
        jTextFieldDeleteSucessfull.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 204));
        jLabel15.setText("Remove An Undergraduate Student");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel14)
                        .addGap(131, 131, 131)
                        .addComponent(jTextFieldToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jButtonDelete))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jTextFieldDeleteSucessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(489, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButtonDelete)
                .addGap(55, 55, 55)
                .addComponent(jTextFieldDeleteSucessfull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel4);

        jTabbedPane1.addTab("Remove Student", jScrollPane3);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("To Front Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2430, 2430, 2430)
                                .addComponent(jButtonExit))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jButton1)))))
                .addGap(0, 166, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void GetRegNoUGTextFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetRegNoUGTextFeildActionPerformed
     
    }//GEN-LAST:event_GetRegNoUGTextFeildActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed

        String RegNo=GetRegNoUGTextFeild.getText();
        
        if(jCheckBoxEmail.isSelected()){
            try {
                UndergraduateStudent student=new UndergraduateStudent();
                jTextFieldforEmail.setText(student.getDetailsFromRegistrationNumber(RegNo,"Email"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if(jCheckBoxIntakeMonth.isSelected()){
            try {
                UndergraduateStudent student=new UndergraduateStudent();
                jTextFieldforIntake.setText(student.getDetailsFromRegistrationNumber(RegNo,"Intake_Month"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if(jCheckBoxName.isSelected()){
            try {
                UndergraduateStudent student=new UndergraduateStudent();
                jTextFieldforname.setText(student.getDetailsFromRegistrationNumber(RegNo,"Name"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(jCheckBoxIntakeYear.isSelected()){
            try {
                UndergraduateStudent student=new UndergraduateStudent();
                jTextFieldIntakeYear.setText(student.getDetailsFromRegistrationNumber(RegNo,"Intake_Year"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(jCheckBoxRank.isSelected()){
            try {
                UndergraduateStudent student=new UndergraduateStudent();
                jTextFieldRank.setText(student.getDetailsFromRegistrationNumber(RegNo,"Rank"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(jCheckBoxFaculty.isSelected()){
            try {
                UndergraduateStudent student=new UndergraduateStudent();
                jTextFieldFaculty.setText(student.getDetailsFromRegistrationNumber(RegNo,"Faculty_Name"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(jCheckBoxCourse.isSelected()){
            try {
              UndergraduateStudent student=new UndergraduateStudent();
                jTextFieldCourse.setText(student.getDetailsFromRegistrationNumber(RegNo,"Course_Code"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
          if(jCheckBoxDob.isSelected()){
            try {
                UndergraduateStudent student=new UndergraduateStudent();
                jTextFieldDob.setText(student.getDetailsFromRegistrationNumber(RegNo,"Date_Of_Birth"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         if(jCheckBoxNPSubjectNames.isSelected()){
            try {
                Theoretical_Subject student=new Theoretical_Subject();
                jTextFieldNPSubjectsNames.setText(student.getNonePracticalSubjectsNamesFromRegistrationNumber(RegNo));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         if(jCheckBoxPSubjectNames.isSelected()){
            try {
                Practical_Subject student=new Practical_Subject();
                jTextFieldPSubjects.setText(student.getPracticalSubjectsNamesFromRegistrationNumber(RegNo));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         if(jCheckBoxFees.isSelected()){
            try {
                Students student=new Students();
                jTextFieldFees.setText(student.getPaymentDetailsFromRegistrationNumber(RegNo));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         
        
    }//GEN-LAST:event_OKButtonActionPerformed

    private void jCheckBoxNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxNameActionPerformed

    private void jTextFieldfornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldfornameActionPerformed

    private void jTextFieldFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFacultyActionPerformed

    private void jTextFieldRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRankActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        // TODO add your handling code here:
       String name= jTextFieldNAME.getText();
       String intake_month=jTextFieldINTAKEMONTH.getText();
       String intake_year=jTextFieldINTAKEYEAR.getText();
       String dob=jTextFieldDOB.getText();
       String rank=jTextFieldRANK.getText();
       String course_code=jTextFieldCOURSECODE.getText();
       String faculty_name=jTextFieldFACULTYNAME.getText();
       String reg_no=jTextFieldREGNO.getText();
       String alresult=jTextFieldALRESULT.getText();
       String email=jTextFieldEMAIL.getText();
       
       
        try {
            UndergraduateStudent student=new UndergraduateStudent();
            student.EnterValues(email,name, dob, reg_no,  faculty_name,course_code,alresult,rank,intake_year,intake_month );
        } catch (SQLException ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextFieldsuccessfull.setText("Student "+name+" Successfully Added!!");
       
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
     
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldFACULTYNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFACULTYNAMEActionPerformed
 
    }//GEN-LAST:event_jTextFieldFACULTYNAMEActionPerformed

    private void jTextFieldINTAKEMONTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldINTAKEMONTHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldINTAKEMONTHActionPerformed

    private void jTextFieldRANKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRANKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRANKActionPerformed

    private void jTextFieldsuccessfullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsuccessfullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsuccessfullActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
        UndergraduateStudent student;
        try {
            student = new UndergraduateStudent();
            String deleteRegNo=jTextFieldToDelete.getText();
            student.Remove(deleteRegNo);
            jTextFieldDeleteSucessfull.setText(deleteRegNo+" Successfully Removed");
        } catch (SQLException ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldforEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldforEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldforEmailActionPerformed

    private void jTextFieldREGNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldREGNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldREGNOActionPerformed

    private void jTextFieldforIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldforIntakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldforIntakeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FrontPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GetRegNoUGTextFeild;
    private javax.swing.JButton OKButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBoxCourse;
    private javax.swing.JCheckBox jCheckBoxDob;
    private javax.swing.JCheckBox jCheckBoxEmail;
    private javax.swing.JCheckBox jCheckBoxFaculty;
    private javax.swing.JCheckBox jCheckBoxFees;
    private javax.swing.JCheckBox jCheckBoxIntakeMonth;
    private javax.swing.JCheckBox jCheckBoxIntakeYear;
    private javax.swing.JCheckBox jCheckBoxNPSubjectNames;
    private javax.swing.JCheckBox jCheckBoxName;
    private javax.swing.JCheckBox jCheckBoxPSubjectNames;
    private javax.swing.JCheckBox jCheckBoxRank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelsucessfullDelete;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldALRESULT;
    private javax.swing.JTextField jTextFieldCOURSECODE;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldDOB;
    private javax.swing.JTextField jTextFieldDeleteSucessfull;
    private javax.swing.JTextField jTextFieldDob;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldFACULTYNAME;
    private javax.swing.JTextField jTextFieldFaculty;
    private javax.swing.JTextField jTextFieldFees;
    private javax.swing.JTextField jTextFieldINTAKEMONTH;
    private javax.swing.JTextField jTextFieldINTAKEYEAR;
    private javax.swing.JTextField jTextFieldIntakeYear;
    private javax.swing.JTextField jTextFieldNAME;
    private javax.swing.JTextField jTextFieldNPSubjectsNames;
    private javax.swing.JTextField jTextFieldPSubjects;
    private javax.swing.JTextField jTextFieldRANK;
    private javax.swing.JTextField jTextFieldREGNO;
    private javax.swing.JTextField jTextFieldRank;
    private javax.swing.JTextField jTextFieldSuccessfull;
    private javax.swing.JTextField jTextFieldToDelete;
    private javax.swing.JTextField jTextFieldforEmail;
    private javax.swing.JTextField jTextFieldforIntake;
    private javax.swing.JTextField jTextFieldforname;
    private javax.swing.JTextField jTextFieldsuccessfull;
    // End of variables declaration//GEN-END:variables
}
