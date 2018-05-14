package lsp_banking_without_ocp;

import java.math.BigDecimal;

class Main {

    public static void main(String[] args) {

        Card cardA = new DebitCard(BigDecimal.valueOf(200));
        Card cardB = new CreditCard(BigDecimal.valueOf(500));

        BankingService bankingService = new BankingService();

        bankingService.transfer(cardA, cardB, BigDecimal.valueOf(300));

    }


}
