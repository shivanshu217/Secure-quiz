package commonpackage;




public class Teacher extends User
{
  public int Teacherid; //as teacher is extending user so there is no need to implement serializable as user implements it.
   public final String securitykey;
    public final String subject;
    public final String selectedSecurityQuestion;
   public final String SecurityAnswer;
   //here security answer and questions are set to final as they can't be changed one done with it.
   //security answer is used to recover your account when you forgot your account details.
   
     public Teacher(String FirstName,String LastName,int MobileNo,String Sex,String email,String Password,String securitykey,int Teacherid,String subject,String selectedSecurityQuestion,String SecurityAnswer)
    {
        super(FirstName,LastName,MobileNo,Sex,email,Password);
        this.securitykey=securitykey;
        this.Teacherid=Teacherid;
        this.subject=subject;
        this.selectedSecurityQuestion=selectedSecurityQuestion;
        this.SecurityAnswer=SecurityAnswer;
    }
}
    

 