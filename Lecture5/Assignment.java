package Lecture5;

public class Assignment {
    public static void main(String[] args) {

        // pattern Rhombus
        int n = 5;
        int m = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        // pattern Rhombus reverse
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        // number pyramid
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        System.out.println("---------------------");
        // palindromic number pyramid.
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("---------------------");

    }
}
