package max.hruslov.service.impl;

import lombok.RequiredArgsConstructor;
import max.hruslov.model.User;
import org.springframework.stereotype.Service;
import max.hruslov.repository.UserRepository;
import max.hruslov.service.CurrentUserService;

@Service
@RequiredArgsConstructor
public class CurrentUserServiceImpl implements CurrentUserService {

    private final UserRepository userRepository;

    @Override
    public User getCurrentUser() {

//        return userRepository.findOne(1L);
        return null;
    }
}
