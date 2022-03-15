package br.com.exercicio1;

public class Transfer implements Transaction{

    public void makeTransfer(UserType type) {
        if (type.equals(UserType.EXECUTIVE)) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
    @Override
    public void transacaoOk() {
        System.out.println("Fazendo tranferênncia");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Tranferência não permitida");
    }
}
