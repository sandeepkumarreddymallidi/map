package com.lamda;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Employee> lamda=new ArrayList();

        Employee emp=new Employee();
        emp.setId(45);
        emp.setName("sandeep");
        lamda.add(emp);
        Employee emp2=new Employee();
        emp2.setName("sudheer");
        emp2.setId(46);
        lamda.add(emp2);
        lamda.forEach((e)->System.out.println(e.getId()+"  "+e.getName()));

    }
}
