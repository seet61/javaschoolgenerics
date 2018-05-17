package com.sbt.javaschoold.rnd.generics.example1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Box<List<Date>, String> stringBox = new Box<>();

        stringBox.setK(new ArrayList<Date>());

        stringBox.getK().add(new Date());

        System.out.println(stringBox);

    }
}
