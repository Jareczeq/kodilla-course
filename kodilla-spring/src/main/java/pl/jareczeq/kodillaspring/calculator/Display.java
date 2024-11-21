package pl.jareczeq.kodillaspring.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Display {

    public void displayValue(double val) {
        System.out.println(val);
    }



}
