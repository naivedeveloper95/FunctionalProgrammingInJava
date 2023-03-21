package org.satyam.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering phone number " +
            customer.customerPhoneNo);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerBiFunction = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNo : "**********"));

    public static void main(String[] args) {

        Customer customer = new Customer("Maria", "9876906789");
        greetCustomer(customer);

        greetCustomerV2(customer, false);

        greetCustomerConsumer.accept(customer);
        greetCustomerConsumerBiFunction.accept(customer, false);

    }

    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNo : "**********"));
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhoneNo);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNo;

        public Customer(String customerName, String customerPhoneNo) {
            this.customerName = customerName;
            this.customerPhoneNo = customerPhoneNo;
        }
    }
}
