package com.demo.datasource.getIndividualData.service;

import com.demo.datasource.getIndividualData.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    List<Person> getIndividuals();

    Optional<Person> getIndividual(int id);

    void addPerson(Person person);

    void deletePerson(int id);

}
