package br.com.exercicio1;

public class Programa {
    public static void main(String[] args) {
        Executive executivo = new Executive("AAAAAA", "3333333");

        System.out.println("----- Executivo -----");
        executivo.makeDeposit();
        executivo.makeBalance();
        executivo.makePayment();
        executivo.makeTransfer();
        executivo.makeWithdraw();

        Collector cobrador = new Collector("BBBBBB", "4444444");

        System.out.println("----- Cobrador -----");
        cobrador.makeDeposit();
        cobrador.makeBalance();
        cobrador.makePayment();
        cobrador.makeTransfer();
        cobrador.makeWithdraw();

        Basic basico = new Basic("CCCCCC", "5555555");

        System.out.println("----- Básico -----");
        basico.makeDeposit();
        basico.makeBalance();
        basico.makePayment();
        basico.makeTransfer();
        basico.makeWithdraw();

    }
}
