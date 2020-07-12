package net.eldarov.usermanager.service;

import net.eldarov.usermanager.dao.UserDao;
import net.eldarov.usermanager.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return this.userDao.getUserById(id);
    }

    @Transactional
    public List<User> listUser() {
        return this.userDao.listUser();
    }
    @Transactional
    public void removeUser(int id) {
        this.userDao.removeUser(id);
    }
    @Transactional
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }
}
