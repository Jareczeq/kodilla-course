package pl.jareczeq.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class PizzaTestSuite {

    @Test
    void testNewPizza() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("Mushrooms")
                .build();
        System.out.println(pizza);

        //When
        int countOfIngredients = pizza.getIngredients().size();

        //Then
        assertEquals(3, countOfIngredients);
    }

}
