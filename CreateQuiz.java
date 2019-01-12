package serverpackage;
import commonpackage.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//this class is used to create new student account
public class CreateQuiz {
   Quiz quiz;
   static int i;

    public CreateQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
   

    void create()
    {System.out.println("pppppppppppppppppppppppppppppppppppppppppp");
        //it is used to update techer table with new teacher account
     //   String query="INSERT INTO student VALUES("+student.RegNo+","+student.FirstName+","+student.LastName+","+student.MobileNo+","+student.Password+","+student.email+","+student.Sex+","+student.selectedSecurityQuestion+","+student.SecurityAnswer+");";
       //it creates database operation object
     //int i=0;
       String query="INSERT INTO quiz VALUES(?,?,?,?);";
        DatabaseOperation db=new DatabaseOperation();
       try {
           
           //now passing the query
           // db.work(query);
           db. st=db.con.prepareStatement(query);
          db. st.setInt(1,quiz.quizid);
          db. st.setInt(2,quiz.Teacherid);
          db. st.setString(3,quiz.subject);
          //db. st.setInt(4,quiz.id);
         // db. st.setInt(5,quiz.RegNo[i]);
          //db. st.setInt(6,quiz.currentrank[i]);
          //db. st.setInt(6,quiz.currentscore[i++]);        
          db. st.setInt(4,quiz.noq);
          db. st.executeUpdate();
          System.out.println("AFTER VALUE WRITING");
          
          String query1="CREATE table softablitz."+quiz.quizid+"Q (quizid int,questionid int PRIMARY KEY,question varchar(200),option1 varchar(2),option2 varchar(2),option3 varchar(2),option4 varchar(2),answer varchar(2));";
          db. st=db.con.prepareStatement(query1);
          
          //db. st.setString(1,p);
          db. st.execute();
          System.out.println("EXECUTE UPDATE");
          String query3="CREATE table softablitz."+quiz.quizid+"record"+" (RegNo int PRIMARY KEY,CurrentScore int,CurrentRank int);";
          db.st=db.con.prepareStatement(query3);
          //db.st.setString(1,);
          db.st.executeUpdate();
          System.out.println("afer exec up");
          String query5="SELECT * FROM student;";
          db. st=db.con.prepareStatement(query5);
          ResultSet rs=db.st.executeQuery();
          while(rs.next())
          {
             System.out.println("pappu");
             int regno=rs.getInt("RegNo");
             String query4="INSERT INTO softablitz."+quiz.quizid+"record "+"VALUES("+regno+",0,0);";
             db. st=db.con.prepareStatement(query4);
             //db.st.setInt(1,regno);
            // db.st.setInt(2,0);
             db. st.executeUpdate();
             System.out.println("finished");
          } 
       } catch (SQLException ex) {
           Logger.getLogger(CreateStudent.class.getName()).log(Level.SEVERE, null, ex);
       }
         System.out.println("SUCCESSFUL");
    }
}

