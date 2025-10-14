package org.lesson.java.GestioneConto;

public class mainConto {
    public static void main(String[] args) {
        //test con dati corretti
        ContoBancario conto1 = new ContoBancario("IT1234567890098765432123456");
        conto1.deposito(500);
        conto1.prelievo(170);
        System.out.println("Saldo attuale: " + conto1.getSaldo() + " euro");

        //test con dati errati
        ContoBancario conto2 = new ContoBancario("IT0987654321123456789009876");
        conto2.deposito(0);
        conto2.prelievo(100);
        System.out.println("Saldo attuale: " + conto2.getSaldo() + " euro");
    }
}
