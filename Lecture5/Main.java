package Lecture5;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.print("\n");

        }

        // another pattern
        System.out.print("\n------------\n\n");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.print("\n");

        }
        System.out.print("\n------------\n");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {

                System.out.print(" * ");

            }
            System.out.print("\n");

        }
    }
}
