package commonpackage;

import java.io.Serializable;


public class Question implements Serializable {
   public int quizid;
    public int quesid;
    public String ques;
    public String []option=new String[4];
    public String answer;

    public Question( int quizid,int quesid, String ques,String option1, String option2, String option3 ,String option4,String answer) {
        this.quesid = quesid;
        this.quizid=quizid;
        this.ques = ques;
        this.option[0] = option1;
        this.option[1] = option2;
        this.option[2] = option3;
        this.option[3] = option4;
        this.answer = answer;
    }
  /*   public Question(int duration,int questiontype,int quizid,int quesid, String ques,String option1, String option2,String answer) {
        this.quesid = quesid;
        this.duration= duration;
        this.questiontype=questiontype;
        this.quizid=quizid;
        this.ques = ques;
        this.option[0] = option1;
        this.option[1] = option2;
        this.answer = answer;
    }
      public Question(int duration,int questiontype,int quizid,int quesid, String ques,String option1, String option2, String option3 ,String option4,String option5,String answer) {
        this.quesid = quesid;
        this.duration= duration;
        this.questiontype=questiontype;
        this.quizid=quizid;
        this.ques = ques;
        this.option[0] = option1;
        this.option[1] = option2;
        this.option[2] = option3;
        this.option[3] = option4;
        this.option[4] = option5;
        
        this.answer = answer;
    }
      public Question(int duration,int questiontype,int quizid,int quesid, String ques,String option1, String option2, String option3 ,String option4,String option5,String option6,String answer) {
        this.quesid = quesid;
        this.duration=duration;
        this.questiontype=questiontype;
        this.quizid=quizid;
        this.ques = ques;
        this.option[0] = option1;
        this.option[1] = option2;
        this.option[2] = option3;
        this.option[3] = option4;
        this.option[4] = option5;
        this.option[5]=option6;
        this.answer = answer;
    }
    
    */
}
  