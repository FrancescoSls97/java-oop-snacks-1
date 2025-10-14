package org.lesson.java.GestioneConto;

public class ContoBancario {

    // attributi di classe
    private String numeroConto;
    private double saldo;

    // costruttore
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    // metodo deposito
    public void deposito(double denaro) {
        if (denaro > 0) {
            saldo += denaro;
        } else {
            System.out.println("Importo non valido");
        }
    }

    // metodo prelievo
    public void prelievo(double denaro) {
        if (denaro > 0 && denaro <= saldo) {
            saldo -= denaro;
        } else {
            System.out.println("Saldo insufficiente");
        }
    }

    // metodo saldo corrente
    public double getSaldo() {
        return saldo;
    }
}
