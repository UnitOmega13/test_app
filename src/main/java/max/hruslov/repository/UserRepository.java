package max.hruslov.repository;

import max.hruslov.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findByName(String username);

    User findAllByUserID(long userID);

}
