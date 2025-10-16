package org.lesson.java.snack;

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

    // getter e setter

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEtà() {
        return this.età;
    }

    public void setEtá(int età) {
        this.età = età;
    }

    public String getInfoStudente() {
        return String.format("%s %s %d anni. ", this.nome, this.cognome, this.età);
    }

    @Override
    public String toString() {
        return String.format("%s %S %d", this.nome, this.cognome, this.età);
    }

}
