package com.lamda;

// How to use loop on a lambda expression

import java.util.ArrayList;
import java.util.List;

public class LambdaSeventhExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(83);
        list.add(53);
        list.add(987);

        /*for(Integer i : list){
            if (i>=10){
                System.out.println(i);
            }
        } */
        //In forEach loop you don't need to mention the type of variable
        list.forEach(i-> {
            if (i>=10){
                System.out.println(i);
            }
        });
    }
}
