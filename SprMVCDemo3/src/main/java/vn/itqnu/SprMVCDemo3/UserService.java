package vn.itqnu.SprMVCDemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.itqnu.SprMVCDemo3.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean validateUser(String username, String password) {
        return userRepository.checkUser(username, password);
    }
}

