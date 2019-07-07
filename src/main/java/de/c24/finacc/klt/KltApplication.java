package de.c24.finacc.klt;

import de.c24.finacc.klt.service.PersonService;
import de.c24.finacc.klt.service.PersonServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * The spring application
 */
@SpringBootApplication
public class KltApplication extends SpringBootServletInitializer {

    @Bean
    public PersonService getPersonService(){
        return new PersonServiceImp();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(KltApplication.class);
    }
}
