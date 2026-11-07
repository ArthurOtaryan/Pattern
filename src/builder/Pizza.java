package builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Неизменяемый объект со множеством параметров, создаётся через Builder. */
public class Pizza {
    private final String size;
    private final String dough;
    private final boolean extraCheese;
    private final List<String> toppings;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.extraCheese = builder.extraCheese;
        this.toppings = Collections.unmodifiableList(new ArrayList<>(builder.toppings));
    }

    public static Builder builder(String size) {
        return new Builder(size);
    }

    @Override
    public String toString() {
        return "Пицца{размер=" + size + ", тесто=" + dough
                + ", доп.сыр=" + extraCheese + ", начинка=" + toppings + "}";
    }

    public static class Builder {
        private final String size;           // обязательный параметр
        private String dough = "тонкое";     // необязательные — со значениями по умолчанию
        private boolean extraCheese = false;
        private final List<String> toppings = new ArrayList<>();

        private Builder(String size) {
            this.size = size;
        }

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder extraCheese() {
            this.extraCheese = true;
            return this;
        }

        public Builder topping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            if (toppings.isEmpty()) {
                throw new IllegalStateException("Добавьте хотя бы одну начинку");
            }
            return new Pizza(this);
        }
    }
}
