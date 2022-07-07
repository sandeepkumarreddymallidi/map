package com.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//map is used to convert one object form to another form
public class Example3 {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("1","2","3","4");
        System.out.println(list);
       List<Integer> li=list.stream().map(Integer::valueOf).collect(Collectors.toList());
       System.out.println(li);
       if(li.contains(1)){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }

       if(list.contains("1")){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }

        }
}
