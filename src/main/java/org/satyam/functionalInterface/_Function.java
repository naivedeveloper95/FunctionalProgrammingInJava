package org.satyam.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    static Function<Integer, Integer> incrementByOne = number -> number + 1;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static Function<Integer, Integer> addByOneAndThenMultiplyByTen = incrementByOne.andThen(multiplyByTen);
    static BiFunction<Integer, Integer, Integer> addByOneAndThenMultiplyByTenBiFunction =
            (numberToIncrByOne, numberToMultipleBy)
                    -> (numberToIncrByOne + 1) * numberToMultipleBy;

    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        Integer incr = incrementByOne.apply(1);
        System.out.println(incr);

        Integer multiply = multiplyByTen.apply(incr);
        System.out.println(multiply);

        Integer addAndThenMultiply = addByOneAndThenMultiplyByTen.apply(incr);
        System.out.println(addAndThenMultiply);

        // BiFunction
        System.out.println(incrementByOneAndMultipleByTen(4, 100));

        Integer addAndThenMultiplyBiFunction = addByOneAndThenMultiplyByTenBiFunction.apply(4, 100);
        System.out.println(addAndThenMultiplyBiFunction);
    }

    public static int increment(int number) {
        return number + 1;
    }

    public static int incrementByOneAndMultipleByTen(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }
}
