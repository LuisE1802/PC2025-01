package pe.edu.upc.pc2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.pc2.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);

}
