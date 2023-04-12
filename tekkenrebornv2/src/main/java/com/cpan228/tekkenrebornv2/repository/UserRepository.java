package com.cpan228.tekkenrebornv2.repository;

import com.cpan228.tekkenrebornv2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
