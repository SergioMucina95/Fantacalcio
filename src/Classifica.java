import java.net.*;
import java.io.*;
import java.util.*;
public class Classifica {
   private ArrayList campionato; 
    
public Classifica(){
    campionato=new ArrayList();
}

public void inserisci(Squadre s){
    campionato.add(s);
}

public String[] ordina(){
    
    Squadre s,s1;
        Squadre aux=new Squadre();
    for(int i=0;i<campionato.size();i++)
        for(int j=i+1;j<campionato.size()-1;j++){
            s=(Squadre)campionato.get(i);
            s1=(Squadre)campionato.get(j);
            if(s.votoSquadra()>s1.votoSquadra())
             aux=s;
             s=s1;
             s1=aux;
        }
    String ss[]=new String[campionato.size()];
    return ss;
}
}
