package com.lamda;

// how to pass parameters in lambda expression
interface Lambda3{
    abstract public void demo(int x, float z);
}

public class LambdaFifthExample {
    public static void main(String[] args){
        Lambda3 la3 = (int a, float b)-> {
            System.out.println("Enrolling Number: "+ a);
            System.out.println("Salary per hour: "+b);
        };
        la3.demo(1234, 24.98f);
    }
}
