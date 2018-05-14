package lsp_banking_no_ocp;

import java.math.BigDecimal;

class BankingService {

    public void transfer(Card from, Card to, BigDecimal amount) {
        if (from instanceof DebitCard) {
            handleDebitCard((DebitCard) from, to, amount);
        } else {
            handleCreditCard(from, to, amount);
        }
    }

    private void handleDebitCard(DebitCard from, Card to, BigDecimal amount) {
        if (from.hasEnoughMoney(amount)) {
            from.withdraw(amount);
            to.deposit(amount);
        } else {
            System.out.println("Not enough money to complete the transfer");
        }
    }

    private void handleCreditCard(Card from, Card to, BigDecimal amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

}
