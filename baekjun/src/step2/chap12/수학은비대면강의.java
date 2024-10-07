package step2.chap12;

import java.util.Scanner;

public class 수학은비대면강의 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        // 가감법을 통해 y를 먼저 구합니다.
        int y = (c * d - a * f) / (b * d - a * e);

        // y 값을 이용해 x 값을 구합니다.
        int x = (c - b * y) / a;

        System.out.println(x + " " + y);

    }
}
