-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2019 at 07:19 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nsbm`
--

-- --------------------------------------------------------

--
-- Table structure for table `assignment_results`
--

CREATE TABLE `assignment_results` (
  `Registration_Number` varchar(6) NOT NULL,
  `Assignment_Number` varchar(6) NOT NULL,
  `Subject_Code` varchar(6) NOT NULL,
  `Result` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assignment_results`
--

INSERT INTO `assignment_results` (`Registration_Number`, `Assignment_Number`, `Subject_Code`, `Result`) VALUES
('R00001', 'A0001', 'S0003', 'S'),
('R00001', 'A0001', 'S0011', 'A'),
('R00002', 'A0001', 'S0005', 'B'),
('R00003', 'A0001', 'S0003', 'A'),
('R00003', 'A0002', 'S0003', 'E'),
('R00003', 'A0002', 'S0014', 'A-'),
('R00003', 'A0003', 'S0003', 'A-'),
('R00003', 'A0003', 'S0018', 'B+'),
('R00003', 'A0004', 'S0003', 'A-'),
('R00003', 'A0005', 'S0003', 'B'),
('R00006', 'A0001', 'S0008', 'C');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `Course_Code` varchar(5) NOT NULL,
  `Course_Name` varchar(50) NOT NULL,
  `No_Of_Years` int(1) NOT NULL,
  `Faculty_Name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`Course_Code`, `Course_Name`, `No_Of_Years`, `Faculty_Name`) VALUES
('C0001', 'Bachelor of Computing', 3, 'School Of Computing'),
('C0002', 'Bachelor of Business', 3, 'school of Business'),
('C0003', 'Bachelor of Engineering', 4, 'school of Engineering'),
('C0004', 'Bachelor of Computing(Special)', 4, 'school of Computing'),
('C0005', 'Bachelor of Business(Special)', 4, 'school of Business'),
('C0006', 'Masters of Computing', 2, 'school of Computing'),
('C0007', 'Masters of Business', 2, 'school of Business'),
('C0008', 'Masters of Engineering', 2, 'school of Engineering');

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `faculty_Name` varchar(50) NOT NULL,
  `Block_No` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`faculty_Name`, `Block_No`) VALUES
('school of Business', 'B1'),
('school of Computing', 'A1'),
('school of Engineering', 'A1');

-- --------------------------------------------------------

--
-- Table structure for table `lab_info`
--

CREATE TABLE `lab_info` (
  `Instructor_Id` varchar(6) NOT NULL,
  `Lab_No` int(2) NOT NULL,
  `Subject_Code` varchar(6) NOT NULL,
  `Semester` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lab_info`
--

INSERT INTO `lab_info` (`Instructor_Id`, `Lab_No`, `Subject_Code`, `Semester`) VALUES
('I0001', 1, 'S0001', 1),
('I0002', 1, 'S0002', 1),
('I0003', 3, 'S0003', 1),
('I0004', 3, 'S0004', 2),
('I0001', 2, 'S0006', 2),
('I0002', 1, 'S0005', 1);

-- --------------------------------------------------------

--
-- Table structure for table `lab_time`
--

CREATE TABLE `lab_time` (
  `Student_Id` varchar(6) NOT NULL,
  `Subject_Code` varchar(6) NOT NULL,
  `Lab_Time_Slot` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lab_time`
--

INSERT INTO `lab_time` (`Student_Id`, `Subject_Code`, `Lab_Time_Slot`) VALUES
('R00001', 'S0001', '10.00am-12.00pm'),
('R00002', 'S0005', '12.00am-1.00pm'),
('R00003', 'S0004', '10.00am-12.00pm'),
('R00004', 'S0007', '12.00am-1.00pm');

-- --------------------------------------------------------

--
-- Table structure for table `lecture_info`
--

CREATE TABLE `lecture_info` (
  `Lecture_Id` varchar(5) NOT NULL,
  `Lecture_Room` varchar(10) NOT NULL,
  `Location` varchar(50) NOT NULL,
  `Semester` int(1) NOT NULL,
  `Time_Slot` varchar(20) NOT NULL,
  `Subject_Code` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecture_info`
--

INSERT INTO `lecture_info` (`Lecture_Id`, `Lecture_Room`, `Location`, `Semester`, `Time_Slot`, `Subject_Code`) VALUES
('L0001', 'R1', 'A1', 1, '10.00am-12.00am', 'S0011'),
('L0002', 'R2', 'A1', 1, '12.00am-2.00pm', 'S0012'),
('L0003', 'R3', '	B1', 2, '10.00am-12.00am', 'S0005'),
('L0004', 'R8', 'A1', 2, '2.00am-4.00pm', 'S0008');

-- --------------------------------------------------------

--
-- Table structure for table `none_practical_subjects`
--

CREATE TABLE `none_practical_subjects` (
  `Subject_Code` varchar(5) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `No_Of_Credits` int(1) NOT NULL,
  `No_Of_Labs` int(2) NOT NULL,
  `No_Of_Examinations` int(2) NOT NULL,
  `No_Of_Reports` int(2) NOT NULL,
  `No_Of_Inclass_Assignments` int(2) NOT NULL,
  `Course_Code` varchar(5) NOT NULL,
  `Fee` varchar(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `none_practical_subjects`
--

INSERT INTO `none_practical_subjects` (`Subject_Code`, `Name`, `No_Of_Credits`, `No_Of_Labs`, `No_Of_Examinations`, `No_Of_Reports`, `No_Of_Inclass_Assignments`, `Course_Code`, `Fee`) VALUES
('S0011', 'Computer Systems', 2, 3, 2, 3, 5, 'C0001', '2500'),
('S0012', 'Statistics', 3, 2, 4, 3, 5, 'C0001', '3000'),
('S0013', 'Mathematical Methods', 3, 2, 4, 3, 5, 'C0001', '3500'),
('S0014', 'Operating Systems II', 2, 3, 3, 2, 6, 'C0004', '2500'),
('S0015', 'Computer Networks', 2, 3, 4, 4, 6, 'C0006', '4000'),
('S0016', 'Algorithms II', 3, 3, 4, 4, 1, 'C0006', '2500'),
('S0017', 'Computer Systems', 2, 3, 2, 3, 5, 'C0001', '2500'),
('S0018', 'Advance Programming', 3, 4, 5, 2, 5, 'C0004', '3000'),
('S0021', 'Artificial Intelligence', 3, 4, 5, 4, 3, 'C0001', '2500');

-- --------------------------------------------------------

--
-- Table structure for table `postgraduate_student`
--

CREATE TABLE `postgraduate_student` (
  `Registration_Number` varchar(6) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Intake_Month` varchar(10) DEFAULT NULL,
  `Date_Of_Birth` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Qualification_Type` varchar(50) DEFAULT NULL,
  `Institute` varchar(50) DEFAULT NULL,
  `Qualified_Year` varchar(4) DEFAULT NULL,
  `faculty_Name` varchar(50) DEFAULT NULL,
  `Course_Code` varchar(5) DEFAULT NULL,
  `Intake_Year` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgraduate_student`
--

INSERT INTO `postgraduate_student` (`Registration_Number`, `Name`, `Intake_Month`, `Date_Of_Birth`, `Email`, `Qualification_Type`, `Institute`, `Qualified_Year`, `faculty_Name`, `Course_Code`, `Intake_Year`) VALUES
('R00009', 'K.M.Nandani', 'February', '1992-08-23', 'nandani@gmail.com', 'BCS (Hons) Computer Science', 'University Of Colombo School Of Computing', '2004', 'school of Computing', 'C0006', '2017'),
('R00010', 'W.S. Randika Dissanayaka', 'February', '1993-02-04', 'rasndika@gmail.com', 'BCS (Hons)  Machanical Engineering', 'University Of Moratuwa', '2005', 'school of Engineering', 'C0008', '2017'),
('R00011', 'R.A.S Kasun Silva', 'July', '1991-01-09', 'kasun@gmail.com', 'BCS (Hons) Business Administration', 'Saegis Campus Nugegoda', '2005', 'school of Business', 'C0007', '2017'),
('R00020', 'K.V Jayarathne', 'July', '1995-02-10', 'jayarathne@gmail.com', 'BCS(Hons) Computer Sciene', 'NSBM', '2015', 'school of Computing', 'C0006', '2017'),
('R00028', 'H.G.D Madhusara', 'February', '1992-10-10', 'dineth@gmail.com', 'BCS(Software Engineering)', 'school of Coputing', '2015', 'school of Computing', 'C0001', '2017');

-- --------------------------------------------------------

--
-- Table structure for table `practical_subject`
--

CREATE TABLE `practical_subject` (
  `Subject_Code` varchar(5) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `No_Of_Credits` varchar(1) NOT NULL,
  `No_Of_Labs` varchar(1) NOT NULL,
  `No_of_Examinations` varchar(2) NOT NULL,
  `No_Of_Projects` varchar(2) NOT NULL,
  `No_Of_Practical_Demonstrations` varchar(2) NOT NULL,
  `No_Of_Lab_Assignments` varchar(2) NOT NULL,
  `Course_Code` varchar(5) NOT NULL,
  `Fee` varchar(10) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `practical_subject`
--

INSERT INTO `practical_subject` (`Subject_Code`, `Name`, `No_Of_Credits`, `No_Of_Labs`, `No_of_Examinations`, `No_Of_Projects`, `No_Of_Practical_Demonstrations`, `No_Of_Lab_Assignments`, `Course_Code`, `Fee`) VALUES
('S0001', 'Computer Programming', '3', '7', '2', '3', '5', '4', 'C0001', '2500'),
('S0002', 'Programming Paradigms', '2', '3', '2', '1', '6', '4', 'C0001', '3000'),
('S0003', 'Computer Architehture', '3', '4', '2', '2', '5', '4', 'C0004', '3500'),
('S0004', 'Operating Systems', '3', '5', '1', '2', '8', '4', 'C0004', '4000'),
('S0005', 'Business IT', '2', '3', '2', '1', '4', '6', 'C0002', '4000'),
('S0006', 'Entrepreneurship', '3', '2', '6', '1', '5', '4', 'C0007', '3500'),
('S0007', 'Computer Aided Design', '3', '3', '5', '2', '6', '4', 'C0003', '3000'),
('S0008', 'Computer Aided Manufacture', '3', '2', '4', '3', '5', '5', 'C0003', '4000'),
('S0009', 'Software Engineering', '2', '4', '3', '1', '5', '6', 'C0006', '4000'),
('S0010', 'Networking', '2', '4', '5', '2', '4', '7', 'C0006', '3500'),
('S0019', 'Operating Systems(iii)', '3', '4', '5', '3', '4', '3', 'C0001', '3500'),
('S0023', 'Mathematical Methods(II)', '3', '5', '4', '5', '7', '6', 'C0001', '3500'),
('S0024', 'Business Statistics', '3', '5', '4', '3', '5', '2', 'C0002', '2500'),
('S0025', 'Programming III', '3', '2', '4', '4', '3', '2', 'C0001', 'C0001');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `Registration_Number` varchar(5) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Date_Of_Birth` date NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`Registration_Number`, `Name`, `Date_Of_Birth`, `Email`, `Address`) VALUES
('I0001', 'G.J Sumanasekara', '1990-01-23', 'gjs@gmail.com', '46/7,gothatuwa,Angoda'),
('I0002', 'Y.U Perera', '1983-05-19', 'yuperera@gmail.com', '290/34,Lake Rd,Boralasgamuwa'),
('I0003', 'P.K. De Silva', '1982-11-20', 'pks@gmail.com', '89/23,Cocowaththa,Badulla'),
('I0004', 'K.L. Bandara', '1979-04-22', 'bandaraa@gmail.com', '29/4,Palawatta,Baththaramulla'),
('I0005', 'D.L Ranaweera', '1972-07-10', 'ranaweera@gmail.com', '34/89,Eldeniya,Kadawatha'),
('L0001', 'W.K Perera', '1969-04-02', 'perere@gmail.com', '34/5, Susithapura,Malae'),
('L0002', 'K.P Sirisena', '1970-02-16', 'sirisena@gmail.com', '45/3,Mulleriyawa,Angoda'),
('L0003', 'A.V Amith Siva', '1975-04-26', 'amith@gmail.com', '234/3,Thalawathugoda,Pitakotte'),
('L0004', 'S.H Leelarathne', '1965-04-23', 'leelarathne@gmail.com', '34/2,Kalalgoda,Maharagama'),
('L0005', 'C.J Jagath Vitharana', '1983-08-16', 'jagath@gmail.com', '34/7,Sinhapura,Thalangama'),
('L0006', 'P.R.H Gayan', '1989-09-02', 'gayan@gmail.com', '56/78,dehiwala.ranwala'),
('L0007', 'P.Y Senarath', '1992-01-23', 'senarath@gmail.com', '89/2,Kosgama,Hbarana');

-- --------------------------------------------------------

--
-- Table structure for table `student_results`
--

CREATE TABLE `student_results` (
  `Registration_Number` varchar(6) NOT NULL,
  `Subject_Code` varchar(6) NOT NULL,
  `Results` varchar(1) DEFAULT NULL,
  `Payment` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_results`
--

INSERT INTO `student_results` (`Registration_Number`, `Subject_Code`, `Results`, `Payment`) VALUES
('R00001', 'S0003', '', 'Paid'),
('R00001', 'S0011', 'S', 'Paid'),
('R00002', 'S0005', 'B', 'Paid'),
('R00003', 'S0003', 'A', 'Paid'),
('R00003', 'S0014', 'A', 'Not Paid'),
('R00003', 'S0018', 'B', 'Paid'),
('R00006', 'S0008', 'D', 'Paid'),
('R00009', 'S0009', 'A', 'Not Paid'),
('R00009', 'S0010', 'C', 'Paid'),
('R00009', 'S0015', 'B', 'Not Paid'),
('R00009', 'S0016', 'A', 'Payed'),
('R00027', 'S0008', NULL, NULL),
('R00027', 'S0010', NULL, NULL),
('R00027', 'S0011', 'B', NULL),
('R00027', 'S0016', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate_student`
--

CREATE TABLE `undergraduate_student` (
  `Registration_Number` varchar(10) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Intake_Month` varchar(10) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Date_Of_Birth` varchar(10) DEFAULT NULL,
  `AL_Result` varchar(50) DEFAULT NULL,
  `Rank` varchar(6) DEFAULT NULL,
  `Faculty_Name` varchar(50) DEFAULT NULL,
  `Course_Code` varchar(5) DEFAULT NULL,
  `Intake_Year` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduate_student`
--

INSERT INTO `undergraduate_student` (`Registration_Number`, `Name`, `Intake_Month`, `Email`, `Date_Of_Birth`, `AL_Result`, `Rank`, `Faculty_Name`, `Course_Code`, `Intake_Year`) VALUES
('R00001', 'W.A.R Shehana', 'February', 'rashmishehana@gmail.com', '1997-01-27', 'Mathematics = B / Physics = B / Chemistry ', '1642', 'school of Computing', 'C0004', '2017'),
('R00002', 'P.R.H. Gayan Priyadarshana', 'July', 'hewage@gmail.com', '1994-10-14', 'Economics = A /  Business Studies=A  / Accounting ', '9767', 'school of Business', 'C0002', '2017'),
('R00003', 'A.V.P Sewwandi', 'February', 'piyumika@gmail.com', '1996-05-10', 'Mathematics= B / Physics =B / Chemistry = B', '1908', 'school of Computing', 'C0004', '2017'),
('R00004', 'P.H.P.I.D.Madhusanka', 'July', 'ishara@gmail.com', '1996-07-20', 'Mathematics= a / Physics =B / Chemistry = a', '2343', 'school of Engineering', 'C0003', '2017'),
('R00005', 'G.V.H.A Chandrasena', 'February', 'heshan@gmail.com', '1994-07-18', 'Economics= B / Business Studies =B / Accounting = ', '6568', 'school of Business', 'C0005', '2017'),
('R00006', 'W.A.Nirmani Umasha', 'July', 'nirmani@gmail.com', '2001-05-21', 'Mathematics= B / Physics =B / Chemistry = B', '1908', 'school of Engineering', 'C0003', '2017'),
('R00007', 'P.R.H. Gayani Priyadarshani', 'July', 'gayani@gmail.com', '1995-11-14', 'Economics = A /  Business Studies=A  / Accounting ', '8232', 'school of Business', 'C0002', '2017'),
('R00008', 'S.D.F Tharushi', 'February', 'tharushi@gmail.com', '1996-03-19', 'Mathematics= B / Physics =B / Chemistry = B', '2787', 'school of Computing', 'C0004', '2017'),
('R00021', 'W.P Wickramasingha', 'Februrary', 'wickrmasingha@gmail.com', '1994-04-23', 'Mathematics =A/ Physics =B /Chemistry =C', '545', 'school of Computing', 'C0003', '2017'),
('R00024', 'K.K Samaraweera', 'July', 'samaraweera@gmail.com', '1997-01-26', 'Mathematics =B/ Physics =C / Chemistry A', '1545', 'school of Computing', 'C0004', '2017'),
('R00027', 'w.a.r shehana', 'June', 'rashmi@gmail.com', '1997/01/27', 'Maths A / Physics B /IT C', '23', 'School Of Computing', 'C0001', '2018'),
('R00028', 'K.K.Chandrasena', 'July', 'chandrasena@gmail.com', '1996-10-28', 'Physics=A/Mathematics=B/ Chemistry=A', '3423', 'school of Computing', 'C0004', '2017'),
('R00030', 'H.B Silva', 'Februrary', 'silva@gmail.com', '1989-02-28', 'Mathematics A / Physics A / Chemistry A', '232', 'school of Engineering', 'C0003', '2018');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assignment_results`
--
ALTER TABLE `assignment_results`
  ADD PRIMARY KEY (`Registration_Number`,`Assignment_Number`,`Subject_Code`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`Course_Code`),
  ADD KEY `F3` (`Faculty_Name`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`faculty_Name`);

--
-- Indexes for table `lab_time`
--
ALTER TABLE `lab_time`
  ADD PRIMARY KEY (`Student_Id`,`Subject_Code`);

--
-- Indexes for table `lecture_info`
--
ALTER TABLE `lecture_info`
  ADD PRIMARY KEY (`Lecture_Id`,`Semester`,`Subject_Code`);

--
-- Indexes for table `none_practical_subjects`
--
ALTER TABLE `none_practical_subjects`
  ADD PRIMARY KEY (`Subject_Code`),
  ADD KEY `Course_Code` (`Course_Code`);

--
-- Indexes for table `postgraduate_student`
--
ALTER TABLE `postgraduate_student`
  ADD PRIMARY KEY (`Registration_Number`),
  ADD KEY `F5` (`faculty_Name`),
  ADD KEY `F7` (`Course_Code`);

--
-- Indexes for table `practical_subject`
--
ALTER TABLE `practical_subject`
  ADD PRIMARY KEY (`Subject_Code`),
  ADD KEY `F1` (`Course_Code`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`Registration_Number`);

--
-- Indexes for table `student_results`
--
ALTER TABLE `student_results`
  ADD PRIMARY KEY (`Registration_Number`,`Subject_Code`);

--
-- Indexes for table `undergraduate_student`
--
ALTER TABLE `undergraduate_student`
  ADD PRIMARY KEY (`Registration_Number`),
  ADD KEY `F4` (`Faculty_Name`),
  ADD KEY `F6` (`Course_Code`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `F3` FOREIGN KEY (`Faculty_Name`) REFERENCES `faculty` (`faculty_Name`);

--
-- Constraints for table `postgraduate_student`
--
ALTER TABLE `postgraduate_student`
  ADD CONSTRAINT `F5` FOREIGN KEY (`faculty_Name`) REFERENCES `faculty` (`faculty_Name`),
  ADD CONSTRAINT `F7` FOREIGN KEY (`Course_Code`) REFERENCES `course` (`Course_Code`);

--
-- Constraints for table `practical_subject`
--
ALTER TABLE `practical_subject`
  ADD CONSTRAINT `F1` FOREIGN KEY (`Course_Code`) REFERENCES `course` (`Course_Code`);

--
-- Constraints for table `undergraduate_student`
--
ALTER TABLE `undergraduate_student`
  ADD CONSTRAINT `F4` FOREIGN KEY (`Faculty_Name`) REFERENCES `faculty` (`faculty_Name`),
  ADD CONSTRAINT `F6` FOREIGN KEY (`Course_Code`) REFERENCES `course` (`Course_Code`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
