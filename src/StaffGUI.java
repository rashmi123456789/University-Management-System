
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StaffGUI extends javax.swing.JFrame {

    
    public StaffGUI() {
        initComponents();
    }

    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldACLecId = new javax.swing.JTextField();
        jTextFieldACLectureRoom = new javax.swing.JTextField();
        jTextFieldACLectureRoomLocation = new javax.swing.JTextField();
        jTextFieldACSemester = new javax.swing.JTextField();
        jTextFieldACSubjectCode = new javax.swing.JTextField();
        jTextFieldACTimeSlot = new javax.swing.JTextField();
        jButtonACEnter = new javax.swing.JButton();
        jTextFieldACSuccessfull = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCDSubCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCDSemester = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCDLecturerName = new javax.swing.JTextField();
        jTextFieldCDLectureRoom = new javax.swing.JTextField();
        jTextFieldCDTimeSlot = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldALTSSubjectCode = new javax.swing.JTextField();
        jTextFieldALTSLabTimeSlot = new javax.swing.JTextField();
        jButtonALTSEnter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaALTSRegNo = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldALTSSuccessfull = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldASMRegNo = new javax.swing.JTextField();
        jTextFieldASMName = new javax.swing.JTextField();
        jTextFieldADMDOB = new javax.swing.JTextField();
        jTextFieldASMEmaill = new javax.swing.JTextField();
        jTextFieldASMAddress = new javax.swing.JTextField();
        jButtonASMEnter = new javax.swing.JButton();
        jTextFieldASMSuccessfull = new javax.swing.JTextField();
        jButtonExit = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Staff Members And Class Allocation");

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));
        jTabbedPane1.setForeground(new java.awt.Color(255, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 204));
        jLabel8.setText("Allocate Class");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Lecturer ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Lecture Room");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Lecture Room Location");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("Semester");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Subject Code");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Time Slot");

        jTextFieldACLecId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldACLectureRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldACLectureRoomLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldACSemester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldACSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldACSemesterActionPerformed(evt);
            }
        });

        jTextFieldACSubjectCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldACTimeSlot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonACEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonACEnter.setForeground(new java.awt.Color(0, 0, 255));
        jButtonACEnter.setText("Enter Details");
        jButtonACEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACEnterActionPerformed(evt);
            }
        });

        jTextFieldACSuccessfull.setEditable(false);
        jTextFieldACSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldACSuccessfull.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldACSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldACLecId, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(jTextFieldACLectureRoom)
                                    .addComponent(jTextFieldACLectureRoomLocation)
                                    .addComponent(jTextFieldACSemester)
                                    .addComponent(jTextFieldACSubjectCode)
                                    .addComponent(jTextFieldACTimeSlot))
                                .addGap(80, 80, 80)
                                .addComponent(jButtonACEnter))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel8)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldACLecId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldACLectureRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldACLectureRoomLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldACSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldACSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldACTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonACEnter))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldACSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Class Allocation", jPanel2);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Class Details");

        jTextFieldCDSubCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Enter Subject Code");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Enter Semester");

        jTextFieldCDSemester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Lecturer Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Lecture Room");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Time Slot");

        jTextFieldCDLecturerName.setEditable(false);
        jTextFieldCDLecturerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCDLecturerName.setBorder(null);

        jTextFieldCDLectureRoom.setEditable(false);
        jTextFieldCDLectureRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCDLectureRoom.setBorder(null);

        jTextFieldCDTimeSlot.setEditable(false);
        jTextFieldCDTimeSlot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCDTimeSlot.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jTextFieldCDLecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCDSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCDSubCode))
                                .addGap(54, 54, 54)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextFieldCDLectureRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCDTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCDSubCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldCDSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton1)
                        .addGap(72, 72, 72)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCDLectureRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCDTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCDLecturerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Class Room Details", jPanel1);

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setText("Add Lab Time Slots");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 255));
        jLabel16.setText("Enter Subject Code");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("Enter Lab Time Slots ");

        jTextFieldALTSSubjectCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldALTSLabTimeSlot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonALTSEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonALTSEnter.setForeground(new java.awt.Color(0, 51, 255));
        jButtonALTSEnter.setText("Enter");
        jButtonALTSEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonALTSEnterActionPerformed(evt);
            }
        });

        jTextAreaALTSRegNo.setColumns(20);
        jTextAreaALTSRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextAreaALTSRegNo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaALTSRegNo);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setText("Enter Students Lists");

        jTextFieldALTSSuccessfull.setEditable(false);
        jTextFieldALTSSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldALTSSuccessfull.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jTextFieldALTSSubjectCode)
                            .addComponent(jTextFieldALTSLabTimeSlot))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jTextFieldALTSSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jButtonALTSEnter))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel15)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldALTSSubjectCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldALTSLabTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonALTSEnter)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldALTSSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Lab Time", jPanel3);

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 255));
        jLabel19.setText("Add Staff Members");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("Registration Number");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("Name");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("Data Of Birth");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("Email");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 255));
        jLabel24.setText("Address");

        jTextFieldASMRegNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldASMName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldADMDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldASMEmaill.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTextFieldASMAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButtonASMEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonASMEnter.setForeground(new java.awt.Color(0, 0, 255));
        jButtonASMEnter.setText("Enter");
        jButtonASMEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonASMEnterActionPerformed(evt);
            }
        });

        jTextFieldASMSuccessfull.setEditable(false);
        jTextFieldASMSuccessfull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldASMSuccessfull.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel19))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(185, 185, 185)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldASMRegNo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTextFieldASMName)
                            .addComponent(jTextFieldADMDOB)
                            .addComponent(jTextFieldASMEmaill)
                            .addComponent(jTextFieldASMAddress))
                        .addGap(134, 134, 134)
                        .addComponent(jButtonASMEnter))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jTextFieldASMSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextFieldASMRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldASMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldADMDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldASMEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldASMAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonASMEnter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jTextFieldASMSuccessfull, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Add Staff Member", jPanel4);

        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(0, 0, 204));
        jButtonExit.setText("To Front Page ");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecturer.jpg"))); // NOI18N
        jLabel25.setText("jLabel25");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jButtonExit)))
                .addContainerGap(1118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String subCode=jTextFieldCDSubCode.getText();
        String semester=jTextFieldCDSemester.getText();
        try {
            Staff staff=new Staff();
            Staff staff3=new Staff();
            jTextFieldCDLecturerName.setText(staff.getLecturerNameFromID(staff3.getLectureInfo(subCode, semester,"Lecture_Id")));
            Staff staff1=new Staff();
            jTextFieldCDLectureRoom.setText(staff1.getLectureInfo(subCode, semester, "Lecture_Room"));
            Staff staff2=new Staff();
           jTextFieldCDTimeSlot.setText(staff2.getLectureInfo(subCode, semester, "Time_Slot"));
        } catch (SQLException ex) {
            Logger.getLogger(StaffGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldACSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldACSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldACSemesterActionPerformed

    private void jButtonACEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonACEnterActionPerformed
        
        String LecId=jTextFieldACLecId.getText();
        String LecRoom=jTextFieldACLectureRoom.getText();
        String Location=jTextFieldACLectureRoomLocation.getText();
        String Semester=jTextFieldACSemester.getText();
        String subCode=jTextFieldACSubjectCode.getText();
        String TimeSlot=jTextFieldACTimeSlot.getText();
        
        try {
            Staff staff=new Staff();
            staff.AddLectureInfo(LecId, LecRoom, Location, Semester, subCode, TimeSlot);
            jTextFieldACSuccessfull.setText("Class details Sucessfully Entered");
        } catch (SQLException ex) {
            Logger.getLogger(StaffGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonACEnterActionPerformed

    private void jButtonALTSEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonALTSEnterActionPerformed
       
        String studentList[]=jTextAreaALTSRegNo.getText().split("\n");
        String SubCode=jTextFieldALTSSubjectCode.getText();
        String TimeSlot=jTextFieldALTSLabTimeSlot.getText();
        
       try {
            Staff staff = new Staff();
            staff.AddLabTimeSlot(studentList, SubCode, TimeSlot);
            jTextFieldALTSSuccessfull.setText("Lab Time Slots Successfully Added!!");
        } catch (SQLException ex) {
            Logger.getLogger(StaffGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonALTSEnterActionPerformed

    private void jButtonASMEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonASMEnterActionPerformed
  
        String RegNo=jTextFieldASMRegNo.getText();
        String name=jTextFieldASMName.getText();
        String Dob=jTextFieldADMDOB.getText();
        String email=jTextFieldASMEmaill.getText();
        String address=jTextFieldASMAddress.getText();
        
        try {
            Staff staff =new Staff();
            staff.AddStaffMembers(RegNo, name, Dob, email, address);
            jTextFieldASMSuccessfull.setText(name+" successfully added!!");
        } catch (SQLException ex) {
            Logger.getLogger(StaffGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonASMEnterActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
   
        new FrontPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonACEnter;
    private javax.swing.JButton jButtonALTSEnter;
    private javax.swing.JButton jButtonASMEnter;
    private javax.swing.JButton jButtonExit;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaALTSRegNo;
    private javax.swing.JTextField jTextFieldACLecId;
    private javax.swing.JTextField jTextFieldACLectureRoom;
    private javax.swing.JTextField jTextFieldACLectureRoomLocation;
    private javax.swing.JTextField jTextFieldACSemester;
    private javax.swing.JTextField jTextFieldACSubjectCode;
    private javax.swing.JTextField jTextFieldACSuccessfull;
    private javax.swing.JTextField jTextFieldACTimeSlot;
    private javax.swing.JTextField jTextFieldADMDOB;
    private javax.swing.JTextField jTextFieldALTSLabTimeSlot;
    private javax.swing.JTextField jTextFieldALTSSubjectCode;
    private javax.swing.JTextField jTextFieldALTSSuccessfull;
    private javax.swing.JTextField jTextFieldASMAddress;
    private javax.swing.JTextField jTextFieldASMEmaill;
    private javax.swing.JTextField jTextFieldASMName;
    private javax.swing.JTextField jTextFieldASMRegNo;
    private javax.swing.JTextField jTextFieldASMSuccessfull;
    private javax.swing.JTextField jTextFieldCDLectureRoom;
    private javax.swing.JTextField jTextFieldCDLecturerName;
    private javax.swing.JTextField jTextFieldCDSemester;
    private javax.swing.JTextField jTextFieldCDSubCode;
    private javax.swing.JTextField jTextFieldCDTimeSlot;
    // End of variables declaration//GEN-END:variables
}
