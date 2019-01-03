package au.com.nbtech.microservice.accountsapi.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "CUSTOMER_ACCOUNT")
public class AccountDab implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountNumber;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "BALANCE_DATE")
    private LocalDate balanceDate;

    @Column(name = "CURRENCY_CODE")
    private String currencyCode;

    @Column(name = "AVL_BALACE")
    private BigDecimal availableBalance;

    @Column(name = "CUSTOMER_NUMBER")
    private String customerNumber;
}
