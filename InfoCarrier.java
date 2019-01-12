package  commonpackage;

import java.io.Serializable;

public class InfoCarrier implements Serializable {
    
    public int id;
    public int flag;
   public String Password;
    public String SecurityKey;
  public  String SelectedSecurityQuestion;
    public String SelectedSecurityAnswer;
   /*public InfoCarrier(int id,String Password,String SecurityKey)
    {
        this.id=id;
        this.Password=Password;
        this.SecurityKey=SecurityKey;
    }*/
    public InfoCarrier(int id,String Password)
    {
        this.id=id;
        this.Password=Password;
        
    }

    public InfoCarrier(int id, int flag, String Password) {
        this.id = id;
        this.flag = flag;
        this.Password = Password;
    }
    

    
    
   public  InfoCarrier(String SelectedSecurityQuestion,String SeurityAnswer,int id)
    {
        
        this.id=id;
        this.SelectedSecurityQuestion=SelectedSecurityQuestion;
        this.SelectedSecurityAnswer=SelectedSecurityAnswer;
        
        
    }
    public   InfoCarrier(String SelectedSecurityQuestion,String SeurityAnswer,String SecurityKey,int id)
    {
        this.id=id;
        this.SelectedSecurityQuestion=SelectedSecurityQuestion;
        this.SelectedSecurityAnswer=SelectedSecurityAnswer;
        this.SecurityKey=SecurityKey;
        
        
    }
    
}
