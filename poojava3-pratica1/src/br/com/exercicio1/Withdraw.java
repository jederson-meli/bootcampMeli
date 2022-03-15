package br.com.exercicio1;

public class Withdraw implements Transaction{

    public void makeWithdraw(UserType type) {
        if (type.equals(UserType.BASIC) || type.equals(UserType.COLLECTORS)) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
    @Override
    public void transacaoOk() {
        System.out.println("Fazendo saque");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Saque não permitida");
    }
}
