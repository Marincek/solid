package lsp_banking_no_ocp;

import java.math.BigDecimal;

interface Card {

    void withdraw(BigDecimal money);

    void deposit(BigDecimal money);

}
