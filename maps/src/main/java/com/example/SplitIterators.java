package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplitIterators {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList();
        li.add(545);
        li.add(546);
        li.add(547);
        li.add(548);
        li.add(549);
        li.add(550);
        Spliterator<Integer> split1=li.spliterator();
        System.out.println(split1.estimateSize());//it will find the length of the list
        Spliterator<Integer> split2=split1.trySplit();//it will split the list into two part
        split1.forEachRemaining(System.out::println);
        System.out.println("==============");
        split2.forEachRemaining(System.out::println);
        System.out.println("==============");
        Spliterator<Integer> split3=li.spliterator();
        split3.forEachRemaining(System.out::println);//it will print object one by one
        System.out.println("==============");
        Spliterator<Integer> split4=li.spliterator();
        while(split4.tryAdvance(System.out::println));//it will give the boolean value as out

    }
}
