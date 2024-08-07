package com.corejava.Exception;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;

        if (salary <= 0) {
            throw new InvalidSalaryException();
        } else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", salary: " + salary;
    }

    public static void main(String[] args) {
        // Example usage:
        try {
            Employee s = new Employee("vaibhav", 450);
            System.out.println(s);
            Employee d = new Employee("amol", -500);
            System.out.println(d);
        } catch (InvalidSalaryException e) {
            System.out.println("Invalid salary: " + e.getMessage());
        }
    }
}
