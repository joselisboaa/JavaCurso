package application;

import java.util.Scanner;
import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee.employeeData());
        System.out.print("Which percentage to increase salary? ");
        employee.salaryIncrease(sc.nextDouble());

        employee.newData();
    }
}