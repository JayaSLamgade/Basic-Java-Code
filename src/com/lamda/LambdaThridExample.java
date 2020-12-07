package com.lamda;

import java.util.*;

class Data{
    private String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class LambdaThridExample {
    public static void main(String[] args){
        List<Names> list = new ArrayList<>();
        list.add(new Names("Utsav "));
        list.add(new Names("Jaya "));
        list.add(new Names("Jenny "));
        list.add(new Names("Selena "));

        /*Collections.sort(list, new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }); */

        //Same method using Lambda expression
        Collections.sort(list,(Names o1, Names o2)-> o1.getName().compareTo(o2.getName()));

        for(Names data:list){
            System.out.print(data.getName());
        }
    }
}
