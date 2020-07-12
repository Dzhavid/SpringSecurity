package net.eldarov.usermanager.service;

import net.eldarov.usermanager.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public List<User> listUser();

    public void removeUser(int id);

    public void updateUser(User user);

    public User getUserById(int id);
}
