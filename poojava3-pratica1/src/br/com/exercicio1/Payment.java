package br.com.exercicio1;

public class Payment implements Transaction{

    public void makePaymentt(UserType type) {
        if (type.equals(UserType.BASIC)) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
    @Override
    public void transacaoOk() {
        System.out.println("Fazendo pagamento");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Pagamento não permitido");
    }
}
