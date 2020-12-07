package com.lamda;
import java.util.*;

class Names {
    private String name;

    public Names(String name) {
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
public class LambdaForthExample {
    public static void main(String[] args){
        List<Names> list = new ArrayList<>();
        list.add(new Names("Lita "));
        list.add(new Names("Mandy "));
        list.add(new Names("Nina "));
        list.add(new Names("Octavia "));

        //lambda expression when we have multiple conditions
        Collections.sort(list,(Names o1, Names o2)-> {
            if(o1.getName().length() < o2.getName().length()){
                return -1;
            }else if(o1.getName().length() < o2.getName().length()){
                return 1;
            }else{
                return 0;
            }
        });

        for(Names data:list){
            System.out.print(data.getName());
        }
    }
}
