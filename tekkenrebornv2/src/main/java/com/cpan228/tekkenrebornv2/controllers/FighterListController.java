package com.cpan228.tekkenrebornv2.controllers;
import com.cpan228.tekkenrebornv2.model.dto.FighterSearchByDateDto;

import com.cpan228.tekkenrebornv2.repository.FighterRepository;
import com.cpan228.tekkenrebornv2.repository.FighterRepositoryPaginated;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Controller
@RequestMapping("/fighterlist")
public class FighterListController {
    private FighterRepository fighterRepository;
    private static final int PAGE_SIZE = 5;
    private FighterRepositoryPaginated fighterRepositoryPaginated;

    public FighterListController(FighterRepository fighterRepository, FighterRepositoryPaginated fighterRepositoryPaginated) {
        this.fighterRepository = fighterRepository;
        this.fighterRepositoryPaginated = fighterRepositoryPaginated;
    }

    @GetMapping
    public String showFighters(Model model) {
        return "fighterlist";
    }

    @ModelAttribute
    public void fightersByDateDto(Model model) {
        model.addAttribute("fightersByDateDto", new FighterSearchByDateDto());
        var fighterPage = fighterRepositoryPaginated.findAll(PageRequest.of(0, PAGE_SIZE));
        model.addAttribute("fighters", fighterPage);
        model.addAttribute("currentPage", fighterPage.getNumber());
        model.addAttribute("totalPages", fighterPage.getTotalPages());
    }

    @PostMapping
    public String searchFightersByDate(@ModelAttribute FighterSearchByDateDto fightersByDateDto,
                                       Model model) {
        var dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        model.addAttribute("fighters", fighterRepository.findByNameStartsWithAndCreatedAtBetween(
                fightersByDateDto.getName(), LocalDate.parse(fightersByDateDto.getStartDate(), dateFormatter),
                LocalDate.parse(fightersByDateDto.getEndDate(), dateFormatter)));
        return "fighterlist";
    }

    @GetMapping("/switchPage")
    public String switchPage(Model model,
                             @RequestParam("pageToSwitch") Optional<Integer> pageToSwitch) {
        var page = pageToSwitch.orElse(0);
        var totalPages = (int) model.getAttribute("totalPages");
        if (page < 0 || page >= totalPages) {
            return "fighterlist";
        }
        var fighterPage = fighterRepositoryPaginated.findAll(PageRequest.of(pageToSwitch.orElse(0),
                PAGE_SIZE));
        model.addAttribute("fighters", fighterPage.getContent());
        model.addAttribute("currentPage", fighterPage.getNumber());
        return "fighterlist";
    }
}
