package com.system.concerts.service;

import com.system.concerts.entity.User;
import com.system.concerts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User saveUser(User user){ return repository.save(user);}

    public List<User> saveUsers(List<User> users){ return repository.saveAll(users);}

    public List<User> getUsers(){ return  repository.findAll();}

    public User getUserById(int id){return  repository.findById(id).orElse(null);}

    public User getUserByUsername(String username){return  repository.findByUsername(username);}

    public String deleteUser(int id){
        repository.deleteById(id);
        return "user " +id+ " removed!!!";
    }

    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setSurname(user.getSurname());
        existingUser.setUsername(user.getUsername());
        existingUser.setPassword(user.getPassword());
        existingUser.setEmail(user.getEmail());
        existingUser.setRole(user.getRole());

        return repository.save(existingUser);
    }
}
