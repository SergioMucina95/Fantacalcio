import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class GestoreThread extends Thread {
   private Socket s;
   private Squadre sq; 
    public GestoreThread(Socket s){
        super();
        this.s=s;
        sq=new Squadre();
        }
   public void run(){
       try {
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            int n=in.read();
            System.out.println(n);
            if(n==1)
                assegnaVoto();
            else if(n==0){
                 System.out.println("prima chiamata");
                caricaFormazione();
            }
                
          // s.close(); /* chiude il socket di comunicazione */
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
  
  public void assegnaVoto()throws Exception{
  DataInputStream in = new DataInputStream(s.getInputStream());
  DataOutputStream out = new DataOutputStream(s.getOutputStream());
      for(int i=0; i<11; i++) {
              float  msg1 = (float)(Math.random()*10)+1;
                
                System.out.println(msg1);
                out.writeFloat(msg1);
                
            }  
  }

  public void classifica(Squadre s,int n){
      String[] nsquadre;
      sq=s;
      for(int i=0;i<n;i++){
       
       
      }
  }
 
  public void caricaFormazione() {
  try{
      System.out.println("inizio");
   DataInputStream inte = new DataInputStream(s.getInputStream());
   DataOutputStream outp = new DataOutputStream(s.getOutputStream());
   System.out.println("ora passo a dichiarare gli object");
   ObjectInputStream in = new ObjectInputStream(inte);
   System.out.println("in");
  ObjectOutputStream out = new ObjectOutputStream(outp);
    System.out.println("out");
   Squadre s=new Squadre();
   System.out.println("prima carica");
   s.carica("milan");
   outp.write(s.getDim());
   System.out.println("dopo carica");
   for(int i=0;i<s.getDim();i++){
       out.writeObject(s.GetCal(i));
       
 }
  }catch(Exception e){System.out.println(e.getMessage());}
  }
  
}
