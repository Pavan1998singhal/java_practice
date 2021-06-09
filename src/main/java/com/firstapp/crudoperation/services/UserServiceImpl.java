package com.firstapp.crudoperation.services;

import java.util.ArrayList;
import java.util.List;
import com.firstapp.crudoperation.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    List<User> userList;

    public UserServiceImpl() {

        userList = new ArrayList<>();
        userList.add(new User(1, "Pavan Singhal", 23));
        userList.add(new User(2, "Himanshu Mishra", 24));
        userList.add(new User(3, "Prayas Bansal", 25));
        userList.add(new User(4, "Pawan Kushwah", 26));
    }

    @Override
    public List<User> getUsers() {
        return userList;
    }

    @Override
    public User getUser(int id) {
        User user = null;
        for (User u : userList) {
            if (u.getId() == id) {
                user = u;
                break;
            }
        }
        return user;
    }

    @Override
    public User createUser(User user) {
        userList.add(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        for (User e : userList) {
            if (e.getId() == user.getId()) {
                userList.set((user.getId() - 1), user);
                return user;
            }
        }
        return null;
    }

    @Override
    public User deleteUser(int id) {
        for (User u : userList) {
            if (u.getId() == id) {
                userList.remove(id - 1);
                return u;
            }
        }
        return null;
    }

}
