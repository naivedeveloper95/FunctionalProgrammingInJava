package org.satyam.streams;

import java.util.List;

public class _Stream {

    public static void main(String[] args) {

        List<_Stream.Person> personList = List.of(
                new _Stream.Person("John", _Stream.Gender.MALE),
                new _Stream.Person("Maria", _Stream.Gender.FEMALE),
                new _Stream.Person("Ayesha", _Stream.Gender.FEMALE),
                new _Stream.Person("Alex", _Stream.Gender.MALE),
                new _Stream.Person("Alice", _Stream.Gender.FEMALE)
        );

//        Function<Person, String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = System.out::println;

        personList.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final _Stream.Gender gender;

        Person(String name, _Stream.Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
        }
    }
}
