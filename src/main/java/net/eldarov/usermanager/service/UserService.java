package net.eldarov.usermanager.service;



import net.eldarov.usermanager.model.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends UserDetailsService
{
    void addUser(User user);

    List<User> listUser();

    void removeUser(Long id);

    void updateUser(User user);

    User getUserById(Long id);
}
