package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Flights {

    public String findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();

        airports.put("Paryż", false);
        airports.put("Londyn", true);

        if (!airports.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Departure Airport not found");
        } else {
            if (airports.get(flight.getDepartureAirport())) {
                return flight.getDepartureAirport();
            } else {
                return null;
            }
        }
    }

}
