package com.lamda;

//By using lambda expression we can write the runnable method using thread in one simple line.
public class LambdaSecondExample {
    public static void main(String[] args) {
        //normal implementation
        /* Thread td = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am inside Thread");
            }
        }); */

        //implementation using thread
        new Thread(()->System.out.println("I am inside Thread")).start();
    }
}
