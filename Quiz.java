package commonpackage;



 

import java.io.Serializable;
import java.sql.ResultSet;
public class Quiz implements Serializable {
  public  int quizid;
  public int noq;
   public int Teacherid;
    public String subject;
  //public  int RegNo[];
 //  public int currentrank[]=null;
   //public int currentscore[]=null;
    
   
   public Quiz(int quizid, int Teacherid, String subject,int noq)  {
        this.quizid = quizid;
        this.Teacherid = Teacherid;
        this.subject=subject;
        this.noq=noq;
    }
    
    public void write()
    {     String query="INSERT INTO quiz (quizid,Teacherid,subject) VALUES("+quizid+","+Teacherid+","+subject+");";
          DatabaseOperation db=new DatabaseOperation();
         db.work(query);
        
    }    
    
}
