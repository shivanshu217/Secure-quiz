 package serverpackage;

import commonpackage.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLException;


public class HandleClient implements Runnable {
    private Socket socket;
    ObjectInputStream objectInputStream;
ObjectOutputStream objectOutputStream;
    public HandleClient(Socket socket) {
        this.socket = socket;
        try {
            objectInputStream = new ObjectInputStream(socket.getInputStream());
          objectOutputStream =new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        
            try {
                
               FinalMessage ob =(FinalMessage) objectInputStream.readObject();
                if((ob.name).equals("CreateStudent"))
                {
                    
                    CreateStudent cs=new CreateStudent((Student)ob.object);
                    cs.create();
                }
                else if((ob.name).equals("ENTERQUIZDETAILS"))
                {System.out.println("HANDLE CLIENT QUIZDETAILS");
                    System.out.println(ob.name);
                    CreateQuiz cs=new CreateQuiz((Quiz)ob.object);
                    cs.create();
                }
                else if((ob.name).equals("CREATETEACHER"))
                {
                    System.out.println("insidle hclient");
                    CreateTeacher ct=new CreateTeacher((Teacher)ob.object);
                    int b=ct.create();
                    Integer i=new Integer(b);
                    objectOutputStream.writeObject(i);
                }
                else if((ob.name).equals("STUDENTLOGIN"))
                {
                    Verification v=new Verification();
                    InfoCarrier s=(InfoCarrier)ob.object;
                    int b=v.verify(s.id,s.Password);
                    Integer i=new Integer(b);
                    objectOutputStream.writeObject(i);
                   
                }
                else if((ob.name).equals("TEACHERLOGIN"))
                {
                    Verification v=new Verification();
                    InfoCarrier s=(InfoCarrier)ob.object;
                   int b=v.verify(s.Password,s.id);
                   Integer i=new Integer(b);
                   objectOutputStream.writeObject(i);
                   
                   
                }
                 else if((ob.name).equals("ADMINLOGIN"))
                {
                    Verification v=new Verification();
                    InfoCarrier s=(InfoCarrier)ob.object;
                   int b=v.verify(s.id,s.Password,s.flag);
                   Integer i=new Integer(b);
                   objectOutputStream.writeObject(i);
                   
                }
                 else if((ob.name).equals("REGISTERQUESTION"))
                {
                    System.out.println("INSIDE HANDLE CLIENT REG QUES");
                    System.out.println("insidle hclient");
                    QuestionWriter ct=new QuestionWriter((Question)ob.object);
                    ct.questionwriter();
                }
                
          /*      else if((ob.name).equals("FORGOTPASSWORDSTUDENT"))
                        {
                             Verification v=new Verification();
                    Student s=(Student)ob.object;
                   boolean b=v.verify(s.id,s.selectedSecurityQuestion,s.SecurityAnswer,2);
                        }
                
                 else if((ob.name).equals("FORGOTPASSWORDSTUDENT"))
                 {
                    Verification v=new Verification();
                    Teacher s=(Teacher)ob.object;
                   boolean b=v.verify(s.id,s.selectedSecurityQuestion,s.SecurityAnswer,1);
                }
                     
                 
                else if((ob.name).equals("FetchQuiz"))
                {
                    FetchQuiz fetchquiz=new FetchQuiz((Quiz)ob.object );
                    Question[] q=fetchquiz.function();

                       objectOutputStream.writeObject(q);
                }
               else if((ob.name).equals("GenerateQuiz"))
                {
                    new QuestionWriter((Question)ob.object);
                }
                else if((ob.name).equals("GetOverallStanding"))
                {
                    GetStanding getoverallstanding=new GetStanding((Student)ob.object);
                    int a[]=getoverallstanding.getStand();
                    Integer []b=new Integer[a.length];
                    int j=0;
                    for(int value:a)
                        b[j++]=Integer.valueOf(value);
                    objectOutputStream.writeObject(b);
                    
                }
                else if((ob.name).equals("GetQuizDetails"))
                {
                   GetTestDetails gettestdetails= new GetTestDetails((Quiz)ob.object);
                   Quiz q=gettestdetails.function();
                   objectOutputStream.writeObject(q);
                }
                else if((ob.name).equals("Evalutae"))
                {
                 MarksEvaluator marksevaluator = new MarksEvaluator((SubmittedResponse)ob.object);
                   marksevaluator.function();
                   
                   objectOutputStream.writeObject(q);
                }
              */
                
            } catch (IOException | ClassNotFoundException | SQLException e) {
          }
        }
    }