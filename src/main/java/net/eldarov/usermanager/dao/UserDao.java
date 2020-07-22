package net.eldarov.usermanager.dao;

import net.eldarov.usermanager.model.*;

import java.util.List;

public interface UserDao {
    public void addUser(User user);

    public List<User> listUser();

    public void removeUser(Long id);

    public void updateUser(User user);

    public User getUserById(Long id);

    User getUserByName(String name);
}
