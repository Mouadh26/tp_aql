package org.example.tp3.Exo1;
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User getUserById(long id){
        return userRepository.findUserById(id);
    }

}
