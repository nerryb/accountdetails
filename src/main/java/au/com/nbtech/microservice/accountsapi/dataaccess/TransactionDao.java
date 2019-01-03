package au.com.nbtech.microservice.accountsapi.dataaccess;

import au.com.nbtech.microservice.accountsapi.domain.entity.TransactionDab;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionDao extends JpaRepository<TransactionDab, Long> {
    List<TransactionDab> findByAccountNumber(Long accountNumber);
}
