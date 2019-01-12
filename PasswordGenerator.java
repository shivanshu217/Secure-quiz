package clientpackage;
import commonpackage.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
public class PasswordGenerator {
  
    String generatepassword(String password)
    {
       
        String generatedPassword = null;
        try {
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            md.update(password.getBytes());
            
            byte[] bytes = md.digest();
            
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
           
            generatedPassword = sb.toString();
            }
         catch (NoSuchAlgorithmException e)
         {
            e.printStackTrace();
         }
        
        return generatedPassword;
    }
}
       
  
