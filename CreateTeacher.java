package serverpackage;
import commonpackage.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


//this class is used to create new teacher account
public class CreateTeacher{
   Teacher teacher;
    public CreateTeacher(Teacher teacher)          
    {
        this.teacher=teacher;
    }
    int create() throws SQLException
    {
        //it is used to update techer table with new teacher account
        System.out.println("inside create functrion");
      String quer="SELECT teachercode FROM admin;";
      DatabaseOperation db=new DatabaseOperation();
      db.st=db.con.prepareStatement(quer);
      ResultSet rs1=db.st.executeQuery();
      System.out.println("inside create functrion1");
      rs1.next();
      String k=rs1.getString("teachercode");
      System.out.println(k);
      if((teacher.securitykey).equals(k))
      {
          System.out.println("matched sec");
 
         String query="INSERT INTO teacher VALUES(?,?,?,?,?,?,?,?,?,?,?);";
        
            try {
                //now passing the query
                // db.work(query);
                System.out.println("purana0");
                System.out.println("createteacher0");
                db. st=db.con.prepareStatement(query);
               db. st.setInt(1,teacher.Teacherid);
               db. st.setString(2,teacher.securitykey);
               db. st.setString(3,teacher.subject);
               db. st.setString(4,teacher.FirstName);
               db. st.setString(5,teacher.LastName);
               db. st.setInt(6,teacher.MobileNo);
               db. st.setString(7,teacher.Password);
               db. st.setString(8,teacher.email);
               db. st.setString(9,teacher.Sex);
               db. st.setString(10,teacher.selectedSecurityQuestion);
               db. st.setString(11,teacher.SecurityAnswer);
               db. st.executeUpdate();
               System.out.println("purana1");
               return 1;
               //System.out.println("createtea`cher1");
            }   
            catch (SQLException ex) {
           Logger.getLogger(CreateTeacher.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
       return 0;
    }
}