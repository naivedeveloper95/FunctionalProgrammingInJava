package org.satyam.Combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {


    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCCESS :
                ValidationResult.EMAIL_INVALID;
    }

    static CustomerRegistrationValidator isPhNoValid() {
        return customer -> customer.getPhoneNumber().startsWith("+0") ?
                ValidationResult.SUCCESS :
                ValidationResult.PHONE_NUMBER_INVALID;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDateOfBirth(), LocalDate.now()).getYears() > 16 ?
                ValidationResult.SUCCESS :
                ValidationResult.IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult validationResult = this.apply(customer);
            return validationResult.equals(ValidationResult.SUCCESS) ? other.apply(customer) : validationResult;
        };
    }
}
