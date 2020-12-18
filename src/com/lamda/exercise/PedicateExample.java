package com.lamda.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PedicateExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Harry", "Potter", 30),
                new Person("John", "Snow", 28),
                new Person("Ron", "Wesley", 29),
                new Person("Arya", "Stak", 20),
                new Person("James", "Bond", 35)
        );
        //Sorting list by its last name
        Collections.sort(people, (p1, p2)-> p1.getLastName().compareTo(p2.getLastName()));

        System.out.println("Information: ");
        //print all the information
        printConditionally(people, p -> true);
        System.out.println("******************************************************");
        System.out.println("Print last name start with S");
        //printing names who's last name starts with S
        printConditionally(people, p -> p.getLastName().startsWith("S"));

    }


    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for (Person p: people) {
            if (predicate.test(p)){
                System.out.println(p);
            }

        }
    }
}
