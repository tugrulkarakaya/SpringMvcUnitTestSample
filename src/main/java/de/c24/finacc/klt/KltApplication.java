package de.c24.finacc.klt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The spring application
 */
@SpringBootApplication
public class KltApplication extends SpringBootServletInitializer {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(KltApplication.class);
    }
}
