package br.com.exercicio1;

public class Deposit implements Transaction{

    public Deposit() {
    }

    public void makeDeposit(UserType type) {
        if (type.equals(UserType.EXECUTIVE)) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
    @Override
    public void transacaoOk() {
        System.out.println("Fazendo deposito");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Deposito não permitida");
    }
}
