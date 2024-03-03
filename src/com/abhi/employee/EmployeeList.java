package com.abhi.employee;

import com.abhi.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {

    public static void main(String[] args) {

        List<Employee> list=
                Stream.of(
                        new Employee(1,"abhinav","kumar",21,"male","cse","mumbai",12,Arrays.asList("12345","45678")),
                        new Employee(2,"sudhir","mahto",31,"male","dev","bhopal",45,Arrays.asList("333","354")),
                        new Employee(3,"mohan","jain",31,"male","dev","bhopal",144,Arrays.asList("333","354")),
                        new Employee(4,"smriti","prakash",16,"female","doctor","patna",23,Arrays.asList("45456","33354")),
                        new Employee(5,"ram","prakash",16,"male","doctor","patna",35,Arrays.asList("45456","33354")),
                        new Employee(6,"smriti","prakash",161,"female","doctor","patna",25,Arrays.asList("45456","33354"))

                ).collect(Collectors.toList());


        //find employee having rank between 1to 50

        List<Employee> collect = list.stream()
                .filter(e -> e.getRank() >= 1 && e.getRank() <= 50)
                .collect(Collectors.toList());

        //System.out.println(collect);

        // find the student in specific city and if sort them by their name ascending order

        List<Employee> collect1 = list.stream().filter(e -> e.getCity() == "bhopal")
                .sorted(Comparator.comparing(Employee::getFirstName))
                .collect(Collectors.toList());
       // System.out.println(collect1);

        // find the student in specific city and if sort them by their name descending  order

        List<Employee> collect2 = list.stream().filter(e -> e.getCity() == "bhopal")
                .sorted(Comparator.comparing(Employee::getFirstName,Comparator.reverseOrder()))
                .collect(Collectors.toList());
       // System.out.println(collect2);

        //find all the available department
        List<String> collect3 = list.stream()
                .map(a -> a.getDepartment()).distinct().collect(Collectors.toList());

        System.out.println(collect3);

        //find all the contact no from student list

        List<String> collect4 = list.stream()
                .flatMap(e -> e.getContacts().stream())
                .distinct().collect(Collectors.toList());

        //System.out.println(collect4);

        //group the student by department name

        Map<String, List<Employee>> collect5 = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        //System.out.println(collect5);

//count  the student based on department name

        Map<String, Long> collect6 = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
      //  System.out.println(collect6);


// find maximum count of the student based on department name

        Map.Entry<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();

      //  System.out.println(map);


// find avg age of male and female
        Map<String, Double> collect7 = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        //System.out.println(collect7);


//find highest rank in each department

        Map<String, Optional<Employee>> collect8 = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getRank))));

       // System.out.println(collect8);


//find 2nd lowest rank employee

        List<Employee> collect9 = list.stream()
                .sorted(Comparator.comparing(Employee::getRank,Comparator.reverseOrder())).limit(2).skip(1).collect(Collectors.toList());

       // System.out.println(collect9);



//find 2nd highest rank employee

    List<Employee> collect10 = list.stream()
            .sorted(Comparator.comparing(Employee::getRank)).limit(2).skip(1).collect(Collectors.toList());

        //System.out.println(collect10);

}

}
