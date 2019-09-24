import java.util.Scanner;

public class RecursionPractice {

    private static int Fibonacci(int index) {
        return (index > 1) ? Fibonacci(index - 1) + Fibonacci(index - 2) : index;
    }

    private static int factorial(int index) {
        return (index > 1) ? index * factorial(index - 1) : 1;
    }

    public static void main(String[] args) {

        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            System.out.print(factorial(i) + " ");
        }
    }
}
