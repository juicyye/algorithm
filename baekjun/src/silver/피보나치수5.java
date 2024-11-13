package silver;

import java.util.Scanner;

public class 피보나치수5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;

        }

        if (n == 0) {
            System.out.println(a);  // F(0)일 경우
        } else if (n == 1) {
            System.out.println(b);  // F(1)일 경우
        } else {
            System.out.println(b);  // F(n)일 경우
        }
    }

}
