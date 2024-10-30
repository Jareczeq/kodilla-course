package com.kodilla.exception.test;

public class RouteNotFountExceptionRunner {

    public static void main(String[] args) {
        Flights flights = new Flights();
        Flight flight = new Flight("Warszawa", "Rzym");

        try {
            System.out.println(flights.findFlight(flight));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
