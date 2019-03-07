import java.sql.SQLException;

public class Faculty extends Connect_to_Database{
    String Faculty;
    String Block_No;
    
    Faculty() throws SQLException{
        makeConnection();
    }
 
    String getBlockNumberByFacultyName(String FacultyName) throws SQLException{      //Get the block number by faculty name
        String []attributes={"Block_No"};
       return(RetrieveData("select * from faculty where faculty_Name='"+FacultyName+"'",attributes));
    }
    
}
