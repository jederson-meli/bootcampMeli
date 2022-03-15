package br.com.exercicio1;

public class Balance implements Transaction{

    public void makeDBalance(UserType type) {
        if (type.equals(UserType.BASIC) || type.equals(UserType.COLLECTORS)) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void transacaoOk() {
        System.out.println("Consultando saldo");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Consulta não permitida");
    }
}
