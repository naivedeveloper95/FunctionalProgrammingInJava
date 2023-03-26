package org.satyam.finalSection;

import java.util.function.BiFunction;

public class Lambdas {

    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCase = (name, age) -> {
            if (name.isBlank()) throw new IllegalArgumentException();
            System.out.println(age);
            return name.toUpperCase();
        };

        String upperCased = upperCase.apply("Alex", 37);

        System.out.println(upperCased);
    }
}
