package au.com.nbtech.microservice.accountsapi.service;

import au.com.nbtech.microservice.accountsapi.dataaccess.TransactionDao;
import au.com.nbtech.microservice.accountsapi.domain.dto.Transaction;
import au.com.nbtech.microservice.accountsapi.domain.entity.TransactionDab;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class TransactionService {

    @Autowired
    private TransactionDao transactionDao;

    public List<Transaction> getAccountTransactions(Long accountNumber) {
        List<TransactionDab> transactionDabs = transactionDao.findByAccountNumber(accountNumber);
        List<Transaction> transactions = new ArrayList<>();
        for (TransactionDab transactionDab : transactionDabs) {

            transactions.add(Transaction.builder()
                    .accountNumber(transactionDab.getAccountNumber())
                    .accountName(transactionDab.getAccountName())
                    .valueDate(transactionDab.getValueDate())
                    .currencyCode(transactionDab.getCurrencyCode())
                    .debitAmount(transactionDab.getDebitAmount())
                    .creditAmount(transactionDab.getCreditAmount())
                    .operationType(transactionDab.getOperationType())
                    .transactionDesc(transactionDab.getTransactionDesc())
                    .build());
        }
        return transactions;
    }
}
