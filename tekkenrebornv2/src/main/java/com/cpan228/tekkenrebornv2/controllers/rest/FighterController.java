package com.cpan228.tekkenrebornv2.controllers.rest;

import com.cpan228.tekkenrebornv2.model.Fighter;
import com.cpan228.tekkenrebornv2.model.dto.CreateFighter;
import com.cpan228.tekkenrebornv2.repository.FighterRepository;
import com.cpan228.tekkenrebornv2.repository.FighterRepositoryPaginated;
import jakarta.validation.Valid;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/fighters", produces = "application/json")
public class FighterController {

    private final FighterRepositoryPaginated fighterRepositoryPaginated;

    private final FighterRepository fighterRepository;

    public FighterController(FighterRepositoryPaginated fighterRepositoryPaginated,
                             FighterRepository fighterRepository) {
        this.fighterRepositoryPaginated = fighterRepositoryPaginated;
        this.fighterRepository = fighterRepository;
    }

    @GetMapping
    public Iterable<Fighter> allFighters(@RequestParam("page") Optional<Integer> page,
                                         @RequestParam("size") Optional<Integer> size) {
        if (!page.isPresent() || !size.isPresent()) {
            return fighterRepository.findAll();
        } else {
            return fighterRepositoryPaginated.findAll(PageRequest.of(page.get(), size.get()));
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFighter(@PathVariable("id") Long id) {
        fighterRepository.deleteById(id);
    }

    @PostMapping
    public Fighter createFighter(@Valid @RequestBody CreateFighter fighter) {
        return fighterRepository.save(fighter.toFighter());
    }

    @PutMapping("/{id}")
    public Fighter updateFighter(@PathVariable("id") Long id,
                                 @Valid @RequestBody CreateFighter fighter) {
        var fighterToUpdate = fighterRepository.findById(id).orElseThrow();
        fighterToUpdate.setName(fighter.getName());
        fighterToUpdate.setAnimeFrom(fighter.getAnimeFrom());
        fighterToUpdate.setDamagePerHit(fighter.getDamagePerHit());
        fighterToUpdate.setHealth(fighter.getHealth());
        fighterToUpdate.setResistance(fighter.getResistance());
        return fighterRepository.save(fighterToUpdate);
    }

}
