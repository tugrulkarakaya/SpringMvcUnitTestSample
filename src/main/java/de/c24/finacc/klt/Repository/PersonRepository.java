package de.c24.finacc.klt.Repository;

import de.c24.finacc.klt.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person,Long>, PersonRepositoryCustom {
    Optional<Person> findById(Long personId);
}
