package br.com.exercicio1;

public class Basic extends User{

    private UserType type = UserType.BASIC;

    public Basic(String name, String cpf) {
        super(name, cpf);
    }

    public void makeDeposit() {
        Deposit deposit = new Deposit();
        deposit.makeDeposit(type);
    }

    public void makeBalance() {
        Balance balance = new Balance();
        balance.makeDBalance(type);
    }

    public void makePayment() {
        Payment payment = new Payment();
        payment.makePaymentt(type);
    }

    public void makeTransfer() {
        Transfer transfer = new Transfer();
        transfer.makeTransfer(type);
    }

    public void makeWithdraw() {
        Withdraw withdraw = new Withdraw();
        withdraw.makeWithdraw(type);
    }
}
