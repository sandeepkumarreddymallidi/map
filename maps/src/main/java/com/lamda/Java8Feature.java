package com.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
public class Java8Feature {
    public static void main(String[] args) {
        Java8Feature obj = new Java8Feature();
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");
        Map<String, Integer> map = obj.convertListToMap(list, x -> x.length());
       System.out.println(map);    // {node=4, c++=3, java=4, javascript=10}
        Map<String, Integer> map2 = obj.convertListToMap(list, obj::getLength);
        System.out.println(map2);
    }



    public <T, R> Map<T, R> convertListToMap(List<T> list,Function<T,R> func) {
        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;
    }
    public Integer getLength(String str) {
        return str.length();
    }

}
