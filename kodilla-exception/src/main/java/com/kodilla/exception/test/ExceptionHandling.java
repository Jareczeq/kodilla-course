package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1.9, 3));
        } catch (Exception e) {
            System.out.println("x mustn't be higher or equal than 2 and y mustn't be equal than 1.5");
        } finally {
            System.out.println("Finished!");
        }
    }

}
