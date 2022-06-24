package trmio.libsvcs.data.service;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import trmio.libsvcs.data.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUsername(String username);
}