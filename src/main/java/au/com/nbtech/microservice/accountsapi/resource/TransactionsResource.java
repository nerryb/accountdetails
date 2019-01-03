package au.com.nbtech.microservice.accountsapi.resource;

import au.com.nbtech.microservice.accountsapi.domain.dto.Transaction;
import au.com.nbtech.microservice.accountsapi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(
        path="/transactions",
        produces= APPLICATION_JSON_UTF8_VALUE)
public class TransactionsResource {

    @Autowired
    private TransactionService transactionService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{accountNumber}")
    public List<Transaction> getAccounts(@PathVariable("accountNumber") String accountNumber) {
        return transactionService.getAccountTransactions(Long.valueOf(accountNumber));
    }
    
}
