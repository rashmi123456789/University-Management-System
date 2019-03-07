
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PostgraduateStudentGUI extends javax.swing.JFrame {

   
    public PostgraduateStudentGUI() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldRegNo = new javax.swing.JTextField();
        jCheckBoxName = new javax.swing.JCheckBox();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldFaculty_Name = new javax.swing.JTextField();
        jCheckBoxFaculty_Name = new javax.swing.JCheckBox();
        jCheckBoxCourse_Code = new javax.swing.JCheckBox();
        jTextFieldCourse_Code = new javax.swing.JTextField();
        jTextFieldQualifiation_Type = new javax.swing.JTextField();
        jCheckBoxQualification_Type = new javax.swing.JCheckBox();
        jTextFieldEmail = new javax.swing.JTextField();
        jCheckBoxEmail = new javax.swing.JCheckBox();
        jTextFieldIntake_Year = new javax.swing.JTextField();
        jCheckBoxIntake_Year = new javax.swing.JCheckBox();
        jTextFieldIntake_Month = new javax.swing.JTextField();
        jCheckBoxIntake_Month = new javax.swing.JCheckBox();
        jCheckBoxDob = new javax.swing.JCheckBox();
        jTextFieldDob = new javax.swing.JTextField();
        jTextFieldQualified_Institute = new javax.swing.JTextField();
        jCheckBoxQualified_Institute = new javax.swing.JCheckBox();
        jButtonOK = new javax.swing.JButton();
        jCheckBoxFees = new javax.swing.JCheckBox();
        jTextFieldFees = new javax.swing.JTextField();
        jCheckBoxPractical_Subject = new javax.swing.JCheckBox();
        jTextFieldPracticalSubjects = new javax.swing.JTextField();
        jCheckBoxNPSubjects = new javax.swing.JCheckBox();
        jTextFieldNPSubjects = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldREGNO = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldEMAIL = new javax.swing.JTextField();
        jTextFieldNAME = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldQUALIFICATION_TYPE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldINTAKEMONTH = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldCOURSE_CODE = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldINSTITUTE = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDOB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldQUALIFICATION_YEAR = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldINTAKE_YEAR = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldSuccessfull = new javax.swing.JTextField();
        jButtonINSERT = new javax.swing.JButton();
        jTextFieldFAULTY_NAME = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldPGDelete = new javax.swing.JTextField();
        jButtonDeleteOK = new javax.swing.JButton();
        jTextFieldPGDeleteSuccessfull = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Postgraduate Student");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 255));
        jLabel4.setText("Enter Registration Number");

        jTextFieldRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldRegNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBoxName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxName.setForeground(new java.awt.Color(51, 51, 255));
        jCheckBoxName.setText("Name");
        jCheckBoxName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldName.setEditable(false);
        jTextFieldName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldName.setBorder(null);
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jTextFieldFaculty_Name.setEditable(false);
        jTextFieldFaculty_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldFaculty_Name.setBorder(null);

        jCheckBoxFaculty_Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxFaculty_Name.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxFaculty_Name.setText("Faculty Name");
        jCheckBoxFaculty_Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBoxCourse_Code.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxCourse_Code.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxCourse_Code.setText("Course Code");
        jCheckBoxCourse_Code.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldCourse_Code.setEditable(false);
        jTextFieldCourse_Code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCourse_Code.setBorder(null);

        jTextFieldQualifiation_Type.setEditable(false);
        jTextFieldQualifiation_Type.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldQualifiation_Type.setBorder(null);

        jCheckBoxQualification_Type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxQualification_Type.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxQualification_Type.setText("Qualification Type");
        jCheckBoxQualification_Type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldEmail.setBorder(null);

        jCheckBoxEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxEmail.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxEmail.setText("Email");
        jCheckBoxEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldIntake_Year.setEditable(false);
        jTextFieldIntake_Year.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldIntake_Year.setBorder(null);

        jCheckBoxIntake_Year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxIntake_Year.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxIntake_Year.setText("Intake_Year");
        jCheckBoxIntake_Year.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldIntake_Month.setEditable(false);
        jTextFieldIntake_Month.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldIntake_Month.setBorder(null);

        jCheckBoxIntake_Month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxIntake_Month.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxIntake_Month.setText("Intake Month");
        jCheckBoxIntake_Month.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBoxDob.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxDob.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxDob.setText("Date of Birth");
        jCheckBoxDob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldDob.setEditable(false);
        jTextFieldDob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldDob.setBorder(null);

        jTextFieldQualified_Institute.setEditable(false);
        jTextFieldQualified_Institute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldQualified_Institute.setBorder(null);
        jTextFieldQualified_Institute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQualified_InstituteActionPerformed(evt);
            }
        });

        jCheckBoxQualified_Institute.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxQualified_Institute.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxQualified_Institute.setText("Qualified Institute");
        jCheckBoxQualified_Institute.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonOK.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonOK.setForeground(new java.awt.Color(0, 0, 255));
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jCheckBoxFees.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxFees.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxFees.setText("Payments");

        jTextFieldFees.setEditable(false);
        jTextFieldFees.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldFees.setBorder(null);

        jCheckBoxPractical_Subject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxPractical_Subject.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxPractical_Subject.setText("Practical Subjects");

        jTextFieldPracticalSubjects.setEditable(false);
        jTextFieldPracticalSubjects.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldPracticalSubjects.setBorder(null);

        jCheckBoxNPSubjects.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBoxNPSubjects.setForeground(new java.awt.Color(51, 0, 255));
        jCheckBoxNPSubjects.setText("None Practical Subject");

        jTextFieldNPSubjects.setEditable(false);
        jTextFieldNPSubjects.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNPSubjects.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxFaculty_Name)
                            .addComponent(jCheckBoxCourse_Code)
                            .addComponent(jCheckBoxIntake_Month)
                            .addComponent(jCheckBoxDob)
                            .addComponent(jCheckBoxQualified_Institute)
                            .addComponent(jCheckBoxEmail)
                            .addComponent(jCheckBoxFees)
                            .addComponent(jCheckBoxName)
                            .addComponent(jCheckBoxQualification_Type)
                            .addComponent(jCheckBoxIntake_Year)
                            .addComponent(jCheckBoxPractical_Subject)
                            .addComponent(jCheckBoxNPSubjects))))
                .addGap(0, 260, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldNPSubjects, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jTextFieldPracticalSubjects, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFees, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldQualified_Institute, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDob, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIntake_Month, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIntake_Year, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldQualifiation_Type, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCourse_Code, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFaculty_Name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOK))
                    .addComponent(jTextFieldRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFaculty_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxFaculty_Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCourse_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCourse_Code)
                    .addComponent(jButtonOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQualifiation_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxQualification_Type))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIntake_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxIntake_Year))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIntake_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxIntake_Month))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDob, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQualified_Institute, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxQualified_Institute))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFees, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxFees))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPracticalSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxPractical_Subject))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNPSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxNPSubjects))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Registration Number");

        jTextFieldREGNO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldREGNO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Email");

        jTextFieldEMAIL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldEMAIL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextFieldNAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNAME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Qualification Type");

        jTextFieldQUALIFICATION_TYPE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldQUALIFICATION_TYPE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Intake Month");

        jTextFieldINTAKEMONTH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldINTAKEMONTH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldINTAKEMONTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldINTAKEMONTHActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("Course Code");

        jTextFieldCOURSE_CODE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCOURSE_CODE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Institute");

        jTextFieldINSTITUTE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldINSTITUTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Date Of Birth");

        jTextFieldDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldDOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Qualification Year");

        jTextFieldQUALIFICATION_YEAR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldQUALIFICATION_YEAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Intake Year");

        jTextFieldINTAKE_YEAR.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldINTAKE_YEAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Faculty Name");

        jTextFieldSuccessfull.setEditable(false);
        jTextFieldSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldSuccessfull.setBorder(null);

        jButtonINSERT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonINSERT.setForeground(new java.awt.Color(0, 0, 204));
        jButtonINSERT.setText("INSERT");
        jButtonINSERT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonINSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINSERTActionPerformed(evt);
            }
        });

        jTextFieldFAULTY_NAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldFAULTY_NAME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldINTAKEMONTH, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldREGNO, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNAME)
                                    .addComponent(jTextFieldEMAIL)
                                    .addComponent(jTextFieldQUALIFICATION_TYPE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel10)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel16))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel15)))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCOURSE_CODE, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jTextFieldINSTITUTE)
                            .addComponent(jTextFieldDOB)
                            .addComponent(jTextFieldQUALIFICATION_YEAR)
                            .addComponent(jTextFieldFAULTY_NAME))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonINSERT))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldINTAKE_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldREGNO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCOURSE_CODE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldINSTITUTE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonINSERT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQUALIFICATION_TYPE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldQUALIFICATION_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldINTAKEMONTH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldFAULTY_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldINTAKE_YEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addGap(24, 24, 24))
        );

        jScrollPane2.setViewportView(jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Search for Postgraduate Student");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Add Postgraduate Student");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Remove a Postgraduate Student");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setText("Enter Registration Number");

        jTextFieldPGDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonDeleteOK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonDeleteOK.setForeground(new java.awt.Color(0, 0, 204));
        jButtonDeleteOK.setText("Delete");
        jButtonDeleteOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteOKActionPerformed(evt);
            }
        });

        jTextFieldPGDeleteSuccessfull.setEditable(false);
        jTextFieldPGDeleteSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldPGDeleteSuccessfull.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPGDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButtonDeleteOK))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jTextFieldPGDeleteSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldPGDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteOK)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPGDeleteSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel3);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 204));
        jButton1.setText("To Front Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel5))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(211, 211, 211)
                                        .addComponent(jButton1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(412, 412, 412))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel8)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldQualified_InstituteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQualified_InstituteActionPerformed
    
    }//GEN-LAST:event_jTextFieldQualified_InstituteActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        
        String RegNo=jTextFieldRegNo.getText();
        
        if(jCheckBoxEmail.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldEmail.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Email"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if(jCheckBoxIntake_Month.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldIntake_Month.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Intake_Month"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if(jCheckBoxName.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldName.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Name"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(jCheckBoxIntake_Year.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldIntake_Year.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Intake_Year"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(jCheckBoxQualified_Institute.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldQualified_Institute.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Institute"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(jCheckBoxFaculty_Name.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldFaculty_Name.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Faculty_Name"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          if(jCheckBoxCourse_Code.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldCourse_Code.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Course_Code"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
          if(jCheckBoxDob.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldDob.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Date_Of_Birth"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
          if(jCheckBoxQualification_Type.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldQualifiation_Type.setText(student.getPGDetailsFromRegistrationNumber(RegNo,"Qualification_Type"));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
          if(jCheckBoxNPSubjects.isSelected()){
            try {
                Theoretical_Subject student=new Theoretical_Subject();
                jTextFieldNPSubjects.setText(student.getNonePracticalSubjectsNamesFromRegistrationNumber(RegNo));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         if(jCheckBoxPractical_Subject.isSelected()){
            try {
                Practical_Subject student=new Practical_Subject();
                jTextFieldPracticalSubjects.setText(student.getPracticalSubjectsNamesFromRegistrationNumber(RegNo));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
         if(jCheckBoxFees.isSelected()){
            try {
                PostgraduateStudent student=new PostgraduateStudent();
                jTextFieldFees.setText(student.getPaymentDetailsFromRegistrationNumber(RegNo));
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jTextFieldINTAKEMONTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldINTAKEMONTHActionPerformed

    }//GEN-LAST:event_jTextFieldINTAKEMONTHActionPerformed

    private void jButtonINSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINSERTActionPerformed
     
       String name= jTextFieldNAME.getText();
       String intake_month=jTextFieldINTAKEMONTH.getText();
       String intake_year=jTextFieldINTAKE_YEAR.getText();
       String dob=jTextFieldDOB.getText();
       String institute=jTextFieldINSTITUTE.getText();
       String course_code=jTextFieldCOURSE_CODE.getText();
       String faculty_name=jTextFieldFAULTY_NAME.getText();
       String reg_no=jTextFieldREGNO.getText();
       String qual_type=jTextFieldQUALIFICATION_TYPE.getText();
       String email=jTextFieldEMAIL.getText();
       String qual_year=jTextFieldQUALIFICATION_YEAR.getText();
       
       
        try {
            PostgraduateStudent student=new PostgraduateStudent();
            student.PGEnterValues(email,name, dob, reg_no,  faculty_name,course_code,qual_type,institute,intake_year,intake_month,qual_year );
        } catch (SQLException ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextFieldSuccessfull.setText("Student "+name+" Successfully Added!!");
        
        
        
        
        
    }//GEN-LAST:event_jButtonINSERTActionPerformed

    private void jButtonDeleteOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteOKActionPerformed
   
        PostgraduateStudent student;
        try {
            student = new PostgraduateStudent();
            String deleteRegNo=jTextFieldPGDelete.getText();
            student.PGRemove(deleteRegNo);
            jTextFieldPGDeleteSuccessfull.setText(deleteRegNo+" Successfully Removed");
        } catch (SQLException ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteOKActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
      
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        new FrontPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgraduateStudentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDeleteOK;
    private javax.swing.JButton jButtonINSERT;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JCheckBox jCheckBoxCourse_Code;
    private javax.swing.JCheckBox jCheckBoxDob;
    private javax.swing.JCheckBox jCheckBoxEmail;
    private javax.swing.JCheckBox jCheckBoxFaculty_Name;
    private javax.swing.JCheckBox jCheckBoxFees;
    private javax.swing.JCheckBox jCheckBoxIntake_Month;
    private javax.swing.JCheckBox jCheckBoxIntake_Year;
    private javax.swing.JCheckBox jCheckBoxNPSubjects;
    private javax.swing.JCheckBox jCheckBoxName;
    private javax.swing.JCheckBox jCheckBoxPractical_Subject;
    private javax.swing.JCheckBox jCheckBoxQualification_Type;
    private javax.swing.JCheckBox jCheckBoxQualified_Institute;
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
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldCOURSE_CODE;
    private javax.swing.JTextField jTextFieldCourse_Code;
    private javax.swing.JTextField jTextFieldDOB;
    private javax.swing.JTextField jTextFieldDob;
    private javax.swing.JTextField jTextFieldEMAIL;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFAULTY_NAME;
    private javax.swing.JTextField jTextFieldFaculty_Name;
    private javax.swing.JTextField jTextFieldFees;
    private javax.swing.JTextField jTextFieldINSTITUTE;
    private javax.swing.JTextField jTextFieldINTAKEMONTH;
    private javax.swing.JTextField jTextFieldINTAKE_YEAR;
    private javax.swing.JTextField jTextFieldIntake_Month;
    private javax.swing.JTextField jTextFieldIntake_Year;
    private javax.swing.JTextField jTextFieldNAME;
    private javax.swing.JTextField jTextFieldNPSubjects;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPGDelete;
    private javax.swing.JTextField jTextFieldPGDeleteSuccessfull;
    private javax.swing.JTextField jTextFieldPracticalSubjects;
    private javax.swing.JTextField jTextFieldQUALIFICATION_TYPE;
    private javax.swing.JTextField jTextFieldQUALIFICATION_YEAR;
    private javax.swing.JTextField jTextFieldQualifiation_Type;
    private javax.swing.JTextField jTextFieldQualified_Institute;
    private javax.swing.JTextField jTextFieldREGNO;
    private javax.swing.JTextField jTextFieldRegNo;
    private javax.swing.JTextField jTextFieldSuccessfull;
    // End of variables declaration//GEN-END:variables
}
