package serverpackage;
import commonpackage.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//this class is used to create new student account
public class CreateStudent {
   Student student;
    public CreateStudent(Student student)
            
    {
        this.student=student;
    }
    void create()
    {
        //it is used to update techer table with new teacher account
     //   String query="INSERT INTO student VALUES("+student.RegNo+","+student.FirstName+","+student.LastName+","+student.MobileNo+","+student.Password+","+student.email+","+student.Sex+","+student.selectedSecurityQuestion+","+student.SecurityAnswer+");";
       //it creates database operation object
       String query="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?)";
        DatabaseOperation db=new DatabaseOperation();
       try {
           //now passing the query
           // db.work(query);
           db. st=db.con.prepareStatement(query);
          db. st.setInt(1,student.RegNo);
          db. st.setString(2,student.FirstName);
          db. st.setString(3,student.LastName);
          db. st.setInt(4,student.MobileNo);
          db. st.setString(5,student.Password);
          db. st.setString(6,student.email);
          db. st.setString(7,student.Sex);
          db. st.setString(8,student.selectedSecurityQuestion);
          db. st.setString(9,student.SecurityAnswer);
          db. st.executeUpdate();
          
          
       } catch (SQLException ex) {
           Logger.getLogger(CreateStudent.class.getName()).log(Level.SEVERE, null, ex);
       }
         System.out.println("SUCCESSFUL");
    }
}
