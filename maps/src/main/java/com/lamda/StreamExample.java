package com.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Employee> li=new ArrayList();
        li.add(new Employee(101,"sandeep",24,4500,"hyd"));
        li.add(new Employee(102,"sudheer",23,5000,"rjy"));

        li.add(new Employee(104,"chandu",34,14500,"chni"));
        li.add(new Employee(105,"durga",40,4500,"vizag"));
        li.add(new Employee(103,"shyam",29,6000,"bng"));

        System.out.println("========================printing all objects in the list=====================");
        li.forEach((e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getVillage()));
      System.out.println("===================getting sorted list by id==========================");
       List<Employee> em=li.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
       em.forEach((e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getVillage()));
        System.out.println("====================get name in the list=========================");
       List<String>lt1= li.stream().map(e->e.getName()).collect(Collectors.toList());
       System.out.println(lt1);
        System.out.println("==============name wise order===============================");
       List<Employee> list=li.stream().sorted(Comparator.comparing(Employee::getName,String.CASE_INSENSITIVE_ORDER)).collect(Collectors.toList());
       list.forEach((e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getVillage()));
        System.out.println("================getting lowest village name object=============================");
        Optional<Employee> emp=li.stream().min(Comparator.comparing(Employee::getVillage,String.CASE_INSENSITIVE_ORDER));
       System.out.println(emp);
        System.out.println("===================get first object==========================");
        Optional<Employee> emp2=li.stream().findFirst();
        System.out.println(emp2);
        System.out.println("===============getting number objects in the list==============================");
       System.out.println(li.stream().count());
        System.out.println("=====================using filter method and getting the object========================");
        List<Employee> fi=li.stream().filter((e)->e.getSalary()==4500).collect(Collectors.toList());
        fi.forEach((e)->System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getSalary()+" "+e.getVillage()));
        System.out.println("==========================checks the object values is there or not===================");
      Boolean b=li.stream().filter((e)->e.getSalary()==4500).findAny().isPresent();
             System.out.println(b);
        System.out.println("=============================================");



}
}
