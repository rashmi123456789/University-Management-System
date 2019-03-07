
import java.sql.SQLException;


public class Payments extends Students {
    Payments() throws SQLException{
        makeConnection();
    }
   
    String getSubjectsPaymentsFromRegistrationNumber(String RegNo) throws SQLException{    //get payments for subjects
        String []attributes={"Fee"};
       return(RetrieveData("(SELECT Fee from practical_subject, student_results where student_results.Subject_Code=practical_subject.Subject_Code and student_results.Registration_Number='"+RegNo+"') Union All (SELECT Fee from none_practical_subjects, student_results where student_results.Subject_Code=none_practical_subjects.Subject_Code and student_results.Registration_Number='"+RegNo+"' )",attributes));
    }
    String getDonePaymentFroomRegistrationNumber(String RegNo) throws SQLException{   //get done payments
       
         String []attributes={"sum(Fee)"};
        int PracticalSubFee=0;
        String practicalFeeArray[]=RetrieveDataasArray("SELECT sum(Fee) from practical_subject, student_results where student_results.Subject_Code=practical_subject.Subject_Code and Payment='Paid' and student_results.Registration_Number='"+RegNo+"'",attributes,4);
        int i;
        for(i=0;i<practicalFeeArray.length;i++){
            PracticalSubFee=PracticalSubFee+Integer.parseInt((practicalFeeArray[i] ==null)?"0":practicalFeeArray[i] );
        }
        
        int NonePracticalSubFee=0;
        String NonepracticalFeeArray[]=RetrieveDataasArray("SELECT sum(Fee) from none_practical_subjects, student_results where student_results.Subject_Code=none_practical_subjects.Subject_Code and Payment='Paid' and student_results.Registration_Number='"+RegNo+"'",attributes,4);
        int j;
        for(j=0;j<NonepracticalFeeArray.length;j++){
            NonePracticalSubFee=NonePracticalSubFee+Integer.parseInt((NonepracticalFeeArray[j] ==null)?"0":NonepracticalFeeArray[j] );
        }
        
      
       return(Integer.toString(PracticalSubFee+NonePracticalSubFee));
        
        
        
    }
    void AddPayment(String RegNo,String SubCode) throws SQLException{    //add payments for subjects
        InsertData("Update student_results set payment='Paid' where Registration_Number='"+RegNo+"' and Subject_Code='"+SubCode+"'");
    }
    
    String getPaidOrNot(String RegNo) throws SQLException{     //get whether paid for the particular subject or not
        String []attributes={"Payment"};
       return(RetrieveData("(SELECT Payment from practical_subject, student_results where student_results.Subject_Code=practical_subject.Subject_Code and student_results.Registration_Number='"+RegNo+"') Union All (SELECT Payment from none_practical_subjects, student_results where student_results.Subject_Code=none_practical_subjects.Subject_Code and student_results.Registration_Number='"+RegNo+"' )",attributes));
    }
   
   
}
