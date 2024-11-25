package pl.jareczeq.kodillaspring.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

    @Override
    public String  draw() {
        System.out.println("This is a circle");
        return "This is a circle";
    }

}
