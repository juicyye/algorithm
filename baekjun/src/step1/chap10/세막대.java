package step1.chap10;

import java.util.Arrays;
import java.util.Scanner;

public class 세막대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 막대의 길이를 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 세 막대의 길이를 오름차순으로 정렬
        int[] sticks = {a, b, c};
        java.util.Arrays.sort(sticks);

        // 삼각형을 만들 수 있는 조건
        while (sticks[0] + sticks[1] <= sticks[2]) {
            sticks[2]--; // 가장 긴 막대의 길이를 줄임
        }

        // 최대로 만들 수 있는 삼각형의 둘레 출력
        int perimeter = sticks[0] + sticks[1] + sticks[2];
        System.out.println(perimeter);
    }
}
