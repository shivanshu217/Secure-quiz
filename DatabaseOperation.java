package commonpackage;

//importing all the packages required for the connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//this class is used to connect to database and execute the queries
public class DatabaseOperation {
    
    public Connection con;
    public PreparedStatement st;
    public ResultSet rs;
     public String query;
    public int querytype;
    public DatabaseOperation()
    { 
      try
       {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/softablitz";
        con=DriverManager.getConnection(url,"root","shiv");
        System.out.println("asdasdada");
        //database name softablitz     username root    password pwnkumar
        //database connected
       }
      catch(ClassNotFoundException ex)
      {
          ex.printStackTrace();
      }
      catch(SQLException exe)
      {
           exe.printStackTrace();
      }  
     
   }
   
   
  public void work(String query)
   {
       //here return type is void as we need not to get anything we are only updating
       //this is the function of database that handles the events when we want to update the database
        try
        {
             st=con.prepareStatement(query);
                st.executeUpdate();
        } catch(SQLException exe)
           {
                exe.printStackTrace();
           }  
    }
   
  public ResultSet wo_rk(String query)
    {
        //here return type is resultset as we are extracting the data from database
       //this is the function of database that handles the events when we want to extract something from the database
         ResultSet rst=null;
        try
        {
            st=con.prepareStatement(query);
             rst= st.executeQuery();
        } catch(SQLException exe)
        {
            exe.printStackTrace();
        }
        return rst;
    }
}
