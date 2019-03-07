
import java.sql.SQLException;


public class Students extends Connect_to_Database{
    
    
    Students() throws SQLException{
        makeConnection();
    }
 
      //get payments detais from registration number
   
    String getPaymentDetailsFromRegistrationNumber(String RegNo) throws SQLException{
        String []attributes={"sum(Fee)"};
        int PracticalSubFee=0;
        String practicalFeeArray[]=RetrieveDataasArray("SELECT sum(Fee) from practical_subject, student_results where student_results.Subject_Code=practical_subject.Subject_Code and student_results.Registration_Number='"+RegNo+"'",attributes,4);
        int i;
        for(i=0;i<practicalFeeArray.length;i++){
            PracticalSubFee=PracticalSubFee+Integer.parseInt((practicalFeeArray[i] ==null)?"0":practicalFeeArray[i] );
        }
        
        int NonePracticalSubFee=0;
        String NonepracticalFeeArray[]=RetrieveDataasArray("SELECT sum(Fee) from none_practical_subjects, student_results where student_results.Subject_Code=none_practical_subjects.Subject_Code and student_results.Registration_Number='"+RegNo+"'",attributes,4);
        int j;
        for(j=0;j<NonepracticalFeeArray.length;j++){
            NonePracticalSubFee=NonePracticalSubFee+Integer.parseInt((NonepracticalFeeArray[j] ==null)?"0":NonepracticalFeeArray[j] );
        }
        
      
       return(Integer.toString(PracticalSubFee+NonePracticalSubFee));
    }
    
      
   
}