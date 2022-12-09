package com.demo.datasource.getIndividualData.service;

import com.demo.datasource.getIndividualData.model.Person;
import com.demo.datasource.getIndividualData.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getIndividuals() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> getIndividual(int id) {
        return personRepository.findById(id);
    }

    @Override
    public void addPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }
}
