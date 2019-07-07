package de.c24.finacc.klt.config;

import de.c24.finacc.klt.rest.RestService;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Jersey Config
 */
@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
    /**
     * Constructor
     */
    public JerseyConfig() {
        register(RestService.class);
    }
}
