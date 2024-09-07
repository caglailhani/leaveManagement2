package com.example.leavemanagementconsole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Leave Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Add Leave");
            System.out.println("4. View Leaves");
            System.out.println("5. Exit");

            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    addLeave();
                    break;
                case 4:
                    viewLeaves();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    public static void addEmployee() {
        // Employee ekleme işlemleri burada tanımlanacak
        System.out.println("Employee added.");
    }

    public static void viewEmployees() {
        // Çalışanları görüntüleme işlemleri burada tanımlanacak
        System.out.println("Employees viewed.");
    }

    public static void addLeave() {
        // İzin ekleme işlemleri burada tanımlanacak
        System.out.println("Leave added.");
    }

    public static void viewLeaves() {
        // İzinleri görüntüleme işlemleri burada tanımlanacak
        System.out.println("Leaves viewed.");
    }
}
