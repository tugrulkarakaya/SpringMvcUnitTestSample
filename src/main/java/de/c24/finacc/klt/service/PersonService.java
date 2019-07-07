package de.c24.finacc.klt.service;

import de.c24.finacc.klt.payload.Person;

import java.util.List;

public interface PersonService {
    void savePerson(Person person);
    List<Person> getAllRecords();
}
