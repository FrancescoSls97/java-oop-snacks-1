package org.lesson.java.snack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // snack 1

        Studente mario = new Studente("Mario", "Rossi", 24);
        Studente luigi = new Studente("Luigi", "D'Alessio", 26);
        Studente pippo = new Studente("Pippo", "De Pippis", 29);
        Studente paolo = new Studente("Paolo", "Bianchi", 23);

        System.out.println(mario.getInfoStudente());
        System.out.println(luigi.getInfoStudente());
        System.out.println(pippo.getInfoStudente());
        System.out.println(paolo.getInfoStudente());

        // snack 2

        ContoBancario conto = new ContoBancario();
        System.out.println(conto.getSaldo());

        conto.deposito(new BigDecimal(500));
        System.out.println(conto.getSaldo());

        conto.prelievo(new BigDecimal(270));
        System.out.println(conto.getSaldo());

        //snack 3
        RegistroStudenti registroStudenti = new RegistroStudenti();

        System.out.println(registroStudenti);

        registroStudenti.addStudente(paolo);
        registroStudenti.addStudente(luigi);

        System.out.println(registroStudenti.toString());
    }

}
