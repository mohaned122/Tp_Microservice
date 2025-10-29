package tn.tp.dev.auth_service;

import io.jsonwebtoken.Claims;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        if ("admin".equals(user.getUsername()) && "1234".equals(user.getPassword())) {
            return jwtService.generateToken(user.getUsername());
        }
        return "Invalid credentials";
    }

    @GetMapping("/ressource")
    public String getRessouce(@RequestHeader("Authorization") String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return "Missing or invalid Authorization header";
        }
        String token = authHeader.substring(7); // remove "Bearer "
        Claims claims = jwtService.validateToken(token);
        if (claims != null && !claims.isEmpty()) {
            return "success";
        }
        return "Invalid credentials";
    }

}