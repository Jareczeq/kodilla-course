package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public record World(List<Continent> continents) {

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.countries().stream())
                .map(Country::population)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
