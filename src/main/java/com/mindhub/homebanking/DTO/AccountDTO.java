package com.mindhub.homebanking.DTO;

import com.mindhub.homebanking.Models.Account;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class AccountDTO {
    private Long id;
    private String number;
    private LocalDateTime creationDate;
    private Double balance;
    private List<TransactionDTO> transactions;

    public AccountDTO(Account account) {
        id = account.getId();
        number = account.getNumber();
        creationDate = account.getCreationDate();
        balance = account.getBalance();
        transactions = account.getTransactions().stream().map(TransactionDTO::new).collect(Collectors.toList());
    }

    public Long getId() { return id; }
    public String getNumber() {
        return number;
    }
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    public Double getBalance() {
        return balance;
    }
    public List<TransactionDTO> getTransactions() {
        return transactions;
    }
}