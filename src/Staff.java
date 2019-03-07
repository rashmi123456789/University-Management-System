
import java.sql.SQLException;


public class Staff extends Connect_to_Database{
    
    Staff() throws SQLException{
        makeConnection();
    }
    
    //get lecture details
    
    String getLectureInfo(String SubCode,String semester,String attribute) throws SQLException{
        String []attributes={attribute};
        return(RetrieveData("select "+attribute+" from lecture_info where Semester='"+semester+"' and Subject_Code='"+SubCode+"'",attributes));
    }
    //get leture's name by id
    String getLecturerNameFromID(String lecID) throws SQLException{
        String[]attributes={"Name"};
        return(RetrieveData("Select Name from staff where Registration_Number='"+lecID+"'", attributes));
    }
    
    //add a new lecturer
    
    void AddLectureInfo(String LecId,String LecRoom,String Location,String Semester,String SubCode,String Time_Slots) throws SQLException{
        InsertData("Insert into lecture_info (Lecture_Id,Lecture_Room,Location,Semester,Subject_Code,Time_Slot) Values('"+LecId+"','"+LecRoom+"','"+Location+"','"+Semester+"','"+SubCode+"','"+Time_Slots+"');");
    }
    
    //Add lab time slots
    
    void AddLabTimeSlot(String []RegNo,String SubjCode,String TimeSlot) throws SQLException{
        int i;
        for(i=0;i<RegNo.length;i++){
        InsertData("Insert into lab_time Values('"+RegNo[i]+"','"+SubjCode+"','"+TimeSlot+"')");
        }
    }
      //add staff members
    
    void AddStaffMembers(String RegNo,String name,String Dob, String email,String address) throws SQLException{
        InsertData("Insert into staff values('"+RegNo+"','"+name+"','"+Dob+"','"+email+"','"+address+"')");
    }
    
}
