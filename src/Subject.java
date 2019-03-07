
import java.sql.SQLException;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rashmi Shehana
 */
public class Subject extends Connect_to_Database{
    Subject() throws SQLException{
        makeConnection();
    }
    
    
    //get ther month to check whether student can change the subject
    
    int CheckMonthForChangeSubjects(String RegNo) throws SQLException{
        
           if( Calendar.getInstance().get(Calendar.MONTH)==6 || Calendar.getInstance().get(Calendar.MONTH)==1){
               return(1);
           }else{
            return(0);
           } 
    }
    
    //change the subject 
    
    void ChangeSubjects(String RegNo,String CurSub1,String CurSub2,String CurSub3,String CurSub4,String NewSub1,String NewSub2,String NewSub3,String NewSub4) throws SQLException{
       if(NewSub1!=null)  InsertData("Update student_results set Subject_Code='"+NewSub1+"' where Registration_Number='"+RegNo+"' and Subject_Code='"+CurSub1+"'");
       if(NewSub2!=null)  InsertData("Update student_results set Subject_Code='"+NewSub2+"' where Registration_Number='"+RegNo+"' and Subject_Code='"+CurSub2+"'");
       if(NewSub3!=null)  InsertData("Update student_results set Subject_Code='"+NewSub3+"' where Registration_Number='"+RegNo+"' and Subject_Code='"+CurSub3+"'");
       if(NewSub4!=null)  InsertData("Update student_results set Subject_Code='"+NewSub4+"' where Registration_Number='"+RegNo+"' and Subject_Code='"+CurSub4+"'");
   }
    
    
    //insert assigment results
    
    
     void InsertAssignmentResults(String []RegNo,String []marks,String AssignmentCode,String subCode) throws SQLException{
       int i;
       for(i=0;i<marks.length;i++){       
           InsertData("Insert into assignment_results values('"+RegNo[i]+"','"+AssignmentCode+"','"+subCode+"','"+marks[i]+"')");
       }
   }
       // get students who do a particular subjet 
     
      String[] getStudentsArrayForSubject(String subCode,int len) throws SQLException{
       String attribute[]={"Registration_Number"};
      return( RetrieveDataasArray("select Registration_Number from student_results where Subject_Code='"+subCode+"'",attribute,len));
   }
      
      //insert results
      
      void InsertResults(String []RegNo,String []marks,String subCode) throws SQLException{
       int i;
       for(i=0;i<marks.length;i++){
          
           InsertData("Update student_results set Results='"+marks[i]+"' where Registration_Number='"+RegNo[i]+"' and Subject_Code='"+subCode+"'");
       }
   }
      
      //get exam results
      
      
      String getExamResults(String RegNo,String SubCode) throws SQLException{
       String attribute[]={"Results"};
       return(RetrieveData("select Results from student_results where Registration_Number='"+RegNo+"' and Subject_Code='"+SubCode+"'", attribute));
   }
   
   
   String getAssignmentResults(String RegNo,String SubCode) throws SQLException{
       String attribute[]={"Result"};
       return(RetrieveData("select Result from assignment_results where Registration_Number='"+RegNo+"' and Subject_Code='"+SubCode+"'", attribute));
   }
   
   //get asiignment number
   
    String getAssignmentNumber(String RegNo,String SubCode) throws SQLException{
       String attribute[]={"Assignment_Number"};
       return(RetrieveData("select Assignment_Number from assignment_results where Registration_Number='"+RegNo+"' and Subject_Code='"+SubCode+"'", attribute));
   }
     //adda student for a subject 
    
     void addForSubjects(String RegNo,String Sub1,String Sub2,String Sub3,String Sub4,String numOfSubs) throws SQLException{
       String Array[]={Sub1,Sub2,Sub3,Sub4};
       int i;
       for( i=0;i<Integer.parseInt(numOfSubs);i++){
       InsertData("Insert into student_results (Registration_Number,Subject_Code) Values('"+RegNo+"','"+Array[i]+"')");
       }
      
   }
     //get student list for a subject
     
     String getStudentsListForSubject(String subCode) throws SQLException{
       String attribute[]={"Registration_Number"};
      return( RetrieveData("select Registration_Number from student_results where Subject_Code='"+subCode+"'",attribute));
   }
     
     //get subjet name from registratui number
     
     String getSubjectsNamesFromRegistrationNumber(String RegNo) throws SQLException{
        String []attributes={"Name"};
       return(RetrieveData("(SELECT Name from practical_subject, student_results where student_results.Subject_Code=practical_subject.Subject_Code and student_results.Registration_Number='"+RegNo+"') Union All (SELECT Name from none_practical_subjects, student_results where student_results.Subject_Code=none_practical_subjects.Subject_Code and student_results.Registration_Number='"+RegNo+"' )",attributes));
    }
     
     //get the subject code
     
     
      String getSubjectCode(String RegNo) throws SQLException{
        String[]attributes={"Subject_Code"};
        return(RetrieveData("Select Subject_Code from student_results where Registration_Number='"+RegNo+"'", attributes));
    }
    
}
