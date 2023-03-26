package org.satyam.finalSection;

import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {

        hello("John", null, value -> {
            System.out.println("Last name not provided for " + value + "\n");
        });

        helloNew("John", "Montana", () -> {
            System.out.println("Last name not provided");
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callBack) {
        System.out.println(firstName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callBack.accept(firstName);
        }
    }

    static void helloNew(String firstName, String lastName, Runnable callBack) {
        System.out.println(firstName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callBack.run();
        }
    }
}
