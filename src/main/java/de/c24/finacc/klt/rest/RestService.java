package de.c24.finacc.klt.rest;

import de.c24.finacc.klt.model.Person;
import de.c24.finacc.klt.service.AgeService;
import de.c24.finacc.klt.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Rest Resource
 */
@Path("")
@Produces("application/json")
public class RestService {

    @Autowired
    AgeService ageService;

    @Autowired
    PersonService personService;
    /**
     * Ping
     */
    @GET
    @Path("/ping")
    public Map<String, String> ping() {
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("ping", "ok");
        return returnMap;

    }

    /**
     * Ping
     */
    @GET
    @Path("/age/{age}")
    public String age(@PathParam("age") Integer age) {
        return ageService.analyzeAge(age);
    }

    @GET
    @Path("/age/allRecords")
    public List<Person> allRecords() {
        return personService.getAllRecords();
    }
}
