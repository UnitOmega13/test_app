package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class CurrentUserService {
    private Long currentUserID = 1L;

    @Autowired
    private UserRepository userRepository;

    public User getCurrentUser() {
        return userRepository.findOne(currentUserID);
    }
}
