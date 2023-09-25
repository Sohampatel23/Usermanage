package com.submit.user.management.service;

import com.submit.user.management.model.User;
import com.submit.user.management.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String addUser(User user) {
        iUserRepo.save(user);
        return "user added";
    }

    public User findById(Integer userId) {
        return  iUserRepo.findById(userId).get();
    }


    public List<User> findAll() {
        return (List<User>) iUserRepo.findAll();
    }


    public String updateEmail(Integer userId, String email) {
         iUserRepo.findById(userId)
                .map(user -> {
                    user.setEmail(email);
                     iUserRepo.save(user);

                    return "user updated";
                });

        return "user not found";
    }

    public String deleteById(Integer userId) {
        iUserRepo.deleteById(userId);
        return "User deleted";
    }
}
