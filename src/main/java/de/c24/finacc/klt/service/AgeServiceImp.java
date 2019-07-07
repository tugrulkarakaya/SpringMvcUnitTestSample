package de.c24.finacc.klt.service;

import de.c24.finacc.klt.Repository.PersonRepository;
import de.c24.finacc.klt.payload.Person;
import de.c24.finacc.klt.service.Generation.AgeFactory;
import de.c24.finacc.klt.service.Generation.AgeStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgeServiceImp implements AgeService {

    @Override
    public String analyzeAge(int age) {
        return AgeFactory.getAgeObject(age).showAgeMessage();
    }

    @Override
    public List<Person> getAllRecords() {
        return PersonRepository.Instance.GetAllRecords();
    }


}


