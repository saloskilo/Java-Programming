package Lecture15;

public class Recursion {
    // print 5 to 1
    public static void printNumber(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNumber(n - 1);
    }

    // print 1 to 5
    public static void printNumbers(int n) {
        if (n == 6)
            return;
        System.out.println(n);
        printNumbers(n + 1);
    }

    // print sum of first natural numbers
    public static void printSum(int numbers, int n, int sum) {
        if (numbers == n)

        {
            sum += numbers;
            System.out.println(sum);

            return;
        }
        sum += numbers;
        printSum(numbers + 1, n, sum);
    }

    // factorial of a number
    public static int calcFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        System.out.println(n);

        int fact_nm1 = calcFactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    // fibonacchi series
    public static void printFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {
        // print 5 to 1
        printNumber(5);

        // print 1 to 5
        printNumbers(1);

        // print sum of first n numbers
        // printSum(1,3,0);

        // factorial of a number
        // int factorial= calcFactorial(5);
        // System.out.println(factorial);

        // Fibonacchi series 
        // int a = 0, b = 1;
        // System.out.print(a+" ");
        // System.out.print(b+" ");
        // int n = 15; // Number of terms in the Fibonacci sequence to print
        // printFib(a, b, n - 2);

    }
}
