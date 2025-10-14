package org.lesson.java.RegistroStudenti;

import org.lesson.java.studenti.Studente;

public class mainRegistro {
    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();

        Studente studente1 = new Studente("Mario", "Esposito", 25);
        Studente studente2 = new Studente("Luigi", "D'Alessio", 22);
        Studente studente3 = new Studente("Pippo", "De Pippis", 28);
        Studente studente4 = new Studente("Paolo", "Bianchi", 19);
        Studente studente5 = new Studente("Antonio", "Verdi", 26);
        Studente studente6 = new Studente("Giancarlo", "Magalli", 21);
        Studente studente7 = new Studente("Luciano", "Spalletti", 31);
        Studente studente8 = new Studente("Giovanni", "Storti", 28);
        Studente studente9 = new Studente("Giacomo", "Poretti", 25);
        Studente studente10 = new Studente("Aldo", "Baglio", 26);
        Studente studente11 = new Studente("Roberto", "Robertoni", 20);


        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);
        registro.aggiungiStudente(studente3);
        registro.aggiungiStudente(studente4);
        registro.aggiungiStudente(studente5);
        registro.aggiungiStudente(studente6);
        registro.aggiungiStudente(studente7);
        registro.aggiungiStudente(studente8);
        registro.aggiungiStudente(studente9);
        registro.aggiungiStudente(studente10);
        registro.aggiungiStudente(studente11);

        registro.listaStudenti();
    }

}
