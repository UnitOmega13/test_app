package service.impl;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.CurrentUserService;

@Service
public class CurrentUserServiceImpl implements CurrentUserService {

    private final UserRepository userRepository;

    @Autowired
    public CurrentUserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getCurrentUser() {
        return userRepository.findOne(1L);
    }
}
