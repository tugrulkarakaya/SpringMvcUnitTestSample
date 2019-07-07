package de.c24.finacc.klt.service;

import de.c24.finacc.klt.Repository.PersonRepository;
import de.c24.finacc.klt.payload.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImp implements PersonService {

    @Override
    public void savePerson(Person person) {
        PersonRepository.Instance.addPerson(person);
    }
}
