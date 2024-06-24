package Lecture7;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chkPrime = sc.nextInt();
        CheckPrime(chkPrime);
        int chkEven = sc.nextInt();
        checkEven(chkEven);
        int table = sc.nextInt();
        printTable(table);

    }

    public static void CheckPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime NUMBER");
        }

    }

    public static void checkEven(int num) {

        if (num % 2 == 0) {
            System.out.println("Even Number");

        } else {
            System.out.println("Odd Number");

        }

    }

    public static void printTable(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }

}