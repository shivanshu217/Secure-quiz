/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
/**
 *
 * @author Hp
 */
public class Client {
   

static Client client;
      static Socket socket;
       
    public Client() {
     
         try {
           socket = new Socket("localhost", 5436);
            } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
  

public static Client getinstanceof()
{
 
    if(client==null)
    {
        //System.out.println("clientinstancecreation");
       client=new Client(); 
    }
    return client;
}
/*public static Client getinstanceof()
{
    return client;
}*/
   
 public void sendMessage( Object ob)throws IOException {
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(socket.getOutputStream());
      //System.out.println("send");
        objectOutputStream.writeObject(ob);
        //    objectOutputStream.flush();
        }
  public Object recievemessage() throws IOException, ClassNotFoundException
            {    
               // System.out.println("recieved");
                ObjectInputStream  objectinputstream=new ObjectInputStream(socket.getInputStream());
                Object ob= objectinputstream.readObject();
                return ob;
        
            }
    }




//