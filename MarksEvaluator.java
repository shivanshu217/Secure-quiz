package serverpackage;
import commonpackage.*;
//this class is used to give the score of the quiz after the students submitts the quiz 
public class MarksEvaluator
{
    SubmittedResponse sbm;
    static int totalmarks=0;
    static int unattempted=0;
    static int correctanswers=0;
    static int incorrectanswers=0;
   MarksEvaluator (SubmittedResponse sbm)
    {
      this.sbm=sbm;
    }
   int marks_obtained(SubmittedResponse sbm)
   {
        if(sbm.virtualanswer==null)
           unattempted++;
        else if(sbm.virtualanswer.equals(sbm.answer))
           correctanswers++;
         else
           incorrectanswers++;
       totalmarks+=4*correctanswers+(-1)*incorrectanswers;
       String query="INSERT INTO quiz (currentscore) VALUES("+totalmarks+");";
       DatabaseOperation dbso=new DatabaseOperation();
       dbso.work(query);
       
       return totalmarks;
   }
}