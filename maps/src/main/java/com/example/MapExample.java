package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Long,String> map=new HashMap<>();
        map.put(9573158754l,"sandeep");
        map.put(9857555555l,"sudheer");
        map.put(8754755545l,"sundhar");
        map.put(8547855555l,"ramesh");
        map.put(8795585545l,"ramesh");
        map.put(7895445524l,"ravi");
        map.put(9855857545l,"karthik");
       Set<Entry<Long,String>> elements=map.entrySet();
        Iterator<Entry<Long,String>> iterator= elements.iterator();
        while(iterator.hasNext()){
            Entry<Long,String> values=iterator.next();
            System.out.println(values.getValue()+"   "+values.getKey());
        }
        for (Entry<Long,String> m:map.entrySet()) {
            System.out.println(m.getKey()+"   "+m.getValue());
        }
        Iterator<Entry<Long,String>> iterator2= elements.iterator();
        while(iterator2.hasNext()){
            Entry<Long,String>values=iterator2.next();
            if(values.getValue()=="ramesh"){
                System.out.println(values.getValue()+"   "+values.getKey());
            }
        }
        map.forEach((key,value)->System.out.println(key+"  "+value));


    }
}
