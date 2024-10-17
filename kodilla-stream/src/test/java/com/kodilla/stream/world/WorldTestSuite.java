package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal(38000000));
        Country germany = new Country("Poland", new BigDecimal(84000000));
        Country italian = new Country("Poland", new BigDecimal(50000000));

        Continent europe = new Continent("Europe", List.of(poland, germany, italian));

        Country china = new Country("China", new BigDecimal(70000000));
        Country northKorea = new Country("North Korea", new BigDecimal(25000000));
        Country southKorea = new Country("South Korea", new BigDecimal(50000000));

        Continent asia = new Continent("Asia", List.of(china, northKorea, southKorea));

        World world = new World(List.of(europe, asia));

        //When
        BigDecimal countPeopleInTheWorld = world.getPeopleQuantity();

        //Then
        assertEquals(new BigDecimal(317000000), countPeopleInTheWorld);
    }

}
