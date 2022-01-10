package ListsDemo;


import java.util.Iterator;
import java.util.TreeSet;

import ListsDemo.beans.Employee;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee(101, "Jacob", "Kula", "j19kula@gmail.com"));
        employees.add(new Employee(102, "Meredith", "Kula", "m4jkula@gmail.com"));
        employees.add(new Employee(103, "Joshua", "Kula", "jkula@gmail.com"));
        employees.add(new Employee(104, "Jordan", "Kula", "Jordan@gmail.com"));
        employees.add(Employee.parseEmployee("105, Jeff, Kula, jkula@ryder.com"));

        Employee emp102 = new Employee(102, "J", "K", "L");
        employees.add(emp102);

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            System.out.println(employee.toCSV());
        }
    }
}