package org.satyam.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumberThree = phoneNumber -> phoneNumber.contains("3");

    public static void main(String[] args) {

        System.out.println("\nWith Predicate \n");

        System.out.println(isPhoneNumberValidPredicate.test("07098700000"));
        System.out.println(isPhoneNumberValidPredicate.test("09001234501"));

        System.out.println("\nPredicate Chaining.\n");

        System.out.println("Is phone number valid and contains number 3? " + isPhoneNumberValidPredicate.and(containsNumberThree).test("07098730000"));

        System.out.println("Is phone number valid OR contains number 3? " + isPhoneNumberValidPredicate.or(containsNumberThree).test("07098700000"));

        System.out.println("\nWithout Predicate \n");

        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09009863001"));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}

