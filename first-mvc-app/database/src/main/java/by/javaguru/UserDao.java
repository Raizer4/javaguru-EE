package by.javaguru;

import java.util.Optional;

public class UserDao {

    public Optional<User> findById(Long id){
        User user = new User();
        user.setName("Andrei");
        return Optional.of(user);
    }

}
