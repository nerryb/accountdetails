package au.com.nbtech.microservice.accountsapi.resource;

import au.com.nbtech.microservice.accountsapi.dataaccess.UserDao;
import au.com.nbtech.microservice.accountsapi.resource.api.SignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping(
        path="/user",
        produces= APPLICATION_JSON_UTF8_VALUE)
public class UserResource {
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody SignUpRequest user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        applicationUserRepository.save(user);
    }
}
