package step1.chap10;

import java.util.Scanner;

public class 직사각형에서탈출 {
    public static void main(String[] args) {
        // 한수는 지금 (x,y)에 있다. 직사각형은 각 변이 좌표축이 평행하고
        // 왼쪽 아래 꼭지점은 (0,0), 오른쪽 아래 꼭지점은 (w,h)에 있다.
        // 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // 각각의 거리 계산
        int distanceToLeft = x;               // 왼쪽 경계까지의 거리
        int distanceToRight = w - x;          // 오른쪽 경계까지의 거리
        int distanceToBottom = y;              // 아래쪽 경계까지의 거리
        int distanceToTop = h - y;             // 위쪽 경계까지의 거리

        // 최솟값 계산
        int minDistance = Math.min(Math.min(distanceToLeft, distanceToRight),
                Math.min(distanceToBottom, distanceToTop));

        // 결과 출력
        System.out.println(minDistance);

        sc.close();


    }
}
