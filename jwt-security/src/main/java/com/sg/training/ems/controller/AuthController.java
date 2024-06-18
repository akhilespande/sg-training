package com.sg.training.ems.controller;

import com.sg.training.ems.domain.AuthenticationResponse;
import com.sg.training.ems.domain.User;
import com.sg.training.ems.service.UserService;
import com.sg.training.ems.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        logger.info("Registering user: {}", user.getUsername());
        if (userService.findByUsername(user.getUsername()) != null) {
            logger.error("User already exists: {}", user.getUsername());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User already exists");
        }
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userService.saveUser(user);
        logger.info("User registered successfully: {}", user.getUsername());
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody User user) {
        logger.info("Authenticating user: {}", user.getUsername());
        User existingUser = userService.findByUsername(user.getUsername());
        if (existingUser != null && new BCryptPasswordEncoder().matches(user.getPassword(), existingUser.getPassword())) {
            String token = jwtUtil.generateToken(user.getUsername());
            logger.info("Authentication successful for user: {}", user.getUsername());
            return ResponseEntity.ok(new AuthenticationResponse(token));
        } else {
            logger.error("Invalid credentials for user: {}", user.getUsername());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
