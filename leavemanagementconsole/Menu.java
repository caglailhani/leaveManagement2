package com.mycompany.leavemanagementconsole;

import java.util.Scanner;

public class Menu {

    public void showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Leave Management System");
            System.out.println("1. Çalışan Ekle");
            System.out.println("2. İzin Girişi Yap");
            System.out.println("3. Çalışanları Listele");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    enterLeave();
                    break;
                case 3:
                    listEmployees();
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private void addEmployee() {
        System.out.println("Çalışan ekleme ekranı...");
        // Çalışan ekleme işlemleri burada yapılacak
    }

    private void enterLeave() {
        System.out.println("İzin giriş ekranı...");
        // İzin giriş işlemleri burada yapılacak
    }

    private void listEmployees() {
        System.out.println("Çalışan listeleme ekranı...");
        // Çalışanları listeleme işlemleri burada yapılacak
    }
}
