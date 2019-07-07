package de.c24.finacc.klt.rest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Map;

/**
 * tests a little bit RestService
 */
public class RestServiceTest {

    /**
     * testit
     */
    @Test
    public void restTestit() {
        RestService restService = new RestService();
        Map<String, String> testMap = restService.ping();
        assertEquals("ok", testMap.get("ping"));
    }
}
