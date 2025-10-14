package org.lesson.java.studenti;

public class Studente {
    // attributi della classe
    public String nome;
    public String cognome;
    public int età;

    // costruttore
    public Studente(String nome, String cognome, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    // metodi per ottenere una stringa con tutti i dati
    public String datiStudente() {
        return nome + " " + cognome + " " + età + " anni";
    }

    //getter per snack 3
    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public int getEtà(){
        return età;
    }

}
