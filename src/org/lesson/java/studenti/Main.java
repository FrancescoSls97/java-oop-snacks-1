package org.lesson.java.studenti;

public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Mario", "Esposito", 24);
        System.out.println(studente1.datiStudente());

        Studente studente2 = new Studente("Luigi", "D'Alessio", 22);
        System.out.println(studente2.datiStudente());

        Studente studente3 = new Studente("Pippo", "De Pippis", 28);
        System.out.println(studente3.datiStudente());

        Studente studente4 = new Studente("Paolo", "Bianchi", 24);
        System.out.println(studente4.datiStudente());
    }
}
