package com.lamda;

//how to return a value using Lambda expression
interface Lambda4{
    abstract public int demo();
}

public class LambdaSixthExample {
    public static void main(String[] args){

        // this return value 10
        //Lambda4 la4 = ()-> 10;

        //we can also perform operations as well and it will return an answer only in int value because demo method is returning int.
        //Lambda4 la4 = ()->(10*4-1+43);
        //using return statement with multiple line
        Lambda4 la4 = ()->{
            System.out.print("The answer of 3+4*13-3 is: ");
            return (3+4*13-3);
        };
        System.out.println(la4.demo());
    }
}

