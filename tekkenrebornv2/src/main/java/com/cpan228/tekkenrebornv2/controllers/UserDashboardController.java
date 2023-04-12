package com.cpan228.tekkenrebornv2.controllers;

import com.cpan228.tekkenrebornv2.model.TekkenUser;
import com.cpan228.tekkenrebornv2.model.dto.TekkenUserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/userdashboard")
public class UserDashboardController {

    @GetMapping
    public List<TekkenUser> getUsers() {
        var usersStream = Stream.of(new TekkenUser("Bob", 10, 6, 1), new TekkenUser("Brad", 11, 5, 1),
                new TekkenUser("Joel", 13, 6, 3));
        return usersStream.sorted(Comparator.comparing(TekkenUser::getWins)).collect(Collectors.toList());

    }

}