package de.c24.finacc.klt.service;

import de.c24.finacc.klt.Repository.PersonRepository;
import de.c24.finacc.klt.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

@RunWith(SpringRunner.class)
public class PersonServiceTest {
    @MockBean
    PersonRepository personRepository;

    @Before
    public void setUp() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(24,"Tugrul", "Karakaya"));
        personList.add(new Person(33,"First Name","Last Name"));

        Mockito.when(personRepository.findAllPeoplePagination(any())).thenReturn(personList);
    }

    @Test
    public void testAllRecords() {
        Pageable pageable = PageRequest.of(0,  100, Sort.Direction.DESC, "publishedDate");
        List<Person> personList = personRepository.findAllPeoplePagination(pageable);
        assertThat(personList.size()).isEqualTo(2);
    }

}
