package step1.chap3;

import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        int result = 0;


        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            result += a*b;
        }
        if (x == result) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }
}
