package basic.week1;

import java.util.Scanner;

public class 팩토리얼 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = recursion(n);
        System.out.println(result);
    }

    public static int recursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }


        return n * recursion(n - 1);
    }
}
