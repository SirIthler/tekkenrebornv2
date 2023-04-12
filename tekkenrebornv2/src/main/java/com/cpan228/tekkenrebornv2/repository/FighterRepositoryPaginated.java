package com.cpan228.tekkenrebornv2.repository;

import com.cpan228.tekkenrebornv2.model.Fighter;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FighterRepositoryPaginated extends PagingAndSortingRepository<Fighter, Long> {

}
