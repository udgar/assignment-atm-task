package com.progressoft.induction.atm;

import java.math.BigDecimal;

public interface BankingSystem {

    BigDecimal getAccountBalance(long accountNumber);

    void debitAccount(long accountNumber, BigDecimal amount);
}
