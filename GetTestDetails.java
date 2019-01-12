package serverpackage;
import commonpackage.*;

import java.sql.ResultSet;
import java.sql.SQLException;
public class GetTestDetails {
Quiz quiz;
    public GetTestDetails(Quiz quiz) {
        this.quiz=quiz;
    }  
    Quiz function() throws SQLException
    {    Integer[] options;
          int i;
         String query="SELECT RegNo FROM student;";
         DatabaseOperation db=new DatabaseOperation();
         ResultSet rs=db.wo_rk(query);
         rs.last();
         int rowcount=rs.getRow();
         rs.beforeFirst();
         i=0;
         options=new Integer[rowcount];
         while(rs.next())
        {
          options[i++]=rs.getInt("RegNo");
        }
        
        for(i=0;i<rowcount;i++)
        {
     //    quiz.RegNo[i]=options[i].intValue();
        }
    
        query="SELECT Teacherid FROM quiz WHERE quizid="+quiz.quizid;
        rs=db.wo_rk(query);
        quiz.Teacherid= rs.getInt("Teacherid");
        
        query="SELECT currentscore FROM quiz;";
        rs=db.wo_rk(query);
        rs.last();
        rowcount=rs.getRow();
        rs.beforeFirst();
        i=0;
        options=new Integer[rowcount];
        while(rs.next())
        {
          options[i++]=rs.getInt("currentscore");
        }
        for(i=0;i<rowcount;i++)
        {
       //  quiz.currentscore[i]=options[i].intValue();
        }
        query="SELECT currentrank FROM quiz;";
        rs=db.wo_rk(query);
        rs.last();
        rowcount=rs.getRow();
        rs.beforeFirst();
        i=0;
        options=new Integer[rowcount];
        while(rs.next())
        {
          options[i++]=rs.getInt("currentrank");
        }
        for(i=0;i<rowcount;i++)
        {
      //   quiz.currentrank[i]=options[i].intValue();
        }
        return quiz;
    }
    
    
}
