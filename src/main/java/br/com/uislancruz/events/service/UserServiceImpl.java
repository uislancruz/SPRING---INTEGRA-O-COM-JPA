package br.com.uislancruz.events.service;

import br.com.uislancruz.events.model.User;
import br.com.uislancruz.events.repo.UserRepo;

import java.util.List;

public class UserServiceImpl implements IUserService{

    private UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("User " +id+ "not found"));
    }

    @Override
    public User getUserByEmail(String email) {
        return repo.findByEmail(email).orElseThrow(() -> new RuntimeException("User " +email+ "not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
