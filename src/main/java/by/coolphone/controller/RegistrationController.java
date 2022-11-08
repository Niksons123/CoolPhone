package by.coolphone.controller;

import by.coolphone.dto.UserDto;
import by.coolphone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegistrationController {
    private final UserService userService;

    @GetMapping
    private String registerPage() {
        return "register";
    }

    @PostMapping
    private String register(UserDto user) {
        if (!userService.exists(user)) {
            userService.save(user);
        }
        return "index";
    }
}
