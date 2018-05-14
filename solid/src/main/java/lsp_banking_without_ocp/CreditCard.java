package lsp_banking_without_ocp;

import java.math.BigDecimal;

class CreditCard implements Card {

    private BigDecimal balance;

    public CreditCard(BigDecimal balance) {
        this.balance = balance;
        System.out.println("New CreditCard created, balance=" + balance);
    }

    @Override
    public void withdraw(BigDecimal money) {
        balance = balance.subtract(money);
        System.out.println("Withdraw from CreditCard, amount=" + money + ", balance=" + balance);
    }

    @Override
    public void deposit(BigDecimal money) {
        balance = balance.add(money);
        System.out.println("Deposit to CreditCard, amount=" + money + ", balance=" + balance);
    }
}
