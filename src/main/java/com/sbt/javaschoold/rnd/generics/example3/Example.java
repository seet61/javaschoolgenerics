package com.sbt.javaschoold.rnd.generics.example3;

import com.sbt.javaschoold.rnd.generics.example3.entities.Credit;

public class Example {
    public static void main(String[] args) {
        Credit credit = CreditUtils.createCredit();

        System.out.println(credit);
    }
}
