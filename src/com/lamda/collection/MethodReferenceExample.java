package com.lamda.collection;

public class MethodReferenceExample {

    public static void main(String[] args) {
        /*this how we write a method reference: (className::MethodName)
        this is exactly is same as writing lambda expression ()->printMessage() */
        Thread t = new Thread(MethodReferenceExample::printMessage );
        t.start();

    }
    public static void printMessage(){
        System.out.println("Hello");
    }
}
