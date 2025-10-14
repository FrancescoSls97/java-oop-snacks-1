package org.lesson.java.studenti;

public class Studente {
    // attributi della classe
    private String nome;
    private String cognome;
    private int età;

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

}
