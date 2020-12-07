package com.lamda;

// How to use predicates using lambda expression

import java.util.function.IntPredicate;

public class LambdaWithPredicate {
    public static void main(String[] args) {
        //without using lamda
        /*IntPredicate lessThan18 = new IntPredicate() {
            @Override
            public boolean test(int value) {
                if(value<18){
                    return true;
                } else{
                    return false;
                }
            }
        }; */

        //With lambda, where i is a temporary variable
        /*IntPredicate lessThan18 = i->i<18;
        System.out.println(lessThan18.test(45)); */

        //Using multiple predicates
        IntPredicate lessThan18 = i->i>18;
        IntPredicate MoreThan10 = i->i>10;
        System.out.println(lessThan18.and(MoreThan10).test(15));

    }
}
