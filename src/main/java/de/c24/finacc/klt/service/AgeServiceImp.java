package de.c24.finacc.klt.service;

import de.c24.finacc.klt.service.Generation.AgeFactory;
import org.springframework.stereotype.Service;

@Service
public class AgeServiceImp implements AgeService {

    @Override
    public String analyzeAge(int age) {
        return AgeFactory.getAgeObject(age).showAgeMessage();
    }




}


