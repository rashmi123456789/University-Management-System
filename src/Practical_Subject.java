
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rashmi Shehana
 */
public class Practical_Subject extends Subject{
    Practical_Subject() throws SQLException{
        makeConnection();
    }
    
    //add a practical subject
    
    void PSubjectsEnterValues(String SubjectCode,String name, String credits, String labs, String exams,String projects,String PDemonstrations,String LabAssignment,String CourseCode,String Fee ) throws SQLException{
       InsertData("Insert into practical_subject (Subject_Code,Name,No_Of_Credits,No_Of_Labs,No_of_Examinations,No_Of_Projects,No_Of_Practical_Demonstrations,No_Of_Lab_Assignments,Course_Code,Fee) Values('"+SubjectCode+"','"+name+"','"+credits+"','"+labs+"','"+exams+"','"+projects+"','"+PDemonstrations+"','"+LabAssignment+"','"+CourseCode+"','"+Fee+"');");
   }
    
    //get practical subjet student do by reg number
    
     String getPracticalSubjectsNamesFromRegistrationNumber(String RegNo) throws SQLException{
        String []attributes={"Name"};
       return(RetrieveData("select practical_subject.Name from practical_subject,student_results where student_results.Registration_Number='"+RegNo+"' and student_results.Subject_Code=practical_subject.Subject_Code",attributes));
    }
    
}
