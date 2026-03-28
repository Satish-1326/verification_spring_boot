package loginExample.loginlogout.service;

import loginExample.loginlogout.entity.User;
import loginExample.loginlogout.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository repo;

    // ✅ LOGIN
    public User login(String username, String password) {

        User user = repo.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }

    // ✅ REGISTER (VERY IMPORTANT)
    public User register(String username, String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println("Saving user: " + username);
        return repo.save(user);   // 🔥 inserts into DB
    }
}