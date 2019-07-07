package de.c24.finacc.klt.Repository;

import de.c24.finacc.klt.model.Person;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonRepositoryCustom {
    List<Person> findAllPeoplePagination(Pageable pageable);
}
