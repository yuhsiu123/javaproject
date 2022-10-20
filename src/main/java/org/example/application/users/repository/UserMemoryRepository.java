package org.example.application.users.repository;

import org.example.application.users.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserMemoryRepository implements UserRepository{

    private final List<User> users;

    public UserMemoryRepository(){
        this.users = new ArrayList<>();
        //this.users.add(new User("kienboec","daniel"));
    }

    public User save(User user) {
        this.users.add(user);
        return user;
    }

    public List<User> findAll() {
        return this.users;
    }


    public User delete(User user) {
        this.users.remove(user);
        return user;
    }
}
