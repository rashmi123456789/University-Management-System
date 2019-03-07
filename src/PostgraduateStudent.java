
import java.sql.SQLException;


public class PostgraduateStudent extends Students{

    public PostgraduateStudent() throws SQLException {
        makeConnection();
    }
    
    String getPGDetailsFromRegistrationNumber(String RegNo,String attribute) throws SQLException{  //get postgraduate student's details from registration number
        String []attributes={attribute};
       return(RetrieveData("select "+attribute+" from Postgraduate_student where Registration_Number='"+RegNo+"'",attributes));
    }
    
    //Enter details for postgraduate studnets
      void PGEnterValues(String Email,String name, String DOB, String RegNo, String FCode,String CCode,String QualType,String Institite,String IntakeYear,String IntakeMonth,String Qualified_Year ) throws SQLException{
       InsertData("Insert into Postgraduate_student (Email,Name,Date_Of_Birth,Registration_Number,Faculty_Name,Course_Code,Qualification_Type,Institute,Intake_Year,Intake_Month,Qualified_Year) Values('"+Email+"','"+name+"','"+DOB+"','"+RegNo+"','"+FCode+"','"+CCode+"','"+QualType+"','"+Institite+"','"+IntakeYear+"','"+IntakeMonth+"','"+Qualified_Year+"');");
   }
      
     void PGRemove(String RegNo) throws SQLException{   //remove a postgraduate student
          RemoveData("Delete from postgraduate_student where Registration_Number='"+RegNo+"';");
   }
      
    
}
