package microservice.provider.user.repository;

import microservice.provider.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author CK
 * @describe：
 * @date 2017/11/1 15:31
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
