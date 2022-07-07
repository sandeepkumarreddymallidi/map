package com.example;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(545);
        li.add(545);
        li.add(545);
        li.add(545);
        li.add(545);
        System.out.println(li.spliterator());
    }
}
