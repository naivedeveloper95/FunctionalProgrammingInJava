package org.satyam.Optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Object object1 = Optional.ofNullable("Hello").orElseGet(() -> "Default Value");

        Object object2 = Optional.ofNullable("Hello").orElseThrow(() -> new IllegalStateException("Exception"));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email."));
    }
}
