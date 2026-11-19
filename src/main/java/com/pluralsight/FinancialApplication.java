package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class FinancialApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", new BigDecimal("12500"));
        Valuable account2 = new BankAccount("Gary", "456", new BigDecimal("1500"));
        // try to deposit money into both accounts
//        account1.deposit(new BigDecimal("100"));

        // Cannot resolve method 'deposit' in 'Valuable'. Although account2 is an BankAccount object, its type is still
        // valuable. Since .deposit() is not explicitly defined in Valuable, it errors out.
//        account2.deposit(new BigDecimal("100"));

    }
}
