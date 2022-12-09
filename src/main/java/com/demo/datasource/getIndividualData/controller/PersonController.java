package com.demo.datasource.getIndividualData.controller;

import com.demo.datasource.getIndividualData.model.Person;
import com.demo.datasource.getIndividualData.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data-app")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/individuals")
    public List<Person> getIndividuals(){
        return personService.getIndividuals();
    }

    @GetMapping("/individuals/{id}")
    public Person getIndividual(@PathVariable int id){
        return personService.getIndividual(id).orElseThrow(() -> new RuntimeException());
    }

    @PostMapping("/individuals/individual")
    public ResponseEntity<?> addIndividual(@Valid @RequestBody Person person){
        personService.addPerson(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/individuals/{id}")
    public ResponseEntity<?> deleteIndividual(@PathVariable int id) {
        personService.getIndividual(id).orElseThrow(() -> new RuntimeException());
        personService.deletePerson(id);
        return ResponseEntity.noContent().build();
    }
}
