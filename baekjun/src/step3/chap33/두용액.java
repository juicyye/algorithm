package step3.chap33;

import java.util.Arrays;
import java.util.Scanner;

public class 두용액 {
    public static void main(String[] args) {
        // 산성 용액과 알카리성 용액을 보유하고 있다
        // 산성 용액의 특성값은 1~1,000,000,000 // 알칼리성 특성값은 -1~ -1,000,000,000
        // 두 용액을 합쳐서 특성값이 0에 가까운 용액을 만들려고 한다
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 투 포인터 초기화
        int lt = 0;
        int rt = N - 1;

        int minSum = Integer.MAX_VALUE;  // 최소 합 저장
        int[] result = new int[2];       // 결과 저장

        while (lt < rt) {
            int sum = arr[lt] + arr[rt]; // 두 용액의 합

            // 현재 합이 0에 더 가까우면 결과 갱신
            if (Math.abs(sum) < minSum) {
                minSum = Math.abs(sum);
                result[0] = arr[lt];
                result[1] = arr[rt];
            }

            // 합이 0보다 크면 rt를 줄이고, 작으면 lt를 늘린다
            if (sum > 0) {
                rt--;
            } else {
                lt++;
            }
        }

        // 결과 출력 (오름차순으로 출력)
        System.out.println(result[0] + " " + result[1]);
    }
}
