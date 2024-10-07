package step2.chap11;

import java.util.Scanner;

public class 접근적표기1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // f(n)의 계수 a1과 a0 입력
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();

        // 상수 c 입력
        int c = sc.nextInt();

        // n0 입력
        int n0 = sc.nextInt();

        // O(n) 정의를 만족하는지 확인
        boolean isBigO = true;

        // 조건 확인: f(n) = a1 * n + a0가 O(n) 정의를 만족하는지 확인
        for (int n = n0; n <= 100; n++) {
            if (a1 * n + a0 > c * n) {
                isBigO = false;
                break;
            }
        }

        // 결과 출력
        if (isBigO) {
            System.out.println(1); // O(n) 정의를 만족
        } else {
            System.out.println(0); // O(n) 정의를 만족하지 않음
        }




    }
}
