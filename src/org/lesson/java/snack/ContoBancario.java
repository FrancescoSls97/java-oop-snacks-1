package org.lesson.java.snack;

import java.math.BigDecimal;
import java.util.Random;

public class ContoBancario {

    // attributi di classe
    private int numeroConto;
    private BigDecimal saldo;

    // costruttore
    public ContoBancario() {
        Random random = new Random();
        this.numeroConto = random.nextInt(999999);
        this.saldo = new BigDecimal(0);
    }

    //getter e setter numero conto

    public int getNumeroConto(){
        return this.numeroConto;
    }

    public void setNumeroConto(int numeroConto){
        this.numeroConto = numeroConto;
    }

    //getter e setter saldo

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    private void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    //metodo deposito
    public void deposito(BigDecimal denaroDepositato){
       if (denaroDepositato.compareTo(new BigDecimal(0)) == 1){
        this.saldo = this.saldo.add(denaroDepositato);
       }
    }

    //metodo prelievo
    public boolean prelievo(BigDecimal denaroPrelevato){
        if (denaroPrelevato.compareTo(new BigDecimal(0)) == 1 && this.saldo.compareTo(denaroPrelevato) == 1){
            this.saldo = this.saldo.subtract(denaroPrelevato);
            return true;
        } return false;
    }
}
