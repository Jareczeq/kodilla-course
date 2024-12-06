package pl.jareczeq.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigMacTestSuite {

    @Test
    void testCountOfBurgers() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(BigMac.Bun.WITH_SESAME)
                .burgers(3)
                .sauce(BigMac.Sauce.STANDARD)
                .ingredient(BigMac.Ingredient.CHEESE)
                .ingredient(BigMac.Ingredient.CUCUMBER)
                .build();

        //When
        int countOfBurgers = bigMac.getBurgers();

        //Then
        assertEquals(3, countOfBurgers);
    }

    @Test
    void testTypeOfBun() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(BigMac.Bun.WITHOUT_SESAME)
                .burgers(1)
                .sauce(BigMac.Sauce.STANDARD)
                .ingredient(BigMac.Ingredient.CHEESE)
                .ingredient(BigMac.Ingredient.CUCUMBER)
                .build();

        //When & Then
        assertEquals(BigMac.Bun.WITHOUT_SESAME, bigMac.getBun());
    }

    @Test
    void testTypeOfSauce() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(BigMac.Bun.WITH_SESAME)
                .burgers(1)
                .sauce(BigMac.Sauce.SAUCE_OF_A_THOUSAND_ISLANDS)
                .ingredient(BigMac.Ingredient.CHEESE)
                .ingredient(BigMac.Ingredient.CUCUMBER)
                .build();

        //When & Then
        assertEquals(BigMac.Sauce.SAUCE_OF_A_THOUSAND_ISLANDS, bigMac.getSauce());

    }

    @Test
    void testIngredient() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(BigMac.Bun.WITH_SESAME)
                .burgers(1)
                .sauce(BigMac.Sauce.STANDARD)
                .ingredient(BigMac.Ingredient.CHEESE)
                .ingredient(BigMac.Ingredient.ONION)
                .ingredient(BigMac.Ingredient.CHAMPIGNONS)
                .build();

        //When & Then
        assertEquals(List.of(BigMac.Ingredient.CHEESE, BigMac.Ingredient.ONION, BigMac.Ingredient.CHAMPIGNONS), bigMac.getIngredients());
    }

}
