package Lecture2;

import java.util.Scanner;

public class circleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the circumference and area
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        // Close the scanner
        scanner.close();
    }
}
