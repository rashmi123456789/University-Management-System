import java.sql.*;
import java.util.*;



public class Connect_to_Database {
   private static Statement st;
   private static Properties prop;
   private static Driver d;
   private static Connection con;
   
   ArrayList array=new ArrayList();
   String array1[]=new String[40];
   String resultSet,splitedResult;
   int i;
   
   
   
   void makeConnection() throws SQLException{
       
      try{
       String url="jdbc:mysql://localhost:3306/nsbm";
        prop=new Properties();
        prop.setProperty("user","root");
        prop.setProperty("password","");
        d=new com.mysql.jdbc.Driver();
        con = d.connect(url,prop);
        st=con.createStatement();
      }catch(SQLException e){
          System.out.println("connection is wrong");
      }
        
   }
   
   
   String RetrieveData(String sql,String attributes[]) throws SQLException{
           st.executeQuery(sql);
           ResultSet rss=st.getResultSet();
           while(rss.next()){
               i=0;
               while(i<attributes.length){
                  array.add(rss.getString(attributes[i]) +" ");
                  i++;
               }
           }
           resultSet=array.toString();
           splitedResult=resultSet.replaceAll(",","\n").replace("[","").replace("]","");
           return(splitedResult);   
   }
   
   void InsertData(String sql) throws SQLException{  //to insert data
       st.executeUpdate(sql);
   }
   
   void RemoveData(String sql)throws SQLException{     //to remove data
       st.executeUpdate(sql);
   }
   
   String [] RetrieveDataasArray(String sql,String attributes[],int len) throws SQLException{   //to get data
           st.executeQuery(sql);
           ResultSet rss=st.getResultSet();
           int j=0;
           while(rss.next()){
               i=0;
               while(i<attributes.length){
                  array1[j]=(rss.getString(attributes[i]));
                  i++;
               }
               j++;
           }
            return  array1;  
   }
   
   
}