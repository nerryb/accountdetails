package au.com.nbtech.microservice.accountsapi.dataaccess;

import au.com.nbtech.microservice.accountsapi.domain.entity.UserDab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserDab, Long> {
    UserDab findByUserName(String userName);
}
