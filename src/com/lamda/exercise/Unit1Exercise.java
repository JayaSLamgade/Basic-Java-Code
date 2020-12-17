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


     private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p: people) {
            if (condition.test(p)){
                System.out.println(p);
            }

        }
    }
}
interface Condition{
    boolean test(Person p);
        }
