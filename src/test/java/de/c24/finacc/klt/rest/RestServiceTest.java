package de.c24.finacc.klt.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import de.c24.finacc.klt.Repository.PersonRepository;
import de.c24.finacc.klt.model.Person;
import de.c24.finacc.klt.service.PersonService;
import de.c24.finacc.klt.service.PersonServiceImp;
import de.c24.finacc.klt.web.controller.IndexController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
/**
 * tests a little bit RestService
 */
@RunWith(SpringRunner.class)
public class RestServiceTest {


    @MockBean
    PersonService personService;

    @InjectMocks
    IndexController indexController;

    private MockMvc mockMvc;

    @TestConfiguration
    static class BookServiceImplTestContextConfiguration {
        @Bean
        public PersonService personService() {
            return new PersonServiceImp();
        }

    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(24,"Tugrul", "Karakaya"));
        personList.add(new Person(33,"First Name","Last Name"));

        Mockito.when(personService.getAllRecords()).thenReturn(personList);

        mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
    }

    /**
     * testit
     */
    @Test
    public void restTestit() {
        RestService restService = new RestService();
        Map<String, String> testMap = restService.ping();
        assertEquals("ok", testMap.get("ping"));
    }

    @Test
    public void frontPageController() throws Exception {
        this.mockMvc.perform(get("/list"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("listPeople"));
    }
}
