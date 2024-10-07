package step1.chap8;

import java.util.Scanner;

public class 중앙이동알고리즘 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();

        // 한 변에 있는 점의 개수는 2^N + 1
        int pointsPerSide = (int) Math.pow(2, N) + 1;

        // 전체 점의 개수는 pointsPerSide^2
        int totalPoints = pointsPerSide * pointsPerSide;

        // 결과 출력
        System.out.println(totalPoints);

        scanner.close();
    }
}
