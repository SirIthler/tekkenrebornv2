package com.cpan228.tekkenrebornv2.repository;

import com.cpan228.tekkenrebornv2.model.Fighter;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FighterRepository extends CrudRepository<Fighter, Long>{
    List<Fighter> findByAnimeFrom(Fighter.Anime anime);
    List<Fighter> findByNameStartsWithAndCreatedAtBetween(String name, LocalDate startDate, LocalDate endDate);
}
