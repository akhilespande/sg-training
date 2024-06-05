package com.sg.training.banking.service;

import com.sg.training.banking.domain.Account;
import com.sg.training.banking.domain.Transaction;
import com.sg.training.banking.exception.AccountNotFoundException;
import com.sg.training.banking.exception.InsufficientFundsException;
import com.sg.training.banking.repository.AccountRepository;
import com.sg.training.banking.repository.TransactionRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService{

    private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);
    private AccountRepository accountRepository;
    private TransactionRepository transactionRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository, TransactionRepository transactionRepository) {
    this.accountRepository= accountRepository;
    this.transactionRepository= transactionRepository;
    }

    /**
     * @param account
     * @return
     */
    @Override
    public Account createAccount(Account account) {
        log.info("Creating a new account with account number: [{}]", account.getAccountNumber());
        account.setBalance(0.0);
        Account createdAccount = accountRepository.save(account);
        log.info("Account created successfully with account id: [{}]", createdAccount.getId());
        return createdAccount;
    }

    /**
     * @param accountNumber
     * @param amount
     * @return
     */
    @Override
    public Account deposit(String accountNumber, Double amount) {
        Account account ;
        log.info("Depositing [{}] to account number : [{}]", amount, accountNumber);
        try {
             account = accountRepository.findByAccountNumber(accountNumber).orElseThrow(()-> new AccountNotFoundException("Acount not found"));
        } catch (AccountNotFoundException e) {
            throw new RuntimeException(e);
        }

        account.setBalance(account.getBalance()+amount);
        accountRepository.save(account);

        Transaction transaction = new Transaction();
        transaction.setTransactionType("Deposit");
        transaction.setAmount(amount);
        transaction.setTransactionDate(LocalDateTime.now());
        transaction.setAccount(account);
        transactionRepository.save(transaction);

        log.info("Deposit successful ! New Balance [{}] ", account.getBalance());
        return account;
    }

    /**
     * @param accountNumber
     * @param amount
     * @return
     */
    @Override
    public Account withdraw(String accountNumber, Double amount) {
        Account account;
        log.info("Withdrawing [{}] from account number [{}]", amount, accountNumber);

        try {
             account = accountRepository.findByAccountNumber(accountNumber).orElseThrow(()-> new AccountNotFoundException("Account Not Found ..."));
        } catch (AccountNotFoundException e) {
            throw new RuntimeException(e);
        }

        if(account.getBalance()<amount){
            try {
                log.error("Insufficient Funds for account number: [{}]", accountNumber);
                throw new InsufficientFundsException("Insufficient Funds");
            } catch (InsufficientFundsException e) {
                throw new RuntimeException(e);
            }
        }
        account.setBalance(account.getBalance()-amount);
        accountRepository.save(account);

        Transaction transaction = new Transaction();
        transaction.setTransactionType("Withdraw");
        transaction.setAccount(account);
        transaction.setAmount(amount);
        transaction.setTransactionDate(LocalDateTime.now());
        transactionRepository.save(transaction);

        log.info("Withdraw successful ! New Balance [{}]", account.getBalance());

        return account;
    }

    /**
     * @param accountNumber
     * @return
     */
    @Override
    public Double checkBalance(String accountNumber) {
        Account account;
        log.info("Checking balance for account number: [{}]", accountNumber);

        try {
            account = accountRepository.findByAccountNumber(accountNumber).orElseThrow(() -> new AccountNotFoundException("Account Not found !"));
        } catch (AccountNotFoundException e) {
            throw new RuntimeException(e);
        }

        return account.getBalance();
    }
}
