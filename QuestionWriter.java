package serverpackage;

import commonpackage.*;
import java.sql.SQLException;

public class QuestionWriter {
    Question question;
    QuestionWriter(Question question)
    {
        this.question=question;
    }
    void questionwriter() throws SQLException
    {   System.out.println("INSIDE QUESTION WRITER");   
        String query ="INSERT INTO softablitz."+question.quizid+"Q VALUES (?,?,?,?,?,?,?,?);";
                   DatabaseOperation db=new DatabaseOperation();
           //now passing the query
         
           db. st=db.con.prepareStatement(query);
           System.out.println("INSIDE QUESTION WRITER1");
         // db. st.setInt(1,question.quizid);
          db. st.setInt(1,question.quizid);
          System.out.println("INSIDE QUESTION WRITER2");
          db. st.setInt(2,question.quesid);
          db. st.setString(3,question.ques);
          db. st.setString(4,question.option[0]);
          System.out.println("INSIDE QUESTION WRITER34");
          db. st.setString(5,question.option[1]);
          db. st.setString(6,question.option[2]);
          db. st.setString(7,question.option[3]);
          db. st.setString(8,question.answer);
          db. st.executeUpdate();
          System.out.println("INSIDE QUESTION WRITER1");
        }
       /* int questype=question.questiontype;
        if(questype==1)
        {
               query="INSERT INTO "+question.quizid+"VALUES ("+question.quesid+","+question.quesid+","+question.ques+","+question.option[0]+","+question.option[1]+","+question.option[2]+","+question.option[3]+",null,null,"+question.questiontype+","+question.answer+","+question.duration+");";
        }
        else if(questype==2)
        {
              query="INSERT INTO "+question.quizid+"VALUES ("+question.quesid+","+question.quesid+","+question.ques+","+question.option[0]+","+question.option[1]+",null,null,null,null,"+question.questiontype+","+question.answer+","+question.duration+");";
        }
       else if(questype==3)
        {
              query="INSERT INTO "+question.quizid+"VALUES ("+question.quesid+","+question.quesid+","+question.ques+","+question.option[0]+","+question.option[1]+","+question.option[2]+","+question.option[3]+","+question.option[4]+",null,"+question.questiontype+","+question.answer+","+question.duration+");";
        }
        else if(questype==4)
        {
             query="INSERT INTO "+question.quizid+"VALUES ("+question.quesid+","+question.quesid+","+question.ques+","+question.option[0]+","+question.option[1]+","+question.option[2]+","+question.option[3]+","+question.option[4]+","+question.option[5]+","+question.questiontype+","+question.answer+","+question.duration+");";
        }
        DatabaseOperation db=new DatabaseOperation();
        db.work(query);
           */
    }

