package com.lamda;

interface  Lambda{
    public void demo();
}
public class App {

    public static void main(String[] args){
        Lambda lam = ()-> System.out.println("Hi my name is Jaya");
        lam.demo();
    }
}
//We need to have functional interface if we want to use lambda expression