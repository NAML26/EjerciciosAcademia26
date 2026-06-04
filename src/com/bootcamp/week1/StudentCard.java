package com.bootcamp.week1;
import java.util.Scanner;
import java.time.*;

public class StudentCard {
    public static void main  (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Age: ");
        String age = scanner.nextLine();

        System.out.println("Fav Language: ");
        String favLanguage = scanner.nextLine();

        String date = LocalDate.now().toString();

        System.out.println("*********************************");
        System.out.printf("*   STUDENT CARD                *%n");
        System.out.printf("*   Name: %-22s*%n", name);
        System.out.printf("*   Age: %-23s*%n", age);
        System.out.printf("*   Fav Language: %-14s*%n", favLanguage);
        System.out.printf("*   Date: %-22s*%n", date);
        System.out.println("*********************************");

        scanner.close();

    }
}
