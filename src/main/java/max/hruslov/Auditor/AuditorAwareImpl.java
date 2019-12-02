package max.hruslov.Auditor;

import max.hruslov.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;
import max.hruslov.service.CurrentUserService;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<User> {
    @Autowired
    private CurrentUserService currentUserService;

    @Override
    public Optional<User> getCurrentAuditor() {
        return Optional.ofNullable(currentUserService.getCurrentUser());
    }
}
