package step1.chap10;

import java.util.Scanner;

public class 직사각형에서탈출 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();


        int leftDistance = x;               // 왼쪽 경계까지의 거리
        int rightDistance = w - x;          // 오른쪽 경계까지의 거리
        int bottomDistance = y;              // 아래쪽 경계까지의 거리
        int topDistance = h - y;             // 위쪽 경계까지의 거리

        // 최솟값 계산
        int result = Math.min(Math.min(leftDistance, rightDistance),
                Math.min(bottomDistance, topDistance));

        // 결과 출력
        System.out.println(result);

        sc.close();


    }
}
