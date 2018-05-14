package lsp_banking_without_ocp;

import java.math.BigDecimal;

class DebitCard implements Card {

    private BigDecimal balance;

    public DebitCard(BigDecimal balance) {
        this.balance = balance;
        System.out.println("New DebitCard created, balance=" + balance);
    }

    @Override
    public void withdraw(BigDecimal money) {
        balance = balance.subtract(money);
        System.out.println("Withdraw from DebitCard, amount=" + money + ", balance=" + balance);

    }

    @Override
    public void deposit(BigDecimal money) {
        balance = balance.add(money);
        System.out.println("Deposit to CreditCard, amount=" + money + ", balance=" + balance);
    }

    public boolean hasEnoughMoney(BigDecimal money) {
        return balance.compareTo(money) > 0;
    }
}
