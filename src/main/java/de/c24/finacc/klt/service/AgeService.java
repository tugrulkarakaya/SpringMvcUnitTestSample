package de.c24.finacc.klt.service;

import de.c24.finacc.klt.payload.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgeService {
    String analyzeAge(int age);
    List<Person> getAllRecords();
}
