package com.example.simpleecommerceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.simpleecommerceapp.entity.User;
import com.example.simpleecommerceapp.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
	private CrudRepository<User, Long> userRepo;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public boolean verifyCredentials(String email, String password) {

        User user = userRepository.findFirstByEmail(email);

        if (user == null) {
            return false;
        }

        return user.getPassword().equals(password);
    }

    public User findUserByEmail(String email) {
        return userRepository.findFirstByEmail(email);
    }
    public void deleteUser(Long id) {
		userRepo.findById(id).orElseThrow(() -> new RuntimeException("User with id " + id + " not found"));
		userRepo.deleteById(id);
	}
}