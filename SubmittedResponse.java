package commonpackage;

import java.io.Serializable;




public class SubmittedResponse implements Serializable {
   public int RegNo;
    public int questionid;
    public int quizid;
    public String answer;
    public String virtualanswer;

    public SubmittedResponse(int RegNo, int questionid, int quizid, String answer, String virtualanswer) {
        this.RegNo = RegNo;
        this.questionid = questionid;
        this.quizid = quizid;
        this.answer = answer;
        this.virtualanswer = virtualanswer;
    }
}
//virtual answer is the answer submitted by the student