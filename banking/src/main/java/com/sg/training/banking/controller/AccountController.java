package com.sg.training.banking.controller;

import com.sg.training.banking.domain.Account;
import com.sg.training.banking.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("v1/api/accounts")
public class AccountController {
    private static final Logger log = LoggerFactory.getLogger(AccountController.class);
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("account")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
    log.info("Received request to create account ...");
    Account createdAccount = accountService.createAccount(account);
    return ResponseEntity.ok(createdAccount);
    }

    @PostMapping("deposit")
    public ResponseEntity<Account> deposit(@RequestParam String accountNumber, @RequestParam Double amount){
        log.info("Received request to deposit [{}] to account [{}]", amount, accountNumber);
        Account updatedAccount = accountService.deposit(accountNumber, amount);
        return ResponseEntity.ok(updatedAccount);
    }

    @PostMapping("withdraw")
    public ResponseEntity<Account> withdraw( @RequestParam String accountNumber , @RequestParam Double amount){
        log.info("received request to withdraw [{}] from account [{}]",accountNumber, amount);
        Account updatedAccount = accountService.withdraw(accountNumber,amount);

        return ResponseEntity.ok(updatedAccount);
    }

    @GetMapping("balance")
    public ResponseEntity<Double> checkBalance(@RequestParam String accountNumber){
        log.info("Received request for balance for account [{}]", accountNumber);

        Double balance = accountService.checkBalance(accountNumber);
        return ResponseEntity.ok(balance);
    }
}
