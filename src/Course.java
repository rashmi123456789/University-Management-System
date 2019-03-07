
import java.sql.SQLException;

public class Course extends Students{
    
    
    Course() throws SQLException{
        makeConnection();
    }
    void ChangeCourse(String RegNo,String Course_Code) throws SQLException{     // change cources of students
        InsertData("update undergraduate_student set Course_Code= '"+Course_Code+"' where Registration_Number='"+RegNo+"'");
    }
     
   
}