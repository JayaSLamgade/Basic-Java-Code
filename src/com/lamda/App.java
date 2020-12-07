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
