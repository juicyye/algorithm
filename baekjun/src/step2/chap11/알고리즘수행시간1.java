package step2.chap11;

import java.util.Scanner;

public class 알고리즘수행시간1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 크기 n을 받음
        int n = sc.nextInt();

        // 수행 횟수는 항상 1회
        System.out.println(1);

        // 시간 복잡도는 O(1) 이므로 최고차항의 차수는 0
        System.out.println(0);
    }
}
