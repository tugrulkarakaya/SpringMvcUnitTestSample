package de.c24.finacc.klt.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
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
