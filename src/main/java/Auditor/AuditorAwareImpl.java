package Auditor;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import service.CurrentUserService;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<User> {
    @Autowired
    private CurrentUserService currentUserService;

    @Override
    public Optional<User> getCurrentAuditor() {
        return Optional.ofNullable(currentUserService.getCurrentUser());
    }
}
