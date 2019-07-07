package de.c24.finacc.klt.service;

import de.c24.finacc.klt.Repository.PersonRepository;
import de.c24.finacc.klt.payload.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
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

        Mockito.when(personRepository.getPersonByName(eq("Tugrul"))).thenReturn(personList.get(0));
        Mockito.when(personRepository.GetAllRecords()).thenReturn(personList);
    }

    @Test
    public void testAllRecords() {
        List<Person> personList = personRepository.GetAllRecords();
        assertThat(personList.size()).isEqualTo(2);
    }

    @Test
    public void testgetByName() {
        Person found = personRepository.getPersonByName("Tugrul");
        assertThat(found.getLastName()).isEqualTo("Karakaya");
    }
}
