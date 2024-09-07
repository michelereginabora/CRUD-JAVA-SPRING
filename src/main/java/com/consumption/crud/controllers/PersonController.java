package com.consumption.crud.controllers;

import com.consumption.crud.models.PersonModel;
import com.consumption.crud.repositories.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@CrossOrigin("*")
@AllArgsConstructor
public class PersonController {
    private PersonRepository personRepository;

    @GetMapping
    public ResponseEntity<List<PersonModel>> getAllPersons() {
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PersonModel> createNewPerson(@RequestBody PersonModel newPerson) {
        newPerson.setId(null);
        return new ResponseEntity<>(personRepository.save(newPerson), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<PersonModel> editPerson(@RequestBody PersonModel newPerson) {
        newPerson.setId(null);
        return new ResponseEntity<>(personRepository.save(newPerson), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteNewPerson(@PathVariable Integer id) {

        personRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
