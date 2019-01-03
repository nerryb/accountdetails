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
@Table(name = "ACCOUNT_TRANSACTION")
public class TransactionDab implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ACCOUNT_NUMBER")
    private Long accountNumber;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "VALUE_DATE")
    private LocalDate valueDate;

    @Column(name = "CURRENCY_CODE")
    private String currencyCode;

    @Column(name = "DEBIT_AMOUNT")
    private BigDecimal debitAmount;

    @Column(name = "CREDIT_AMOUNT")
    private BigDecimal creditAmount;

    @Column(name = "OPERATION_TYPE")
    private String operationType;

    @Column(name = "TRANSACTION_DESC")
    private String transactionDesc;
}
