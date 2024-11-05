package music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import music.entity.User;
import music.repository.UserRepository;

@Component
public class SecurityCustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username); // Assuming the method is findByEmail
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return user; // Ensure User implements UserDetails
    }
}
