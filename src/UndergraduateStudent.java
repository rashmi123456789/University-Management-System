
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
public class UndergraduateStudent extends Students{

    public UndergraduateStudent() throws SQLException {
        makeConnection();
    }
    
    //get details of undergraduate student by registration number
    String getDetailsFromRegistrationNumber(String RegNo,String attribute) throws SQLException{
        String []attributes={attribute};
       return(RetrieveData("select "+ attribute + " from Undergraduate_student where Registration_Number='"+RegNo+"'",attributes));
    }
  
    
    //add a undergraduate student
    
      void EnterValues(String Email,String name, String DOB, String RegNo, String FCode,String CCode,String ALResult,String Rank,String IntakeYear,String IntakeMonth ) throws SQLException{
       InsertData("Insert into undergraduate_student (Email,Name,Date_Of_Birth,Registration_Number,Faculty_Name,Course_Code,AL_Result,Rank,Intake_Year,Intake_Month) Values('"+Email+"','"+name+"','"+DOB+"','"+RegNo+"','"+FCode+"','"+CCode+"','"+ALResult+"','"+Rank+"','"+IntakeYear+"','"+IntakeMonth+"');");
   }
      
      //remove n undergraduate student
      
      void Remove(String RegNo) throws SQLException{
          RemoveData("Delete from Undergraduate_student where Registration_Number='"+RegNo+"';");
   }
}
