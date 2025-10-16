package org.lesson.java.snack;

public class RegistroStudenti {

    private Studente[] registro;

    //getter
    public Studente[] getRegistro(){
        return this.registro;
    }

    //setter
    public void setRegistro(Studente[] registro){
        this.registro = registro;
    }

    //inizializzazione classe
    public RegistroStudenti(){
        this.registro = new Studente[0];
    }

    //creare un nuovo registro con la stessa lunghezza del precedente + 1
    public void addStudente(Studente studente){
        Studente[] registroAggiornato = new Studente[this.registro.length + 1];

    //copiare il vecchio registro nel nuovo
        for (int i =0; i < this.registro.length; i++){
            registroAggiornato[i] = this.registro[i];
        }

    //aggiungere allärray un nuovo studente
    registroAggiornato[registroAggiornato.length - 1] = studente;

    //sovrascrittura registro
    this.registro = registroAggiornato;
    }
    
    @Override
    public String toString(){
        String output = "Registro studenti: ";
        for(Studente studente : this.registro){
            output += String.format("%s", studente.getInfoStudente());
        }
        return output;
    }
   
}
