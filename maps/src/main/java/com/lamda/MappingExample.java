package com.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//by using sorted method in stream class  we are arranging in a sorted ord

    public class MappingExample {
        public static void main(String[] args) {
            List<Employee> li = new ArrayList();
            li.add(new Employee(101, "sandeep", 24, 4500, "hyd"));
            li.add(new Employee(102, "sudheer", 23, 5000, "rjy"));

            li.add(new Employee(104, "chandu", 34, 14500, "chni"));
            li.add(new Employee(105, "durga", 40, 4500, "vizag"));
            li.add(new Employee(103, "shyam", 29, 6000, "bng"));
            li.stream().sorted(Comparator.comparingInt(Employee::getId))
                    .forEach(e -> System.out.println(e.getId() + " " + e.getName() + " "
                            + e.getAge() + " " + e.getSalary() + " " + e.getVillage()));

        }
        }
