package step1.chap9;

import java.util.Scanner;

public class 소수 {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = -1;

        // M부터 N까지 소수 찾기
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                if (min == -1) { // 최솟값을 아직 찾지 않았다면
                    min = i;
                }
            }
        }

        // 결과 출력
        if (min == -1) { // 소수를 찾지 못한 경우
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }
}
