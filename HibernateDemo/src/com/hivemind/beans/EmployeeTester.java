package com.hivemind.beans;
import com.hivemind.beans.Employee;
import com.hivemind.beans.EmployeeFactory;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee();
        Employee e2 = EmployeeFactory.getEmployee();

        if (e1 == e2) {
            System.out.println("Both e1 and e2 are referring to the same object");
        } else {
            System.out.println("Both e1 and e2 are not referring to same object");
        }
    }
}