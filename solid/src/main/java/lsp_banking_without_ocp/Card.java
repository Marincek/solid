package lsp_banking_without_ocp;

import java.math.BigDecimal;

interface Card {

    void withdraw(BigDecimal money);

    void deposit(BigDecimal money);

}
