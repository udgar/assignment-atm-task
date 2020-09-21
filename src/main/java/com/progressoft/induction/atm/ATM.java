package com.progressoft.induction.atm;

import java.math.BigDecimal;
import java.util.List;

public interface ATM {

    List<Banknote> withdraw(long accountNumber, BigDecimal amount);
}
