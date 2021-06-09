package com.firstapp.crudoperation.services;

import java.util.List;
import com.firstapp.crudoperation.models.User;

public interface UserService {

    public List<User> getUsers();

    public User getUser(int id);

    public User createUser(User user);

    public User updateUser(User user);

    public User deleteUser(int id);
}
