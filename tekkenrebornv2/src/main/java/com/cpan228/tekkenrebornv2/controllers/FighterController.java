//package com.cpan228.tekkenrebornv2.controllers;
//
//import com.cpan228.tekkenrebornv2.repository.FighterRepository;
//import com.cpan228.tekkenrebornv2.model.Fighter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//@RequestMapping("/fighters")
//public class FighterController {
//
//    @Autowired
//    private FighterRepository fighterRepository;
//
//    @GetMapping("/all")
//    public String getAllFighters(Model model) {
//        Iterable<Fighter> fighters = fighterRepository.findAll();
//        model.addAttribute("fighters", fighters);
//        return "fighters";
//    }
//
//}
