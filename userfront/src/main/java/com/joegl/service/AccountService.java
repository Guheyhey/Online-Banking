package com.joegl.service;

import com.joegl.domain.PrimaryAccount;
import com.joegl.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {

    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
//    void deposit(String accountType, double amount, Principal principal);
//    void withdraw(String accountType, double amount, Principal principal);
}
