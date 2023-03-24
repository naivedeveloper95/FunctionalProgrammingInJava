package org.satyam.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    static Supplier<List<String>> getDBConnectionUrlSupplier = () -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/urls"
    );

    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
