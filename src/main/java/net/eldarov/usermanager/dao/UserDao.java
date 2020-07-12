package net.eldarov.usermanager.dao;

import net.eldarov.usermanager.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);

    public List<User> listUser();

    public void removeUser(Integer id);

    public void updateUser(User user);

    public User getUserById(int id);
}
