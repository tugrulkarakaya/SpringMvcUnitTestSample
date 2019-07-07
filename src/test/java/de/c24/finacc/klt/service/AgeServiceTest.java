package de.c24.finacc.klt.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;



@RunWith(SpringRunner.class)
public class AgeServiceTest {


    //This config is not necesseeray now but I am planning to have different settings later on if I have enough time
    @TestConfiguration
    static class AgeServiceImplTestContextConfiguration {
        @Bean
        public AgeService ageService() {
            return new AgeServiceImp();
        }
    }



    @Autowired
    AgeService ageService;

    @Test
    public void testYoungCall() {
        String message= ageService.analyzeAge(15);
        assertThat(message).isEqualTo("Young");
    }
    @Test
    public void testOldCall() {
        String message= ageService.analyzeAge(88);
        assertThat(message).isEqualTo("Too Old");
    }
    @Test
    public void testYoungPrime() {
        String message= ageService.analyzeAge(23);
        assertThat(message).isEqualTo("Funny");
    }
}
