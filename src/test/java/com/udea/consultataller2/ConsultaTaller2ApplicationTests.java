package com.udea.consultataller2;

import com.fasterxml.jackson.databind.JsonNode;
import com.udea.consultataller2.controller.DataController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ConsultaTaller2ApplicationTests {

    @Autowired
    DataController dataController;

    @Test
    void health(){assertEquals("HEALTH CHECK OK!", dataController.healtCheck());}

    @Test
    void version() {assertEquals("The actual version is 1.0.0", dataController.version());}

    @Test
    void nationsLength() {
        Integer nationSLength = dataController.getRandomNations().size();
        assertEquals(10, nationSLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }

    @Test
    void testRandomCurrenciesCodeFormal(){
        DataController controller = new DataController();
        JsonNode response = controller.getRandomCurrencies();
        for (int i=0; i < response.size(); i++ ) {
            JsonNode currency = response.get(i);
            String code = currency.get("code").asText();
            assertTrue(code.matches("[A-Z]{3}"));
        }
    }

    @Test
    void testRandomNationsPerformance(){
        DataController controller = new DataController();
        long startTime = System.currentTimeMillis();
        controller.getRandomNations();
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);
        assertTrue(executionTime < 2000);
    }

    @Test
    void aviationLength(){
        Integer aviationLength = dataController.getRandomAviation().size();
        assertEquals(20, aviationLength);
    }

}
