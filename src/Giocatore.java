import java.io.*;
import java.util.*;

public class Giocatore implements Serializable  {
    String nome;
    String cognome;
    char ruolo;
    float voto;
    
    public Giocatore(){
    this.nome="";
    this.cognome="";
    this.voto=0;
    }
    
    public Giocatore(String nome,String cognome,float voto){
        this.nome=nome;
        this.cognome=cognome;
        this.voto=voto;
        this.ruolo=' ';
        
    }
    
     public Giocatore(String nome,String cognome){
        this.nome=nome;
        this.cognome=cognome;
        this.voto=0;
        this.ruolo=' ';
        
    }
    
    public Giocatore(String nome){
        this.nome=nome;
        this.voto=0;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public float getVoto() {
        return voto;
    }

    public char getRuolo(){
        return ruolo;
    }
    
    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setCognome(String cognome) {
        this.cognome=cognome;
    }

    public void setVoto(float voto) {
        this.voto=voto;
    }
    
    public boolean setRuolo(char ruolo){
      if(ruolo>='a'&&ruolo<='z')
          ruolo-=32;
      if(ruolo=='P'||ruolo=='D'||ruolo=='C'||ruolo=='A'){
          this.ruolo=ruolo;
          return true;
      }
      else
          return false;
  }
    
    public String generalita(){
        return "nome:"+this.nome+"\n"+"cognome:"+this.cognome+"\n"+"voto:"+this.voto;
       }
    
    
}
