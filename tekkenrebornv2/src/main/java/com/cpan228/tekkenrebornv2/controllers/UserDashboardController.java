package com.cpan228.tekkenrebornv2.controllers;

import com.cpan228.tekkenrebornv2.model.dto.TekkenUserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/userdashboard")
@CrossOrigin(origins = "http://localhost:8080")
public class UserDashboardController {
    private RestTemplate restTemplate;

    public UserDashboardController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String dashboard() {
        return "userdashboard";
    }

    @ModelAttribute("users")
    public List<TekkenUserDto> getUsers() {
        var users = restTemplate.getForObject("http://localhost:8082/api/userdashboard", TekkenUserDto[].class);
        return Arrays.asList(users);

    }


}
