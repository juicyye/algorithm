package basic.week1;

import java.util.Scanner;

public class 알고리즘수업피보나치수1 {
    private static int fib = 0;
    private static int dynamic = 0;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n+1];
        arr[1] = arr[2] = 1;

        fib(n);
        fibonacci(n);

        System.out.println(fib + " " + dynamic);
    }

    private static int fib(int n) {
        if(n == 1 || n == 2) {
            fib++;
            return 1;
        }
        return (fib(n - 1) + fib(n - 2));
    }

    private static int fibonacci(int n) {

        for (int i = 3; i <= n; i++) {
            arr[n] = arr[n-1] + arr[n-2];
            dynamic++;
        }
        return arr[n];
    }
}
