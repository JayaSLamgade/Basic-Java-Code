package com.lamda.collection;

import com.lamda.exercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationEx {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
             new Person("Emma", "Watson",31),
             new Person("Emilia","Clarke",35),
             new Person("Coco","Chanel",70),
             new Person("Charles","Dickens",60),
             new Person("Kit","Harington", 34)
        );
        System.out.println("Using lambda for each loop: ");
        people.forEach(p-> System.out.println(p));
        System.out.println(" ");
        System.out.println("***************************************************************");
        System.out.println(" ");
        System.out.println("forEach loop by using method reference: ");
        people.forEach(System.out::println);
    }
}
