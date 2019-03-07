
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class CourseGUI extends javax.swing.JFrame {

   
    public CourseGUI() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldChangeCourseRegNo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jRadioButtonBusiness = new javax.swing.JRadioButton();
        jRadioButtonComputing = new javax.swing.JRadioButton();
        jTextFieldChangeCourseSuccessfull = new javax.swing.JTextField();
        jButtonChangeCourseOK = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldSCRegNo = new javax.swing.JTextField();
        jTextFieldSCCurrentSubject1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButtonSCSubmit = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldCSCurrentSubject2 = new javax.swing.JTextField();
        jTextFieldCSCurrentSubject3 = new javax.swing.JTextField();
        jTextFieldSCCurrentSubject4 = new javax.swing.JTextField();
        jTextFieldCSNewSubject1 = new javax.swing.JTextField();
        jTextFieldCSNewSubject2 = new javax.swing.JTextField();
        jTextFieldCSNewSubject3 = new javax.swing.JTextField();
        jTextFieldCSNewSubject4 = new javax.swing.JTextField();
        jTextFieldCSSuccessfull = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldSubjectCode = new javax.swing.JTextField();
        jTextFieldSubjectsName = new javax.swing.JTextField();
        jTextFieldCredits = new javax.swing.JTextField();
        jTextFieldLabs = new javax.swing.JTextField();
        jTextFieldExams = new javax.swing.JTextField();
        jTextFieldProjects = new javax.swing.JTextField();
        jTextFieldPDemonstration = new javax.swing.JTextField();
        jTextFieldLabAssignments = new javax.swing.JTextField();
        jTextFieldCourseCode = new javax.swing.JTextField();
        jTextFieldPayments = new javax.swing.JTextField();
        jButtonEnterPractialSubject = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldAddPSSuccessfull = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldARSubCode = new javax.swing.JTextField();
        jButtonARSubCodeEnter = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaARRegNo = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaARMarks = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldARAssignmentNumber = new javax.swing.JTextField();
        jButtonEnterAssignmentResults = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldARSuccessfull = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextFieldViewResultsRegNo = new javax.swing.JTextField();
        jTextFieldViewResultsSubCode = new javax.swing.JTextField();
        jButtonViewResultsEnter = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextFieldViewResultsExamResults = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextAreaViewResultsAssignmentNumber = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextAreaViewResultsAssignmentResults = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextFieldTSSubCode = new javax.swing.JTextField();
        jTextFieldTSName = new javax.swing.JTextField();
        jTextFieldTSCredits = new javax.swing.JTextField();
        jTextFieldTSLabs = new javax.swing.JTextField();
        jTextFieldTSExams = new javax.swing.JTextField();
        jTextFieldTSReports = new javax.swing.JTextField();
        jTextFieldTSAssignments = new javax.swing.JTextField();
        jTextFieldTSCourseCode = new javax.swing.JTextField();
        jTextFieldTSFee = new javax.swing.JTextField();
        jTextFieldTSSuccessfull = new javax.swing.JTextField();
        jButtonTSEnter = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextFieldEnrollRegNo = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jTextFieldEnrollSub1 = new javax.swing.JTextField();
        jTextFieldEnrollSub2 = new javax.swing.JTextField();
        jTextFieldEnrollSub3 = new javax.swing.JTextField();
        jTextFieldEnrollSub4 = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jTextFieldEnrollSuccessfull = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jTextFieldNumOfSub = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldResultSubCode = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaResultsRegNo = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaResultsRes = new javax.swing.JTextArea();
        jButtonResultSubjectodeEnter = new javax.swing.JButton();
        jButtonResultEnterResults = new javax.swing.JButton();
        jTextFieldResultsSuccessfull = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Courses And Subjects");

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jTabbedPane1.setForeground(new java.awt.Color(255, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Enter Registration Number");

        jTextFieldChangeCourseRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Current Course");

        jRadioButtonBusiness.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonBusiness.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButtonBusiness.setText("Bachelor of Business");

        jRadioButtonComputing.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRadioButtonComputing.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButtonComputing.setText("Bachelor Of Computing");

        jTextFieldChangeCourseSuccessfull.setEditable(false);
        jTextFieldChangeCourseSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldChangeCourseSuccessfull.setBorder(null);

        jButtonChangeCourseOK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonChangeCourseOK.setForeground(new java.awt.Color(0, 0, 255));
        jButtonChangeCourseOK.setText("Upgrade to Special Degree");
        jButtonChangeCourseOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeCourseOKActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("Change the Course of Student ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jButtonChangeCourseOK))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(105, 105, 105)
                                .addComponent(jTextFieldChangeCourseRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonBusiness)
                                    .addComponent(jRadioButtonComputing)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jTextFieldChangeCourseSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(658, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextFieldChangeCourseRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(jRadioButtonBusiness)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jRadioButtonComputing)
                .addGap(31, 31, 31)
                .addComponent(jButtonChangeCourseOK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldChangeCourseSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        jTabbedPane1.addTab("Change the Course ", jScrollPane3);

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 255));
        jLabel16.setText("Registration Number");

        jTextFieldSCRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldSCCurrentSubject1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 255));
        jLabel17.setText("Enter Current Subject's  Code");

        jButtonSCSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSCSubmit.setForeground(new java.awt.Color(51, 0, 255));
        jButtonSCSubmit.setText("Submit");
        jButtonSCSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSCSubmitActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 255));
        jLabel18.setText("Enter Newly Selected Subject's Codes");

        jTextFieldCSCurrentSubject2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCSCurrentSubject3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldSCCurrentSubject4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCSNewSubject1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCSNewSubject2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCSNewSubject3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCSNewSubject4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCSSuccessfull.setEditable(false);
        jTextFieldCSSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCSSuccessfull.setBorder(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 0, 255));
        jLabel21.setText("Change Subjects Of A Student");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldSCCurrentSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCSCurrentSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCSCurrentSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSCCurrentSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCSNewSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCSNewSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldCSNewSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldCSNewSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(125, 125, 125)
                                .addComponent(jButtonSCSubmit))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel18))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(50, 50, 50)
                        .addComponent(jTextFieldSCRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTextFieldCSSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldSCRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSCCurrentSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCSNewSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCSCurrentSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCSNewSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSCSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCSCurrentSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCSNewSubject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSCCurrentSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCSNewSubject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCSSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel3);

        jTabbedPane1.addTab("Change Subjects", jScrollPane4);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Subject Code");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Subject Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("No of Credits");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("No Of Labs");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("No Of Examination");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("No Of Projects");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("No Of Practical Demonstration");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("No Of Lab Assignments");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Course Code");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Payments");

        jTextFieldSubjectCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldSubjectCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubjectCodeActionPerformed(evt);
            }
        });

        jTextFieldSubjectsName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCredits.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldLabs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldExams.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldProjects.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldPDemonstration.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldLabAssignments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldCourseCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldPayments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonEnterPractialSubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEnterPractialSubject.setForeground(new java.awt.Color(0, 0, 255));
        jButtonEnterPractialSubject.setText("ADD");
        jButtonEnterPractialSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterPractialSubjectActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 255));
        jLabel20.setText("Add A New Practical Subject");

        jTextFieldAddPSSuccessfull.setEditable(false);
        jTextFieldAddPSSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldAddPSSuccessfull.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(544, 544, 544)
                        .addComponent(jButtonEnterPractialSubject)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSubjectsName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLabs, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldExams, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldProjects, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPDemonstration, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLabAssignments, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(367, 367, 367)
                        .addComponent(jTextFieldPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldAddPSSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 356, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel20)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSubjectsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldLabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldExams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldProjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPDemonstration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLabAssignments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldPayments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAddPSSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEnterPractialSubject)
                .addGap(87, 87, 87))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Add Practical Subject", jScrollPane1);

        jPanel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), new javax.swing.border.MatteBorder(null)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Subject code");

        jTextFieldARSubCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonARSubCodeEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonARSubCodeEnter.setForeground(new java.awt.Color(0, 0, 255));
        jButtonARSubCodeEnter.setText("Get Students List");
        jButtonARSubCodeEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonARSubCodeEnterActionPerformed(evt);
            }
        });

        jTextAreaARRegNo.setColumns(20);
        jTextAreaARRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaARRegNo.setRows(5);
        jScrollPane5.setViewportView(jTextAreaARRegNo);

        jTextAreaARMarks.setColumns(20);
        jTextAreaARMarks.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaARMarks.setRows(5);
        jScrollPane6.setViewportView(jTextAreaARMarks);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("Enter Assignment Number");

        jTextFieldARAssignmentNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonEnterAssignmentResults.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEnterAssignmentResults.setForeground(new java.awt.Color(0, 0, 255));
        jButtonEnterAssignmentResults.setText("EnterAssignment Results");
        jButtonEnterAssignmentResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterAssignmentResultsActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("Students List");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("Assignment Results");

        jTextFieldARSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldARSuccessfull.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldARSuccessfull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldARSuccessfullActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 0, 204));
        jLabel24.setText("Enter Assignment Results");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(464, 464, 464)
                                .addComponent(jLabel22))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel24)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19)
                                                .addComponent(jLabel2))
                                            .addGap(28, 28, 28)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldARAssignmentNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                .addComponent(jTextFieldARSubCode)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGap(84, 84, 84)
                                            .addComponent(jButtonARSubCodeEnter)))
                                    .addGap(48, 48, 48)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEnterAssignmentResults))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jTextFieldARSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonEnterAssignmentResults)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldARSubCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextFieldARAssignmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jButtonARSubCodeEnter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldARSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Enter Assignment Results", jPanel5);

        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 0, 204));
        jLabel30.setText("View  Results");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 204));
        jLabel31.setText("Enter Registrion Number");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 204));
        jLabel32.setText("Enter Subject Code");

        jTextFieldViewResultsRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldViewResultsSubCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonViewResultsEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonViewResultsEnter.setForeground(new java.awt.Color(0, 0, 204));
        jButtonViewResultsEnter.setText("Enter");
        jButtonViewResultsEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewResultsEnterActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 204));
        jLabel33.setText("Exam Results");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 204));
        jLabel34.setText("Assignment Results");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 204));
        jLabel35.setText("Assignment Number");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 204));
        jLabel36.setText("Assignment Results");

        jTextFieldViewResultsExamResults.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextAreaViewResultsAssignmentNumber.setColumns(20);
        jTextAreaViewResultsAssignmentNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaViewResultsAssignmentNumber.setRows(5);
        jScrollPane9.setViewportView(jTextAreaViewResultsAssignmentNumber);

        jTextAreaViewResultsAssignmentResults.setColumns(20);
        jTextAreaViewResultsAssignmentResults.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaViewResultsAssignmentResults.setRows(5);
        jScrollPane10.setViewportView(jTextAreaViewResultsAssignmentResults);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jLabel30))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addGap(203, 203, 203)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldViewResultsRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(jTextFieldViewResultsSubCode))))
                        .addGap(95, 95, 95)
                        .addComponent(jButtonViewResultsEnter))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addComponent(jTextFieldViewResultsExamResults, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(193, 193, 193)
                                        .addComponent(jLabel33)))
                                .addGap(144, 144, 144)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(425, 425, 425)
                                .addComponent(jLabel35)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel30)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jTextFieldViewResultsRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jTextFieldViewResultsSubCode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButtonViewResultsEnter)))
                .addGap(35, 35, 35)
                .addComponent(jLabel34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel33)
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldViewResultsExamResults, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("View Exam Results", jPanel7);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 0, 204));
        jLabel38.setText("Add Theoritical Subject");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 204));
        jLabel39.setText("Subjet Code");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 204));
        jLabel40.setText("Name");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 204));
        jLabel41.setText("No of Credits");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 204));
        jLabel42.setText("No of Labs");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 204));
        jLabel43.setText("No of Exams");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 204));
        jLabel44.setText("No Of Reports");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 204));
        jLabel45.setText("Fee");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 204));
        jLabel46.setText("No of Assignments");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 204));
        jLabel47.setText("Course Code");

        jTextFieldTSSubCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSCredits.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSLabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSExams.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSReports.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSAssignments.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSCourseCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSFee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTSSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonTSEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonTSEnter.setForeground(new java.awt.Color(0, 0, 204));
        jButtonTSEnter.setText("Enter");
        jButtonTSEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTSEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(148, 148, 148)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldTSExams, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jTextFieldTSReports))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jButtonTSEnter))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jTextFieldTSSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldTSLabs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jTextFieldTSSubCode, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTSName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTSCredits, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTSAssignments, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextFieldTSCourseCode)
                            .addComponent(jTextFieldTSFee))
                        .addGap(56, 56, 56))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel38)
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel46)
                    .addComponent(jTextFieldTSSubCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTSAssignments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel47)
                    .addComponent(jTextFieldTSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTSCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel45)
                    .addComponent(jTextFieldTSCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTSFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextFieldTSLabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTSExams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTSEnter)))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTSReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldTSSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Theoritical Subject", jPanel6);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 51, 255));
        jLabel48.setText("Enroll For Subjets ");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 51, 255));
        jLabel49.setText("Registration Number");

        jTextFieldEnrollRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 51, 255));
        jLabel50.setText("Enter Subject Codes");

        jTextFieldEnrollSub1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldEnrollSub2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldEnrollSub3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldEnrollSub4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSubmit.setForeground(new java.awt.Color(0, 51, 255));
        jButtonSubmit.setText("SUBMIT");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jTextFieldEnrollSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 255));
        jLabel51.setText("No Of Subjects Enroll");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEnrollRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTextFieldEnrollSub1)
                            .addComponent(jTextFieldEnrollSub2)
                            .addComponent(jTextFieldEnrollSub3)
                            .addComponent(jTextFieldEnrollSub4))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jButtonSubmit))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel51)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNumOfSub, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(jLabel48)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextFieldEnrollSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel48)
                .addGap(57, 57, 57)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextFieldEnrollRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(jTextFieldNumOfSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jTextFieldEnrollSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEnrollSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldEnrollSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEnrollSub4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubmit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldEnrollSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Enroll For Subjects", jPanel8);

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 0, 204));
        jLabel25.setText("Add Results");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 255));
        jLabel26.setText("Enter Subject Code");

        jTextFieldResultSubCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextAreaResultsRegNo.setColumns(20);
        jTextAreaResultsRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaResultsRegNo.setRows(5);
        jScrollPane7.setViewportView(jTextAreaResultsRegNo);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 255));
        jLabel28.setText("Registration Number");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("Results");

        jTextAreaResultsRes.setColumns(20);
        jTextAreaResultsRes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaResultsRes.setRows(5);
        jScrollPane8.setViewportView(jTextAreaResultsRes);

        jButtonResultSubjectodeEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonResultSubjectodeEnter.setForeground(new java.awt.Color(0, 0, 255));
        jButtonResultSubjectodeEnter.setText("Get List Of Students");
        jButtonResultSubjectodeEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultSubjectodeEnterActionPerformed(evt);
            }
        });

        jButtonResultEnterResults.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonResultEnterResults.setForeground(new java.awt.Color(0, 0, 255));
        jButtonResultEnterResults.setText("Enter Results");
        jButtonResultEnterResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultEnterResultsActionPerformed(evt);
            }
        });

        jTextFieldResultsSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel26)
                                .addGap(31, 31, 31)
                                .addComponent(jTextFieldResultSubCode, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jButtonResultSubjectodeEnter)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldResultsSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel27))
                                    .addComponent(jLabel28))
                                .addGap(90, 90, 90)
                                .addComponent(jLabel29)))))
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonResultEnterResults)
                .addGap(355, 355, 355))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel25)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jLabel28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldResultSubCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(37, 37, 37)
                        .addComponent(jButtonResultSubjectodeEnter))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addComponent(jScrollPane7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonResultEnterResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jTextFieldResultsSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Enter Results", jPanel4);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("To Front Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Course.jpg"))); // NOI18N
        jLabel37.setText("jLabel37");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(797, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSCSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSCSubmitActionPerformed
        // TODO add your handling code here:
        String CurSub2= jTextFieldCSCurrentSubject2.getText();
        String CurSub3=jTextFieldCSCurrentSubject3.getText();
        String CurSub1= jTextFieldSCCurrentSubject1.getText();
        String CurSub4=jTextFieldSCCurrentSubject4.getText();
        String NewSub1=jTextFieldCSNewSubject1.getText();
        String NewSub2=jTextFieldCSNewSubject2.getText();
        String NewSub3=jTextFieldCSNewSubject3.getText();
        String NewSub4=jTextFieldCSNewSubject4.getText();
        try {
            Subject course = new Subject();
            String RegNo=jTextFieldSCRegNo.getText();
            if(course.CheckMonthForChangeSubjects(RegNo)==0){
                jTextFieldCSSuccessfull.setText("Subjects didn't Changed.It Should be changed before a month to start semester");
            }else{
                course.ChangeSubjects(RegNo, CurSub1, CurSub2, CurSub3, CurSub4, NewSub1, NewSub2, NewSub3, NewSub4);
                jTextFieldCSSuccessfull.setText("Subject Changed Successfully");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonSCSubmitActionPerformed

    private void jButtonChangeCourseOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeCourseOKActionPerformed
       
        String RegNo=jTextFieldChangeCourseRegNo.getText();
        if(jRadioButtonBusiness.isSelected()){
            try {
                Course course=new Course();
                course.ChangeCourse(RegNo,"C0005");
                jTextFieldChangeCourseSuccessfull.setText("Student "+RegNo+" is changed course in to Bachelor of Business(Special) degree");
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(jRadioButtonComputing.isSelected()){
            try {
                Course course=new Course();
                course.ChangeCourse(RegNo,"C0004");
                jTextFieldChangeCourseSuccessfull.setText("Student "+RegNo+" is changed course in to Bachelor of Computing(Special) degree");
            } catch (SQLException ex) {
                Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButtonChangeCourseOKActionPerformed

    private void jButtonEnterPractialSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterPractialSubjectActionPerformed
    
        String name= jTextFieldSubjectsName.getText();
        String subject_code=jTextFieldSubjectCode.getText();
        String projects=jTextFieldProjects.getText();
        String payments=jTextFieldPayments.getText();
        String PDemonstration=jTextFieldPDemonstration.getText();
        String labs=jTextFieldLabs.getText();
        String lab_assignments=jTextFieldLabAssignments.getText();
        String exams=jTextFieldExams.getText();
        String credits=jTextFieldCredits.getText();
        String course_code=jTextFieldCourseCode.getText();

        try {
            Practical_Subject ps=new Practical_Subject();
            ps.PSubjectsEnterValues(subject_code,name,credits,labs,exams,projects,PDemonstration,lab_assignments,course_code,payments );
            jTextFieldAddPSSuccessfull.setText("Subject "+name+" Successfully Added!!");
        } catch (SQLException ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEnterPractialSubjectActionPerformed

    private void jTextFieldSubjectCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubjectCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubjectCodeActionPerformed

    private void jButtonARSubCodeEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonARSubCodeEnterActionPerformed
   
         
        try {
            Subject course = new Subject();
            String subCode=jTextFieldARSubCode.getText();
                String attribute[]={"Registration_Number"};
                jTextAreaARRegNo.setText(course.getStudentsListForSubject(subCode));
              
        } catch (SQLException ex) {
            Logger.getLogger(CourseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
             
            
        
       
       
        
    }//GEN-LAST:event_jButtonARSubCodeEnterActionPerformed

    private void jButtonEnterAssignmentResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterAssignmentResultsActionPerformed
     
         String subCode=jTextFieldARSubCode.getText();
        String assignmentNo=jTextFieldARAssignmentNumber.getText();
        
        String marks[]=jTextAreaARMarks.getText().split("\n");
        
      
        try {
            Subject course = new  Subject();
            String[] Array=course.getStudentsArrayForSubject(subCode,marks.length);
            jTextFieldARSuccessfull.setText("Assignment Result Successfully Added");
                course.InsertAssignmentResults(Array,marks , assignmentNo,subCode);
        } catch (SQLException ex) {
            Logger.getLogger(CourseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEnterAssignmentResultsActionPerformed

    private void jTextFieldARSuccessfullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldARSuccessfullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldARSuccessfullActionPerformed

    private void jButtonResultSubjectodeEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultSubjectodeEnterActionPerformed
     
        try {
            Subject course = new Subject();
            String subCode=jTextFieldResultSubCode.getText();
                String attribute[]={"Registration_Number"};
                jTextAreaResultsRegNo.setText(course.getStudentsListForSubject(subCode));
              
        } catch (SQLException ex) {
            Logger.getLogger(CourseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButtonResultSubjectodeEnterActionPerformed

    private void jButtonResultEnterResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultEnterResultsActionPerformed
    
        
        String subCode=jTextFieldResultSubCode.getText();
        
      
        String marks[]=jTextAreaResultsRes.getText().split("\n");
        
      
        try {
            Subject course = new  Subject();
            String[] Array=course.getStudentsArrayForSubject(subCode,marks.length);
            jTextFieldResultsSuccessfull.setText("Result Successfully Added");
                course.InsertResults(Array,marks ,subCode);
        } catch (SQLException ex) {
            Logger.getLogger(CourseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonResultEnterResultsActionPerformed

    private void jButtonViewResultsEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewResultsEnterActionPerformed
      
        String RegNo=jTextFieldViewResultsRegNo.getText();
        String SubCode=jTextFieldViewResultsSubCode.getText();
        try {
            Subject course =new Subject();
            jTextFieldViewResultsExamResults.setText(course.getExamResults(RegNo, SubCode));
            Subject course1=new Subject();
            jTextAreaViewResultsAssignmentNumber.setText(course1.getAssignmentNumber(RegNo, SubCode));
            Subject course2=new Subject();
            jTextAreaViewResultsAssignmentResults.setText(course2.getAssignmentResults(RegNo, SubCode));
        } catch (SQLException ex) {
            Logger.getLogger(CourseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonViewResultsEnterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        new FrontPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonTSEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTSEnterActionPerformed
     
        String name= jTextFieldTSName.getText();
        String subject_code=jTextFieldTSSubCode.getText();
        String reports=jTextFieldTSReports.getText();
        String payments=jTextFieldTSFee.getText();
        String labs=jTextFieldTSLabs.getText();
        String inclass_assignments=jTextFieldTSAssignments.getText();
        String exams=jTextFieldTSExams.getText();
        String credits=jTextFieldTSCredits.getText();
        String course_code=jTextFieldTSCourseCode.getText();

        try {
            Theoretical_Subject ps=new Theoretical_Subject();
            ps.TSSubjectsEnterValues(subject_code,name,credits,labs,exams,reports,inclass_assignments,course_code,payments );
            jTextFieldTSSuccessfull.setText("Subject "+name+" Successfully Added!!");
        } catch (SQLException ex) {
            Logger.getLogger(StudentGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonTSEnterActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
     
        String RegNo=jTextFieldEnrollRegNo.getText();
        String Sub1=jTextFieldEnrollSub1.getText();
        String Sub2=jTextFieldEnrollSub2.getText();
        String Sub3=jTextFieldEnrollSub3.getText();
        String Sub4=jTextFieldEnrollSub4.getText();
        String numOfSubs=jTextFieldNumOfSub.getText();
        

        try {
             Subject course = new Subject();
            course.addForSubjects(RegNo,Sub1,Sub2,Sub3,Sub4,numOfSubs);
        jTextFieldEnrollSuccessfull.setText("Sucessfully Enrolled for Given Subjects");
        } catch (SQLException ex) {
            Logger.getLogger(CourseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed
   
    
    
    
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonARSubCodeEnter;
    private javax.swing.JButton jButtonChangeCourseOK;
    private javax.swing.JButton jButtonEnterAssignmentResults;
    private javax.swing.JButton jButtonEnterPractialSubject;
    private javax.swing.JButton jButtonResultEnterResults;
    private javax.swing.JButton jButtonResultSubjectodeEnter;
    private javax.swing.JButton jButtonSCSubmit;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonTSEnter;
    private javax.swing.JButton jButtonViewResultsEnter;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButtonBusiness;
    private javax.swing.JRadioButton jRadioButtonComputing;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaARMarks;
    private javax.swing.JTextArea jTextAreaARRegNo;
    private javax.swing.JTextArea jTextAreaResultsRegNo;
    private javax.swing.JTextArea jTextAreaResultsRes;
    private javax.swing.JTextArea jTextAreaViewResultsAssignmentNumber;
    private javax.swing.JTextArea jTextAreaViewResultsAssignmentResults;
    private javax.swing.JTextField jTextFieldARAssignmentNumber;
    private javax.swing.JTextField jTextFieldARSubCode;
    private javax.swing.JTextField jTextFieldARSuccessfull;
    private javax.swing.JTextField jTextFieldAddPSSuccessfull;
    private javax.swing.JTextField jTextFieldCSCurrentSubject2;
    private javax.swing.JTextField jTextFieldCSCurrentSubject3;
    private javax.swing.JTextField jTextFieldCSNewSubject1;
    private javax.swing.JTextField jTextFieldCSNewSubject2;
    private javax.swing.JTextField jTextFieldCSNewSubject3;
    private javax.swing.JTextField jTextFieldCSNewSubject4;
    private javax.swing.JTextField jTextFieldCSSuccessfull;
    private javax.swing.JTextField jTextFieldChangeCourseRegNo;
    private javax.swing.JTextField jTextFieldChangeCourseSuccessfull;
    private javax.swing.JTextField jTextFieldCourseCode;
    private javax.swing.JTextField jTextFieldCredits;
    private javax.swing.JTextField jTextFieldEnrollRegNo;
    private javax.swing.JTextField jTextFieldEnrollSub1;
    private javax.swing.JTextField jTextFieldEnrollSub2;
    private javax.swing.JTextField jTextFieldEnrollSub3;
    private javax.swing.JTextField jTextFieldEnrollSub4;
    private javax.swing.JTextField jTextFieldEnrollSuccessfull;
    private javax.swing.JTextField jTextFieldExams;
    private javax.swing.JTextField jTextFieldLabAssignments;
    private javax.swing.JTextField jTextFieldLabs;
    private javax.swing.JTextField jTextFieldNumOfSub;
    private javax.swing.JTextField jTextFieldPDemonstration;
    private javax.swing.JTextField jTextFieldPayments;
    private javax.swing.JTextField jTextFieldProjects;
    private javax.swing.JTextField jTextFieldResultSubCode;
    private javax.swing.JTextField jTextFieldResultsSuccessfull;
    private javax.swing.JTextField jTextFieldSCCurrentSubject1;
    private javax.swing.JTextField jTextFieldSCCurrentSubject4;
    private javax.swing.JTextField jTextFieldSCRegNo;
    private javax.swing.JTextField jTextFieldSubjectCode;
    private javax.swing.JTextField jTextFieldSubjectsName;
    private javax.swing.JTextField jTextFieldTSAssignments;
    private javax.swing.JTextField jTextFieldTSCourseCode;
    private javax.swing.JTextField jTextFieldTSCredits;
    private javax.swing.JTextField jTextFieldTSExams;
    private javax.swing.JTextField jTextFieldTSFee;
    private javax.swing.JTextField jTextFieldTSLabs;
    private javax.swing.JTextField jTextFieldTSName;
    private javax.swing.JTextField jTextFieldTSReports;
    private javax.swing.JTextField jTextFieldTSSubCode;
    private javax.swing.JTextField jTextFieldTSSuccessfull;
    private javax.swing.JTextField jTextFieldViewResultsExamResults;
    private javax.swing.JTextField jTextFieldViewResultsRegNo;
    private javax.swing.JTextField jTextFieldViewResultsSubCode;
    // End of variables declaration//GEN-END:variables
}
