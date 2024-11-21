package pl.jareczeq.kodillaspring.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

    @Override
    public String draw() {
        return "This is a triangle";
    }
}
