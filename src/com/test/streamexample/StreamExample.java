/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.streamexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Prabhath
 * This is a simple example for explaining Java 8
 * New For Each in Java 8
 * Streams in Java 8
 * Filters with Streams in Java 8
 */
public class StreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "EmployeeOne", 5000));
        employeeList.add(new Employee(2, "EmployeeTwo", 5001));
        employeeList.add(new Employee(3, "EmployeeThree", 5002));
        employeeList.add(new Employee(4, "EmployeeFour", 5003));
        
        //Iterating over a Stream
        employeeList.forEach(employee->System.out.println(employee.getEmpName()));
        
        
        //Iterating filter with if loop
        employeeList.forEach(employee-> { if("EmployeeOne".equals(employee.getEmpName())){
            System.out.println("Hello Employee is there");
        }
        });
        
        
        //Stream and Filter the list and take the necessary data other than Employee Four
         System.out.println(employeeList.stream().filter(employ -> !employ.getEmpName()
                 .equalsIgnoreCase("EmployeeFour")).collect(Collectors.toList()));
        
    }

}
