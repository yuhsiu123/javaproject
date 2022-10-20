package org.example.application.users.repository;

import org.example.application.users.model.User;

import java.util.List;

public interface UserRepository {
    User save(User user);

    List<User> findAll();

    User delete(User user);
}
