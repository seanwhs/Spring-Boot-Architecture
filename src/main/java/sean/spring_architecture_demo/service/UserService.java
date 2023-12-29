// UserService.java
package sean.spring_architecture_demo.service;

import java.util.List;
import sean.spring_architecture_demo.model.User;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    void saveUser(User user);
    void updateUser(Long id, User updatedUser);
    void deleteUser(Long id);
}