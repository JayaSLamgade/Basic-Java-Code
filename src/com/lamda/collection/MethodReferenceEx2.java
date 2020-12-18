package com.lamda.collection;

import com.lamda.exercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceEx2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Harry", "Potter", 30),
                new Person("John", "Snow", 28),
                new Person("Ron", "Wesley", 29),
                new Person("Arya", "Stak", 20),
                new Person("James", "Bond", 35)
        );

        System.out.println("Information: ");
        printConditionally(people, p -> true, System.out::println); //p -> method(p)
    }


    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p: people) {
            if (predicate.test(p)){
                consumer.accept(p);
            }

        }
    }
}
