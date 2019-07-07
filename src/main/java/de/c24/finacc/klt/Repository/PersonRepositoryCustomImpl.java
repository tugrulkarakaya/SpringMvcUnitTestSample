package de.c24.finacc.klt.Repository;

import de.c24.finacc.klt.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Person> findAllPeoplePagination(Pageable pageable) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> query = cb.createQuery(Person.class);

        Root<Person> book = query.from(Person.class);

        List<Predicate> predicates = new ArrayList<>();

        return entityManager.createQuery(query).setFirstResult(pageable.getPageNumber()*pageable.getPageSize()).setMaxResults(pageable.getPageSize()).getResultList();
    }
}
