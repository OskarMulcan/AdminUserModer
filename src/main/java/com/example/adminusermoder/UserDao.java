package com.example.adminusermoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserDao {
    @Autowired
    private UserRepo userRepo;

    public void save(@RequestBody User user) {userRepo.save(user);}
    public List<User> findAll() {return userRepo.findAll();}
    public List<User> findAllByName(@RequestParam String name) {return findAllByName(name);}
    public void deleteById(@RequestParam Long id) {userRepo.deleteById(id);}
}
