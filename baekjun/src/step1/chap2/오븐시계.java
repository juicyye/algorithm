package step1.chap2;

import java.util.Scanner;

public class 오븐시계 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = a * 60 + b + c;

        int h = result / 60;
        int m = result % 60;
        if (h >= 24) {
            h -= 24;
        }
        if (m >= 60) {
            m -= 60;
        }
        System.out.println(h + " " + m);


    }
}
