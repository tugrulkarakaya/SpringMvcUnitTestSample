package de.c24.finacc.klt.rest;

import java.util.HashMap;
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
    public Map<String, String> age(@PathParam("age") Integer age) {
        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("ping", "okk");
        return returnMap;
    }
}
