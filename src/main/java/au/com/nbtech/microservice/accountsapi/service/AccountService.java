package au.com.nbtech.microservice.accountsapi.service;

import au.com.nbtech.microservice.accountsapi.dataaccess.AccountDao;
import au.com.nbtech.microservice.accountsapi.domain.entity.AccountDab;
import au.com.nbtech.microservice.accountsapi.domain.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> getCustomerAccounts(String customerNumber) {
        List<AccountDab> accountDabs = accountDao.findByCustomerNumber(customerNumber);
        List<Account> accounts = new ArrayList<>();
        for (AccountDab accountDab : accountDabs) {

            accounts.add(Account.builder()
            .accountNumber(accountDab.getAccountNumber())
            .accountName(accountDab.getAccountName())
            .accountType(accountDab.getAccountType())
            .balanceDate(accountDab.getBalanceDate())
            .currencyCode(accountDab.getCurrencyCode())
            .availableBalance(accountDab.getAvailableBalance())
            .build());
        }
        return accounts;
    }
}
