package lsp_banking_first;

import java.math.BigDecimal;

interface Card {

    void withdraw(BigDecimal money);

    void deposit(BigDecimal money);

}
