package music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import music.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String gmail);
}
