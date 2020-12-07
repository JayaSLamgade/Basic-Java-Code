package com.lamda;

//How to use forEach loop in lambda expression

import java.util.ArrayList;
import java.util.List;

class Info{
    private String name;

    public Info(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
public class Lambda8thExample {
    public static void main(String[] args) {
        List<Info> list = new ArrayList<>();
        list.add(new Info("Rita"));
        list.add(new Info("Sunny"));
        list.add(new Info("Adam"));
        list.add(new Info("Britney"));

        list.forEach(temp->{
            System.out.println(temp.getName());
        });
    }
}