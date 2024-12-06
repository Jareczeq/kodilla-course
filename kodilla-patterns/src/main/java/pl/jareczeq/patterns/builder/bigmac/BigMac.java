package pl.jareczeq.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {

    private final Bun bun;
    private final int burgers;
    private final Sauce sauce;
    private List<Ingredient> ingredients;

    private BigMac(Bun bun, int burgers, Sauce sauce, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigMacBuilder {
        private Bun bun;
        private int burgers;
        private Sauce sauce;
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigMacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }

    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public enum Bun {
        WITH_SESAME, WITHOUT_SESAME
    }

    public enum Sauce {
        STANDARD, SAUCE_OF_A_THOUSAND_ISLANDS, BARBEQUE
    }

    public enum Ingredient {
        SALAD, ONION, BACON, CUCUMBER, CHILI_PEPPERS, CHAMPIGNONS, SHRIMP, CHEESE
    }
}
