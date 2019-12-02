package max.hruslov.service.impl;

import lombok.RequiredArgsConstructor;
import max.hruslov.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import max.hruslov.repository.UserRepository;
import max.hruslov.service.CurrentUserService;

@Service
@RequiredArgsConstructor
public class CurrentUserServiceImpl implements CurrentUserService {

    private UserRepository userRepository;

    @Autowired
    public void userRepositoryDI(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User getCurrentUser() {
        return userRepository.findAllByUserID(1L);
    }
}
