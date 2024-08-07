package com.corejava.Exception;

import java.util.Scanner;

public class EmpChat {
    String name;
    String id;
    double salary;

    EmpChat(String name, String id, double salary) throws InvalidNameException, InvalidIdException, InvalidSalaryException {
        if ((name.charAt(0) >= 'a' && name.charAt(0) <= 'z') || (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
            this.name = name;
        } else {
            throw new InvalidNameException();
        }

        boolean validId = true;
        for (char c : id.toCharArray()) {
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                validId = false;
                break;
            }
        }

        if (validId) {
            this.id = id;
        } else {
            throw new InvalidIdException();
        }

        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new InvalidSalaryException();
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Main Start");
        System.out.println("How Many Employe To Insert");
        int count = s.nextInt();
        Employe[] arr = new Employe[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Id:");
            String id = s.next();
            System.out.println("Enter Name:");
            String name = s.next();
            System.out.println("Enter Salary:");
            double salary = s.nextDouble();
            try {
                arr[i] = new Employe(name, id, salary);
                System.out.println("Employee Was Added");
            } catch (InvalidIdException | InvalidNameException | InvalidSalaryException e) {
                System.out.println(e.getMessage());
                System.out.println("Employee Not Added");
                i--; // Retry input for the same index
            }
        }
        for (Employe E : arr) {
            if (E != null) {
                E.display();
            }
        }
    }
}
