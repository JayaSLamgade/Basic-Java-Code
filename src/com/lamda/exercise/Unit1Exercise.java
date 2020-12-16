package com.lamda.exercise;

// sorting people with their last name

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Harry", "Potter", 30),
                new Person("John", "Snow", 28),
                new Person("Ron", "Wesley", 29),
                new Person("Arya", "Stak", 20),
                new Person("James", "Bond", 35)
        );
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        printAll(people);


    }

    private static void printAll(List<Person> people){
        for (Person p: people) {
            System.out.println(p);
        }
    }
}
