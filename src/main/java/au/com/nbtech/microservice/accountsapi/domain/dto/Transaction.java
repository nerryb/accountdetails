package au.com.nbtech.microservice.accountsapi.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Setter
@Getter
public class Transaction {
    private Long accountNumber;
    private String accountName;
    private LocalDate valueDate;
    private String currencyCode;
    private BigDecimal debitAmount;
    private BigDecimal creditAmount;
    private String operationType;
    private String transactionDesc;
}
