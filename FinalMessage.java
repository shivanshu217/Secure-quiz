package commonpackage;
import java.io.Serializable;


//when any user actions
//its object is passed is to its constructor (student ->student class constructor)
//now the object created in the prev step is passsed in the constructor of this class along with the string
//string determines the type of work  eg. create account or fetch quiz

public class FinalMessage implements Serializable {
   public Object object;
  public  String name;

    public FinalMessage(Object ob, String name) {
        //wraps the object and string into one class
        System.out.println("finalmessage");
        this.object = ob;
        this.name = name;
        
    }  
}

//this class is used to differentiate the different objects at server