
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
public class Theoretical_Subject extends Subject{

    public Theoretical_Subject() throws SQLException {
        makeConnection();
    }
    
    //add a new theoretical subject
    
    void TSSubjectsEnterValues(String SubjectCode,String name, String credits, String labs, String exams,String Reports,String InclassAssignment,String CourseCode,String Fee ) throws SQLException{
       InsertData("Insert into none_practical_subjects (Subject_Code,Name,No_Of_Credits,No_Of_Labs,No_Of_Examinations,No_Of_Reports,No_Of_Inclass_Assignments,Course_Code,Fee) Values('"+SubjectCode+"','"+name+"','"+credits+"','"+labs+"','"+exams+"','"+Reports+"','"+InclassAssignment+"','"+CourseCode+"','"+Fee+"');");
   }
    
    //add a new none practical subject
    
 String getNonePracticalSubjectsNamesFromRegistrationNumber(String RegNo) throws SQLException{
        String []attributes={"Name"};
       return(RetrieveData("select none_practical_subjects.Name from none_practical_subjects,student_results where student_results.Registration_Number='"+RegNo+"' and student_results.Subject_Code=none_practical_subjects.Subject_Code",attributes));
    }
    
    
    
    
    
}
