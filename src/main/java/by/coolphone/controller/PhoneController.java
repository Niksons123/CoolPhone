package by.coolphone.controller;

import by.coolphone.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class PhoneController {

    private final PhoneService phoneService;

    @GetMapping
    private String getPhones(Model model){
        model.addAttribute("phones", phoneService.getAllPhones());
        return "index";
    }

}
