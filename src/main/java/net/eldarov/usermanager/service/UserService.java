package net.eldarov.usermanager.service;

import net.eldarov.usermanager.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService extends UserDetailsService
{
    public void addUser(User user);

    public List<User> listUser();

    public void removeUser(int id);

    public void updateUser(User user);

    public User getUserById(int id);

    @Override
    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
