package commonpackage;


import java.io.Serializable;
abstract  public class User implements Serializable{  
    //serializable is implemented so as to transfer data in form of packets and rearrange at recieving side.
   
   public String FirstName;
    public String LastName;
    public int MobileNo;
    public String Sex;
    public String email;
    public String Password;
    
   public static  String [] SecurityQuestion={"WHAT IS YOUR PET NAME ?","WHAT IS YOUR HOBBY ?"};
 
    //here it is final has it is not to be changed only two options are available 
   
  public  User(String FirstName,String LastName,int MobileNo,String Sex,String email,String Password)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.MobileNo=MobileNo;
        this.Sex=Sex;
        this.email=email;
        this.Password=Password;
        
    }
  
    
}
