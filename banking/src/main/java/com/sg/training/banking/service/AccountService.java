package com.sg.training.banking.service;

import com.sg.training.banking.domain.Account;

public interface AccountService {
    Account createAccount(Account account);
    Account deposit(String accountNumber, Double amount);
    Account withdraw(String accountNumber, Double amount);
    Double checkBalance(String accountNumber);
}
