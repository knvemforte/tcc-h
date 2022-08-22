package com.fiec.lpiiiback.services;

import com.fiec.lpiiiback.models.entities.User;

import java.io.File;
import java.util.List;

/**
 * Representa os casos de uso
 */
public interface UserService {
    User getProfile(String userId);
    User login(String email, String password);
    List<User> getAllUsers();
    User signUpUser(String name, String email, String password, String cpf);

    User updateUser(Integer userId, String name, String password, String cpf);

    void deleteUser(Integer userId);
    void assignImage(Integer userId, String filename);
}
