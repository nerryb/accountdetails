package au.com.nbtech.microservice.accountsapi.resource;

import au.com.nbtech.microservice.accountsapi.domain.dto.Account;
import au.com.nbtech.microservice.accountsapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(
        path="/accounts",
        produces= APPLICATION_JSON_UTF8_VALUE)
public class AccountsResource {

    @Autowired
    private AccountService accountService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{customerNumber}")
    public List<Account> getAccounts(@PathVariable("customerNumber") String customerNumber) {
        return accountService.getCustomerAccounts(customerNumber);
    }
}
