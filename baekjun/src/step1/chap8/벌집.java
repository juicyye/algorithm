package step1.chap8;

import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();

        // 시작점이 1번 방이면 바로 출력
        if (N == 1) {
            System.out.println(1);
            return;
        }

        int layer = 1; // 현재 층 (첫번째는 1번 방이므로 1로 시작)
        int range = 2; // 방 범위, 2번부터 시작하므로 2로 설정

        // N이 현재 층에 속할 때까지 계속 층을 증가
        while (range <= N) {
            range += 6 * layer; // 각 층마다 6 * layer 개의 방이 추가됨
            layer++;
        }

        // 결과 출력
        System.out.println(layer);

        scanner.close();
    }
}
