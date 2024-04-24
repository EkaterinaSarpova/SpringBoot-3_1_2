package com.example.SpringBoot3_1_2.DAO;

import com.example.SpringBoot3_1_2.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    void updateUser(User user);
}
