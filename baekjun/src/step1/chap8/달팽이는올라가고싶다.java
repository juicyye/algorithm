package step1.chap8;

import java.util.Scanner;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a: 낮에 올라가는 미터, b: 밤에 떨어지는 미터, v: 정상 미터
        // v-b-1은 마지막 날 도착전까지 남은거리
        // a-b는 하루에 올라가는 거리
        // 마지막 날에 도달하는 경우를 위해 하루를 더 추가

        // 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        // 마지막 날에 도달하기 전까지 필요한 높이
        int days = (V - B - 1) / (A - B) + 1;

        // 결과 출력
        System.out.println(days);

        scanner.close();
    }
}
