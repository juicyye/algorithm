package step1.chap4;

import java.util.Scanner;

public class 바구니뒤집기 {
    public static void main(String[] args) {
        // 도현이는 바구니를 n개 가지고 있고 각각 바구니에 1~N번이 순서대로 적혀져 있다
        // 앞으로 M번 바구니 순서를 역순으로 만들려고 한다
        // 순서를 역순으로 바꿀 때 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 바구니 개수
        int m = sc.nextInt();  // 역순으로 만들 횟수

        int[] data = new int[n+1];  // 1부터 N까지 바구니 번호 사용 (0번은 사용하지 않음)
        for (int i = 1; i <= n; i++) {
            data[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();  // 시작 범위
            int b = sc.nextInt();  // 끝 범위

            // a부터 b까지 역순으로 바꾸기
            while (a < b) {
                int temp = data[a];
                data[a] = data[b];
                data[b] = temp;
                a++;
                b--;
            }
        }

        // 결과 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
