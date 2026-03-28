package loginExample.loginlogout.controller;

import jakarta.servlet.http.HttpSession;
import loginExample.loginlogout.dto.LoginRequest;
import loginExample.loginlogout.entity.User;
import loginExample.loginlogout.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class AuthController {
    @Autowired
    private AuthService service;

    // LOGIN
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request, HttpSession session) {

        User user = service.login(request.getUsername(), request.getPassword());

        if (user != null) {
            session.setAttribute("user", user);  // store user in session
            return "Login Successful";
        }

        return "Invalid Username or Password";
    }

    // LOGOUT
    @PostMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate(); // destroy session
        return "Logout Successful";
    }

    // CHECK SESSION (optional)
    @GetMapping("/profile")
    public Object getProfile(HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "Not Logged In";
        }

        return user;
    }
}
