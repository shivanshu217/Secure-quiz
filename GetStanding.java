package serverpackage;
import commonpackage.*;

import java.sql.ResultSet;
import java.sql.SQLException;


public class GetStanding {
    Student student;

    public GetStanding(Student student) {
        this.student = student;
    }
     int [] getStand() throws SQLException
     {    int i[]=new int[2];
         String query="SELECT overallrank FROM Student WHERE RegNo="+student.RegNo+";";
         String query1="SELECT overallscore FROM Student WHERE RegNo="+student.RegNo+";";
         DatabaseOperation db=new DatabaseOperation();
          
         ResultSet rs=db.wo_rk(query);
         if(rs.next())
          i[0]=rs.getInt("overallrank");
           ResultSet rs1=db.wo_rk(query1);
           if(rs.next())
          i[1]=rs1.getInt("overallscore");
          return i;  
     }
    
    
}
