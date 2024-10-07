package step1.chap2;

import java.util.Scanner;

public class 주사위세개 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 같은 눈의 개수를 판별하기 위해 if-else 구조 단순화
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);  // 3개의 눈이 같을 때
        } else if (a == b || a == c) {
            System.out.println(1000 + a * 100);    // 2개의 눈이 같을 때 (a와 b 혹은 a와 c)
        } else if (b == c) {
            System.out.println(1000 + b * 100);    // 2개의 눈이 같을 때 (b와 c)
        } else {
            System.out.println(100 * Math.max(a, Math.max(b, c)));  // 모두 다른 눈일 때
        }
    }
}
