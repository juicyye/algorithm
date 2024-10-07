package etc.이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 랜선자르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int K = sc.nextInt(); // 가지고 있는 랜선의 개수
        int N = sc.nextInt(); // 필요한 랜선의 개수

        long[] lines = new long[K];
        long max = 0;

        // 각 랜선의 길이 입력받기
        for (int i = 0; i < K; i++) {
            lines[i] = sc.nextLong();
            max = Math.max(max, lines[i]);
        }

        // 이진 탐색
        long left = 1;
        long right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;

            // 현재 길이(mid)로 잘랐을 때 나오는 랜선의 개수 계산
            for (long line : lines) {
                count += line / mid;
            }

            if (count >= N) { // 랜선을 N개 이상 만들 수 있는 경우
                answer = mid;
                left = mid + 1;
            } else { // 랜선을 N개 만들 수 없는 경우
                right = mid - 1;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}