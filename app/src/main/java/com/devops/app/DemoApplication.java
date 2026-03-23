package com.devops.app;

import com.devops.app.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Map;
import java.util.HashMap;

@SpringBootApplication
@RestController
public class DemoApplication {

    private final UserService userService;

    // Konstruktor do wstrzykiwania UserService
    public DemoApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @PostMapping("/public/register")
    public String register(@RequestParam String user, @RequestParam String pass) {
        userService.register(user, pass);
        return "Konto zalozone dla: " + user + ". Mozesz sie teraz zalogowac!";
    }

    @GetMapping("/")
    public Map<String, Object> home(@AuthenticationPrincipal UserDetails user) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Witaj " + user.getUsername() + "!");
        response.put("info", "Twoje konto zostalo pobrane z bazy PostgreSQL.");
        return response;
    }
}