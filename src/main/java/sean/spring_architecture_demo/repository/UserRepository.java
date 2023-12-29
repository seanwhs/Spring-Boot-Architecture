// UserRepository.java
package sean.spring_architecture_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sean.spring_architecture_demo.model.User;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Custom query for retrieving a user by ID
    User getUserById(Long id);

    // Custom query for updating (saving) an existing user by ID
    @Modifying
    @Query("UPDATE User u SET u.username = :username, u.email = :email WHERE u.id = :id")
    int updateUserById(Long id, String username, String email);

    // Custom query for retrieving all users
    List<User> findAll();

    // Custom query for deleting a user by ID
    void deleteById(Long id);
}
