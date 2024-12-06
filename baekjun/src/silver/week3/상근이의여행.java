package silver.week3;

import java.util.Scanner;

public class 상근이의여행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 수
        while (t-- > 0) {
            int n = sc.nextInt(); // 국가 수
            int m = sc.nextInt(); // 비행기 수

            // 간선 정보를 입력받지만 사용할 필요는 없음
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
            }

            // 최소 간선 개수는 국가 수 - 1
            System.out.println(n - 1);
        }
        sc.close();
    }
}
