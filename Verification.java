package serverpackage;


import commonpackage.*;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Verification {
   

    
    int verify(int UserId,String Password) throws SQLException
    {
        //this method is used to check that login details of the student are correct or not
        System.out.println(UserId+"\n"+Password);
        System.out.println("insude verify0");
        String query="SELECT * FROM student WHERE RegNo=? AND Password=?;";       
        //here we are creating the object of database operation class through which we will pass the query 
        DatabaseOperation db=new DatabaseOperation();
        db.st=db.con.prepareStatement(query);
        System.out.println("insude verify2");
        db.st.setInt(1,UserId);
        System.out.println("insude verify6");
        db.st.setString(2,Password);
        
         System.out.println("insude verify3");
         ResultSet rs=db.st.executeQuery();
         System.out.println("insude verify4");
         
         if(rs.next())   //ifrs.next is not null the there is a record with the given user login details so it will be logged in 
            return 1;
          else 
               return 0;         
     }
     int verify(String Password,int UserId) throws SQLException
    {
        //for teacher anothermethod is written as teacher has a unique security key which differentiates from the student
        //this method is used to check that login details of the teacher are correct or not
          String query="SELECT * FROM teacher WHERE Teacherid=? AND Password=?;";
          DatabaseOperation db=new DatabaseOperation();
          db.st=db.con.prepareStatement(query);
          System.out.println("insude verify2");
          db.st.setInt(1,UserId);
          System.out.println("insude verify6");
          db.st.setString(2,Password);
          System.out.println("insude verify3");
    
         ResultSet rs=db.st.executeQuery();
         System.out.println("insude verify4");
         
         if(rs.next())   //ifrs.next is not null the there is a record with the given user login details so it will be logged in 
            return 1;
          else 
            return 0;      
     }
       int verify(int UserId,String Password,int flag) throws SQLException
    {
        //for teacher anothermethod is written as teacher has a unique security key which differentiates from the student
        //this method is used to check that login details of the teacher are correct or not
          String query="SELECT * FROM admin WHERE adminid=? AND Password=?;";
          DatabaseOperation db=new DatabaseOperation();
          db.st=db.con.prepareStatement(query);
          System.out.println("insude verify2");
          db.st.setInt(1,UserId);
          System.out.println("insude verify6");
          db.st.setString(2,Password);
          System.out.println("insude verify3");
    
         ResultSet rs=db.st.executeQuery();
         System.out.println("insude verify4");
         
         if(rs.next())   //ifrs.next is not null the there is a record with the given user login details so it will be logged in 
            return 1;
          else 
            return 0;      
     }
        int verify(int UserId,String selectedSecurityQuestion,String SecurityAnswer,int i) throws SQLException
      {  //this method is used to retrieve account if someone forgets the login details 
        String query;
         if(i==1)   //here i acts as a key if i==1 it means teacher has forgot details  otherwise student forgot the detail
            query = "SELECT *FROM teacher WHERE Teacherid="+UserId+"AND selectedSecurityQuestion="+selectedSecurityQuestion+"AND SecurityAnswer="+SecurityAnswer+";";
        else
            query = "SELECT *FROM student WHERE RegNo="+UserId+"AND selectedSecurityQuestion="+selectedSecurityQuestion+"AND SecurityAnswer="+SecurityAnswer+";";
           
         DatabaseOperation db=new DatabaseOperation();
           ResultSet rs=db.wo_rk(query);
           if(rs.next()) //ifrs.next is not null the there is a record with the given user login details so it will be logged in
            return 1;
           else 
               return 0;
    }
    
    
    
}