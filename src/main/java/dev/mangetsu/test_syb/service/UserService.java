package dev.mangetsu.test_syb.service;

import dev.mangetsu.test_syb.model.User;
import dev.mangetsu.test_syb.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> listALlUser()
    {
        return userRepository.findAll();
    }

    public void saveUser(User user)
    {
        userRepository.save(user);
    }

    public User getUser(Integer id)
    {
        return userRepository.findById(id).get();
    }

    public void deleteUser(Integer id)
    {
        userRepository.deleteById(id);
    }
}
