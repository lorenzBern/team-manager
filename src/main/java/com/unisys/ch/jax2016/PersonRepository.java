package com.unisys.ch.jax2016;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by escobar on 31.05.16.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
    
    List<Person> findByNachname(@Param("nachname") String nachname);
}
