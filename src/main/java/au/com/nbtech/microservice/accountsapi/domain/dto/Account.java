package au.com.nbtech.microservice.accountsapi.domain.dto;



import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
@Setter
public class Account {
    @NonNull
    private Long accountNumber;
    private String accountType;
    private String accountName;
    private LocalDate balanceDate;
    private String currencyCode;
    @NonNull
    private BigDecimal availableBalance;
    private String customerNumber;
}
