package org.lesson.java.RegistroStudenti;

import org.lesson.java.studenti.Studente;

public class RegistroStudenti {

    private Studente[] studenti;
    private int numeroStudenti;

    // Costruttore
    public RegistroStudenti() {
        studenti = new Studente[10]; // numero massimo di studenti
        numeroStudenti = 0;
    }

    // metodo stampa lista studenti
    public void listaStudenti() {
        for (int i = 0; i < numeroStudenti; i++) {
            System.out.println("Studente " + (i + 1) + ": " + studenti[i].getNome() + " " + studenti[i].getCognome()
                    + " di " + studenti[i].getEtà() + " anni");
        }
    }

    // metodo aggiunta nuovo studete
    public void aggiungiStudente(Studente Studente) {
        if (numeroStudenti < studenti.length) {
            studenti[numeroStudenti] = Studente;
            numeroStudenti++;
        } else {
            System.out.println("Numero massimo di studenti raggiunto");
        }
    }

}
