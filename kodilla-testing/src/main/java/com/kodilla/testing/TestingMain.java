package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        Calculator calculator = new Calculator();
        int a = calculator.add(10, 20);
        int b = calculator.subtract(30, 5);

        if (a == 30) {
            System.out.println("Dodawanie działa jak należy!");
        } else {
            System.out.println("Dodawanie nie działą jak należy!");
        }

        if (b == 25) {
            System.out.println("Odejmowanie działa jak należy!");
        } else {
            System.out.println("Odejmowanie nie działa jak należy!");
        }

    }
}