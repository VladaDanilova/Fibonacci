import java.util.Scanner;

/**
 * @author vladadanilova
 */
/*
Given an integer 𝑛, find the last digit of the 𝑛th Fibonacci number
 */

public class LastDigitFib {

    private static int getFibonacciLastDigit(int n) {
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++)
        {
            array[i] = (array[i - 1] + array[i - 2]) % 10;
            //it's faster than compute all fib numbers and find out the last digit in the end
        }
        return array[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}
