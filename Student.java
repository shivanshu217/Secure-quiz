package commonpackage;
public class Student extends User
{
   public int RegNo;    //serializable is implemented so as to transfer data in form of packets and rearrange at recieving side.
  public String selectedSecurityQuestion;
   public String SecurityAnswer;
    //here security answer and questions are set to final as they can't be changed one done with it.
   //security answer is used to recover your account when you forgot your account details.
   
   public Student(String FirstName,String LastName,int MobileNo,String Sex,String email,int id,String Password,String selectedSecurityQuestion,String SecurityAnswer)
    {
        super(FirstName,LastName,MobileNo,Sex,email,Password);
        this.RegNo=id;
        this.selectedSecurityQuestion=selectedSecurityQuestion;
        this.SecurityAnswer=SecurityAnswer;
    }
  
}

    

