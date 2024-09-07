package com.consumption.crud.repositories;

import com.consumption.crud.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel, Integer> {
}
