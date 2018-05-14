package lsp_banking_first;

import java.math.BigDecimal;

class BankingService {

    public void transfer(Card from, Card to, BigDecimal amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

}
