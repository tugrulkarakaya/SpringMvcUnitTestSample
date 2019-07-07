package de.c24.finacc.klt.service;

import de.c24.finacc.klt.Repository.PersonRepository;
import de.c24.finacc.klt.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public List<Person> getAllRecords() {
        Pageable pageable = PageRequest.of(0,  100, Sort.Direction.DESC, "publishedDate");
        List<Person> people=  personRepository.findAllPeoplePagination(pageable);
        return people;
    }
}
